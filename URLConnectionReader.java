import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URLConnectionReader {
	public static void main (String args[]) {
		
		URL targetURL = null;
		try {
			targetURL = new URL(args[0].trim());

		URLConnection targetConn = targetURL.openConnection();
		
		BufferedReader inBufRead = new BufferedReader(new InputStreamReader(targetConn.getInputStream()));
		
		String inputLine;
		while ((inputLine = inBufRead.readLine()) != null)
			System.out.println(inputLine);
			
		inBufRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}