package Network_Lab5;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class CookieManagerExample {
	
//	private final static String URL_STRING = "https://www.google.com";
//	private final static String URL_STRING = "http://www.coupang.com/";
	private final static String URL_STRING = "http://www.naver.com/";
	
	public CookieManagerExample() {}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		CookieManager cookieManager = new CookieManager();
		CookieHandler.setDefault(cookieManager);
		
		URL url = new URL(URL_STRING);
		
		URLConnection connection = url.openConnection();
		
		connection.getContent();
		
		CookieStore cookieStore = cookieManager.getCookieStore();
		
		List<HttpCookie> cookieList = cookieStore.getCookies();
		
		for(HttpCookie cookie: cookieList) {
			System.out.println("Domain: " + cookie.getDomain());
			System.out.println("max age: " + cookie.getMaxAge());
			System.out.println("name of cookie: " + cookie.getName());
			System.out.println("server path: " + cookie.getPath());
			System.out.println("is cookie secure: " + cookie.getSecure());
			System.out.println("value of cookie: " + cookie.getValue());
			System.out.println("version of cookie: " + cookie.getVersion());
		}
	}

}
