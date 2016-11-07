package Network_Lab5;

import java.io.*;
import java.net.*;

public class DMoz {

  private final static String USER_AGENT = "Mozilla/5.0";
  
  public static void main(String[] args) {

    String target = "";
    for (int i = 0; i < args.length; i++) {
      target += args[i] + " ";
    }
    target = target.trim();
    
    QueryString query = new QueryString();
    query.add("q", target);
    try {
//      URL u = new URL("http://www.dmoz.org/search/q?" + query);
//      URL u = new URL("http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=" + query);
      URL u = new URL("https://www.google.com/search?q=?" + query);
      
      HttpURLConnection con = (HttpURLConnection) u.openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("User-Agent", USER_AGENT);
      try (InputStream in = new BufferedInputStream(u.openStream())) {
        InputStreamReader theHTML = new InputStreamReader(in);
        int c;
        while ((c = theHTML.read()) != -1) {
          System.out.print((char) c);
        } 
      }
    } catch (MalformedURLException ex) {
      System.err.println(ex);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}