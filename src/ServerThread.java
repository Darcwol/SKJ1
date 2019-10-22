import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
			String line;
			int res = 0;
			while((line = in.readLine()) != null && !line.isEmpty())
			{
				String[] numbers = line.split(" ");
				for(String num : numbers){
					res += Integer.parseInt(num);
				}
			}
			 
			out.println("HTTP/1.1 200 OK");
			out.println();
			out.println("Result: " + res);
		} catch (IOException e1) {
			// do nothing
		}
		
		try {
			socket.close();
		} catch (IOException e) {
			// do nothing
		}
	}
}