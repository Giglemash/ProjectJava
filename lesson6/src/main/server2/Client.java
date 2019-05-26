package main.server2;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket fromserver = null;

        if (args.length==0) {
            System.out.println("Привет пользователь");
            System.exit(-1);
        }

        System.out.println("Подключение... "+args[0]);

        fromserver = new Socket(args[0],4444);
        BufferedReader in  = new BufferedReader(new InputStreamReader(fromserver.getInputStream()));
        PrintWriter    out = new PrintWriter(fromserver.getOutputStream(),true);
        BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));

        String fuser,fserver;

        while ((fuser = inu.readLine())!=null) {
            out.println(fuser);
            fserver = in.readLine();
            System.out.println(fserver);
            if (fuser.equalsIgnoreCase("закрыть")) break;
            if (fuser.equalsIgnoreCase("выход")) break;
        }

        out.close();
        in.close();
        inu.close();
        fromserver.close();
    }
}