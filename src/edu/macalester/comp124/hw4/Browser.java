package edu.macalester.comp124.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * A browser maintains a set of tabs.
 * @author shilad
 */
public class Browser {
	private List<Tab> tabs = new ArrayList<Tab>();
	private int displayedIndex = -1;

	/**
	 * Default constructor.
	 */
	public Browser() {}
	
	/**
	 * Adds a new tab and makes it the current tab.
	 * @param tab
	 */
	public void addTab(Tab tab) {
		this.tabs.add(tab);
		displayedIndex = this.tabs.size() - 1;
	}
	
	/**
	 * Makes the current tab the i'th tab (i is 0-indexed).
	 * @param i
	 */
	public void setDisplayedTab(int i) {
		displayedIndex = i;
	}

	/**
	 * Returns the current tab.
	 * @return
	 */
	public Tab getDisplayedTab() {
		return getTab(displayedIndex);
	}
	
	/**
	 * Returns the index of the current tab.
	 * @return
	 */
	public int getDisplayedTabIndex() {
		return displayedIndex;
	}
	
	/**
	 * Returns the i'th tab (i is 0-indexed).
	 * @param i
	 * @return
	 */
	public Tab getTab(int i) {
		return tabs.get(i);
	}
	
	/**
	 * Returns the number of tabs for the browser.
	 * @return
	 */
	public int getNumTabs() {
		return tabs.size();
	}
}
