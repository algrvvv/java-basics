package sockets.practice.decoderEncoder;

public class ClientSide {
    public static void main(String[] args) {
        if (args.length == 2 && (args[0].equals("-d") || args[0].equals("--decode"))) {
            System.out.println("decode string: " + args[1]);
        } else if (args.length == 2 && (args[0].equals("-e") || args[0].equals("--encode"))) {
            System.out.println("encode string: " + args[1]);
        } else {
            System.out.println("invalid args");
        }
    }
}
