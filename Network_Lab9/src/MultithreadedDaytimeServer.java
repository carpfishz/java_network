import java.net.*;
import java.io.*;
import java.util.*;

public class MultithreadedDaytimeServer {

	public final static int PORT = 13;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ServerSocket server = new ServerSocket(PORT)) {
			while(true) {
				try {
					Socket connection = server.accept();
					Thread task = new DaytimeThread(connection);
					task.start();
				} catch(IOException ex) {
					
				}
			}
		} catch(IOException ex) {
			System.err.println("Couldn't start server");
		}
	}
	
	private static class DaytimeThread extends Thread {
		private Socket connection;
		
		public DaytimeThread(Socket connection) {
			// TODO Auto-generated constructor stub
			this.connection = connection;
		}
		
		public void run() {
			try {
				Writer out = new OutputStreamWriter(connection.getOutputStream());
				Date now = new Date();
				out.write(now.toString() + "\r\n");
				out.flush();
			} catch(IOException ex) {
				System.err.println(ex);
			} finally {
				try {
					connection.close();
				} catch(IOException e) {
					
				}
			}
		}
	}

}
