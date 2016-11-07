package Network_Lab5;

import java.io.*;
import java.net.*;

public class ContentGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length > 0) {
			try {
				URL u = new URL(args[0]);
				Object o = u.getContent();
				System.out.println("I got a " + o.getClass().getName());				
			} catch(MalformedURLException ex) {
				System.err.println(args[0] + " is not a parseable URL");
			} catch(IOException ex) {
				System.err.println(ex);
			}
		}
	} 

}


//WAN(Internet)
//Data Center - FatTree
//Cluster Network - 3d 구조로 node연결, 정형화된 네트워크에서 사용
//LAN
//Network on chip
