import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


import javax.net.ssl.HttpsURLConnection;

public class Translate {
public static void main(String[] args) {
	
	URL url;
    try {
        // get URL content

       String a="http://online.ectaco.com/main.jsp?do=e-services-dictionaries-word_translate1&direction=1&status=translate&lang1=23&lang2=bg&source=know";
        url = new URL(a);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

       // open the stream and put it into BufferedReader
        BufferedReader br = new BufferedReader(
                           new InputStreamReader(conn.getInputStream()));

       String inputLine;
        while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
        }
        br.close();

       System.out.println("Done");

   } catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}