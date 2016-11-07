package Network_Lab5;

import java.io.*;
import java.net.*;

public class SourceViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length > 0) {
			InputStream in = null;
			try {
				URL u = new URL(args[0]);
				in = u.openStream();
				in = new BufferedInputStream(in);
				Reader r = new InputStreamReader(in);
				int c;
				while((c = r.read()) != -1) {
					System.out.print((char) c);
				}
			} catch(MalformedURLException ex) {
				System.err.println(args[0] + " is not a parseable URL");
			} catch(IOException ex) {
				System.err.println(ex);
			} finally {
				if(in != null) {
					try {
						in.close();
					} catch(IOException ex) {
						
					}
				}
			}
		}
	}

}
