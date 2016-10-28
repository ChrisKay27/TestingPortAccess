package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Chris on 10/27/2016.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8081);//"104.155.168.101"
        System.out.println("Connected to server");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter out =
                new PrintWriter(s.getOutputStream(), true);

        System.out.println("Saying Hello");
        out.println("Hello");

        System.out.println("Response:");
        System.out.println(in.readLine());

        String userInput;
        while ((userInput = br.readLine()) != null) {
            out.println(userInput);
            System.out.println("echo: " + in.readLine());
        }
//        while(s.isConnected()){
//            bw.write(br.readLine());
//
//            while(!servIn.ready());
//
//            System.out.println(servIn.readLine());
//        }
        System.out.println("End");
    }
}
