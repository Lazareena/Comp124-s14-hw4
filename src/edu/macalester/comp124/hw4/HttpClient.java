package edu.macalester.comp124.hw4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * Retrieves the contents of some url in string format.
 * 
 * @author shilad
 */
public class HttpClient {
	
	/**
	 * Retrieves the contents of the passed in URL object.
	 * @param urlString
	 * @return
	 */
	public String retrieve(String urlString) {
		BufferedInputStream stream;
		String result = "";
		try {
			URL url = new URL(urlString);
			stream = new BufferedInputStream(url.openStream());
			while (stream.available() > 0) {
				result += (char)stream.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
