package edu.macalester.comp124.hw4;

import acm.program.ConsoleProgram;

/**
 * RunBrowser runs a set of methods on a set of tabs in the Browser class
 * Created by Reena on 3/5/14.
 */
public class RunBrowser extends ConsoleProgram {

    /**
     *
     */

    Browser browser = new Browser();

    public void run() {
        while (true) {
            String user = readLine("enter command (new, list, switch, display, open):" + " ");

            if (user.equals("new")) {
                newTab(browser);
            } else if (user.equals("display")) {
               displayTab(browser);
            } else if (user.equals("list")) {
                listTab(browser);
            } else if (user.equals("switch")) {
                switchTab(browser);
            } else if (user.equals("open")) {
                openTab(browser);
            } else if (user.equals("quit")) {
                println("shutting down browser...");
                break;
            }
        }
    }

    /**
     *Adds a new tab to a browser, sets it as the displayed tab and sets a url given by the user to that tab
     * @param browser
     */
    private void newTab(Browser browser) {
        Tab a = new Tab(MAX_LENGTH);
        browser.addTab(a);
        String url = readLine("enter url:" + " ");
        a.setUrl(url);
    }

    /**
     *Displays the human-readable contents of teh currently displayed tab
     * @param browser
     */
    private void displayTab(Browser browser) {
        int i = browser.getDisplayedTabIndex();
        println("displaying tab" + i + ":" + browser.getDisplayedTab().getDisplayedText());
    }

    /**
     *Displays the indexes of each tab and the url at that index
     * @param browser
     */
    private void listTab(Browser browser) {
        println("all tabs:");
        for (int z = 0; z < browser.getNumTabs(); z++) {
        println("tab" + z + ":" + browser.getTab(z).getUrl());
    }
    }

    /**
     *Prompts the user for the index of a tab. Sets that tab as the currently displayed tab
     * @param browser
     */
    private void switchTab(Browser browser) {
        int y = browser.getNumTabs() - 1;
        int b = readInt("enter tab to display (from 0 to" + y + "):");
        browser.setDisplayedTab(b);
    }

    /**
     *Prompts the user to enter a url and opens the url in the currently displayed tab
     * @param browser
     */
    private void openTab(Browser browser) {
        String url2 = readLine("enter url:" + " ");
        browser.getDisplayedTab().setUrl(url2);
    }

    /**
     *
     */

    private static final int MAX_LENGTH = 30;
}


