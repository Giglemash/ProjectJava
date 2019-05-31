package Lesson_6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;


public class MainServer {

    private Vector<ClientHandler> clients;

    private void adresMes(String fromNick, String msg) {
        String[] mesAdres = msg.split(" ");
        if (mesAdres.length < 3) return;

        String toNick = mesAdres[1];
        String mess = msg.substring(toNick.length() + 3);

        for (ClientHandler o : clients) {
            String clientNick = o.getNick();
            if (clientNick.equals(toNick) || clientNick.equals(fromNick))
                o.sendMsg("from: " + fromNick + " to: " + toNick + " " + mess);
        }
    }

    public MainServer() throws SQLException {
        ServerSocket server = null;
        Socket socket = null;
        clients = new Vector<>();

        try {
            AuthService.connect();

           // System.out.println(AuthService.getNickByLoginAndPass("login12", "pass1"));

            server = new ServerSocket(8189);
            System.out.println("Сервер запущен");

            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(socket, this);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            AuthService.disconnect();
        }
    }

    // метод рассылки
    public void broadCastMsg(String nick, String msg) {
        if (msg.startsWith("/w")) adresMes(nick, msg);
        else
            for (ClientHandler o : clients) {
                o.sendMsg(nick + ": " + msg);
            }
    }

    // подписываем клиента на рассылку
    public void subscribe(ClientHandler client) {
        clients.add(client);
    }

    // отписываем клиента от рассылки сообщений
    public void unsubscribe(ClientHandler client){
        clients.remove(client);
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler o: clients) {
            o.sendMsg(msg);
        }
    }
    //проверка логинов
    public boolean checkExistClient(String nickName) {
        for (ClientHandler o: clients) {
            if (nickName.equals(o.getNick())) return true;
        }
        return false;
    }
}


