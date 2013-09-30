package edu.macalester.comp124.hw4;

import java.util.regex.Pattern;

/**
 * Utility methods for parsing html. 
 * 
 * @author shilad
 */
public class HtmlUtils {
	
	/**
	 * Strips tags from html to make it a bit more human readable.
	 * @param html The unstripped html.
	 * @return The stripped text.
	 */
	public static String strip(String html) {
		int i = html.indexOf("<body");
		String text = (i >= 0) ? html.substring(i) : html;
		Pattern p = Pattern.compile("<style.*?style>", Pattern.MULTILINE|Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		text = p.matcher(text).replaceAll("");
		Pattern p2 = Pattern.compile("<script.*?script>", Pattern.MULTILINE|Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		text = p2.matcher(text).replaceAll("");
		text = text.replaceAll("<.+?>", "");
		text = text.replaceAll("\\s+", " ");
		return text;
	}

}
