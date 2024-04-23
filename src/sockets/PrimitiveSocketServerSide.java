package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class PrimitiveSocketServerSide {
    public static void main(String[] args) throws IOException {
        // в этом примере и в примере с клиентом try служит заменой with() в питоне
        try (ServerSocket serverSocket = new ServerSocket(8189);
             Socket socket = serverSocket.accept();
             Scanner inputScanner = new Scanner(socket.getInputStream())) {
            // функцией accept() сокет лочиться до момента получения запроса на наш сервер
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            while (inputScanner.hasNextLine()) {
                String input = inputScanner.next();
                System.out.println(input);
                writer.println("you've send: " + input);
                if (input.equals("exit")) {
                    break;
                }
            }
        }
    }
}
