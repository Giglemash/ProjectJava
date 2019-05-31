package main.server2;


import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter    out= null;

        ServerSocket servers = null;
        Socket       fromclient = null;

        try {
            servers = new ServerSocket(4444);
        } catch (IOException e) {
            System.out.println("Проблемы с портом");
            System.exit(-1);
        }

        try {
            System.out.print("Ждем подключения клиента");
            fromclient= servers.accept();
            System.out.println("Клиент подключился");
        } catch (IOException e) {
            System.out.println("Ошибка №1");
            System.exit(-1);
        }

        in  = new BufferedReader(new
                InputStreamReader(fromclient.getInputStream()));
        out = new PrintWriter(fromclient.getOutputStream(),true);
        String         input,output;

        System.out.println("Ждем сообщения:");
        while ((input = in.readLine()) != null) {
            if (input.equalsIgnoreCase("стоп")) break;
            out.println("S ::: "+input);
            System.out.println(input);
        }
        out.close();
        in.close();
        fromclient.close();
        servers.close();
    }
}