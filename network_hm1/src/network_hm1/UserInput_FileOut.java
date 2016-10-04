//B289070_Lee_Sangmin

package network_hm1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.codec.binary.Base64OutputStream;

public class UserInput_FileOut {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("input data : ");
		String text = scan.nextLine();
		
		try {
//			fos = new FileOutputStream("B289070_LeeSangmin.txt");
//			GZIPOutputStream gzos = new GZIPOutputStream(fos);
//			Base64OutputStream b64os = new Base64OutputStream(gzos);
//			b64os.write(text.getBytes("UTF-8"));
//			b64os.close();
			
			fos = new FileOutputStream("B289070_LeeSangmin.txt");
			Base64OutputStream b64os = new Base64OutputStream(fos);
			GZIPOutputStream gzos = new GZIPOutputStream(b64os);
			gzos.write(text.getBytes("UTF-8"));
			gzos.close();
		} catch(FileNotFoundException FNFE) {
			System.err.println(FNFE.getMessage());
		} catch(IOException IOE) {
			System.err.println(IOE.getMessage());
		}
		
	}
	
}
