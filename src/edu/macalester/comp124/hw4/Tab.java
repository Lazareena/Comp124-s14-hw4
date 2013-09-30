package edu.macalester.comp124.hw4;

/**
 * Displays a single web page with a max character length
 * .
 * @author shilad
 */
public class Tab {
	private String url;
	private String text;
	private HttpClient client;
	private int maxLength;
	
	public Tab(int maxLength) {
		url = null;
		text = null;
		client = new HttpClient();
		this.maxLength = maxLength;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
		this.text = client.retrieve(url);
	}
	
	public String getDisplayedText() {
		String humanFriendly = HtmlUtils.strip(text);
		if (humanFriendly.length() > maxLength) {
			humanFriendly = humanFriendly.substring(0, maxLength);
		}
		return humanFriendly;
	}
}
