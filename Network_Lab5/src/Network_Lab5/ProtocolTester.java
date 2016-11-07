package Network_Lab5;

import java.net.*;

public class ProtocolTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testProtocol("http://www.adc.org");
		testProtocol("http://www.amazon.com/exec/obidos/order2/");
		testProtocol("ftp://ibiblio.org/pub/languages/java/javafaq/");
		testProtocol("mailto:elharo@ibiblio.org");
		testProtocol("telnet://dibner.poly.edu/");
		testProtocol("file://C:\\Users\\Administrator\\Desktop\\r.txt");
		testProtocol("gopher://gopher.anc.org.za/");
		testProtocol("ldap://ldap.itd.umich.edu/o=University%20of%20Michigan,c=US?postalAddress");
		testProtocol("jar:http://cafeaulait.org/books/javaio/ioexamples/javaio.jar!" + "/com/macfaq/io/StreamCopier.class");
		testProtocol("nfs://utopia.poly.edu/usr/tmp/");
		testProtocol("jdbc:mysql://luna.ibiblio.org:3306/NEWS");
		testProtocol("rmi://ibiblio.org/RenderEngine");
		testProtocol("doc:/UsersGuide/release.html");
		testProtocol("netdoc:/UsersGuide/release.html");
		testProtocol("systemresource://www.adc.org/+/index.html");
		testProtocol("verbatim:http://www.adc.org/");
	}
	
	private static void testProtocol(String url) {
		try {
			URL u = new URL(url);
			System.out.println(u.getProtocol() + " is supported");
		} catch(MalformedURLException ex) {
			String protocol = url.substring(0, url.indexOf(':'));
			System.out.println(protocol + " is not supported");
		}
	}

}
