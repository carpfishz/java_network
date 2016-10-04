//B289070_Lee_Sangmin

package network_hm1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.apache.commons.codec.binary.Base64InputStream;

public class UserOutput_FileIn {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = null;
		String text;
		
		try {
//			fis = new FileInputStream("B289070_LeeSangmin.txt");
//			GZIPInputStream gzis = new GZIPInputStream(fis);
//			Base64InputStream b64is = new Base64InputStream(gzis);
//			byte arr [] = new byte[100];
//			b64is.read(arr);
//			text = new String(arr);
//			System.out.println("text : " + text);
			
			fis = new FileInputStream("B289070_LeeSangmin.txt");
			Base64InputStream b64is = new Base64InputStream(fis);
			GZIPInputStream gzis = new GZIPInputStream(b64is);
			byte arr [] = new byte[100];
			gzis.read(arr);
			text = new String(arr);
			System.out.println("text : " + text);
		} catch(FileNotFoundException FNFE) {
			System.err.println(FNFE.getMessage());
		} catch(IOException IOE) {
			System.err.println(IOE.getMessage());
		}

	}

}
