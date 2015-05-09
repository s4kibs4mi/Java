import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HostSocket extends Thread {
    private int port = 1234;
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;

    public HostSocket() {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(port);
                    System.out.println("Server is waiting for client...");
                    socket = serverSocket.accept();
                    outputStream = new DataOutputStream(socket.getOutputStream());
                    HostSocket.this.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

    @Override
    public void run() {
        try {
            inputStream = new DataInputStream(socket.getInputStream());
        } catch (Exception ex) {

        }

        while (true) {
            try {
                String input = inputStream.readUTF();
                System.out.println("Client : " + input);
                if (input.contains("hello")) {
                    outputStream.writeUTF("Hi");
                } else if (input.contains("how") && input.contains("are")) {
                    outputStream.writeUTF("Fine. You ?");
                } else {
                    outputStream.writeUTF("মাথার উপড়ে দিয়া গেসে  :P !!!");
                }
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

        }
    }

    public static void main(String args[]) {
        new HostSocket();
    }
}
