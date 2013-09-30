# Comp 124: A Web Browser

In this homework assignment, you'll create a simple text-based web browser.

As you complete this homework assignment please be sure to use [good java style](https://docs.google.com/document/d/1V8BM38WXnBuVvTPilZMVCSuITLVW5VEfPKHaJ3uCZgc/edit?usp=sharing).

### Part 1: Setup
Fork and clone this repo

### Part 2: Functional Specification:

Your browser should repeatedly prompt the user to input commands, and support the following six commands:

 * new - Prompts the user to enter a URL and creates a new tab at that URL.  Sets the new tab as the currently displayed tab.
 * open - Prompts the user to enter a URL.  Opens the URL in the currently displayed tab.  (Does not create a new tab).
 * list - Displays the indexes of each tab and the url at that index.
 * switch - Prompts the user for the index of a tab.  Sets that tab as the currently displayed tab.
 * display - Displays the human-readable contents of the currently displayed tab.
 * quit - Ends the browser program by calling System.exit(0).


### Part 3: Complete the RunBrowser class
Create a new class called RunBrowser in the edu.macalester.comp124.hw4 package.  This will be the class that you run from IntelliJ (as an applet).

 * RunBrowser will extend ConsoleProgram.
 * RunBrowser will need to use the Browser and Tab classes.
 * You should complete the RunBrowser class's run method so that it interacts with the user (see the transcript below).
 * You should split run() into separate methods if it gets to be too large.

Keep in mind that the Browser and Tab classes should provide almost all of this functionality for you.  The RunBrowser is essentially serving as an intermediary between the user and a Browser object.



### Appendix: Example Transcript
![transcript](https://raw.github.com/mac-comp124-f13/hw4/master/transcript.png?login=shilad&token=78c15238285a40c97a6aa9f25d69c9a8 "Transcript")
