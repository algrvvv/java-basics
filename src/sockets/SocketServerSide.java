package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerSide {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        }
    }
}

class MyServer implements Runnable {
    Socket socket;

    public MyServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(this.socket.getInputStream())) {
            PrintWriter writer = new PrintWriter(this.socket.getOutputStream());
            if (scanner.hasNextLine()) {
                writer.println("you write: " + scanner.next());
            }
        } catch (IOException e) {
            // e.printStackTrace(); -> логирование
            throw new RuntimeException(e);
        }
    }
}