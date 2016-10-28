package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
	// write your code here
        ServerSocket ss = new ServerSocket(Integer.valueOf(args[0]));
        while(true){

            Socket s = ss.accept();

            System.out.println("Connected to client");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);



            while (s.isConnected()) {
                String input = br.readLine();
                System.out.println("Read: " + input);
                out.println(input);

            }

            System.out.println("Disconnected from client");

        }

    }
}
