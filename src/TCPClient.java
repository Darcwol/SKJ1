import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String address =
                //"localhost"
                "172.21.217.1"
                ;
        int port = 3333;
        try {
            socket = new Socket(address, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (UnknownHostException e) {
            System.out.println("Unknown host");
            System.exit(-1);
        }
        catch  (IOException e) {
            System.out.println("No I/O");
            System.exit(-1);
        }

        try {
            //out.println("REGISTER Kiril_Maneichyk 172.21.217.132");
            out.println("LIST");
            //out.println("CALL ADDER 1 2 3 4");

            System.out.println(in.readLine());
        }
        catch (IOException e) {
            System.out.println("Error during communication");
            System.exit(-1);
        }

        try {
            socket.close();
        }
        catch (IOException e) {
            System.out.println("Cannot close the socket");
            System.exit(-1);
        }

    }
}