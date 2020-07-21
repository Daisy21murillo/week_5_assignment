//Daisy Murillo July 20, 2020

package week5;

import week5.Assignment.AsteriskLogger;
import week5.Assignment.SpacedLogger;

public class App {

	public void run() {
		AsteriskLogger firstClass = new AsteriskLogger();
		firstClass.log("Hello Daisy");
		firstClass.error("404");
		
		SpacedLogger secondClass = new SpacedLogger();
		secondClass.log("Goodbye Daisy");
		secondClass.error("503");

	}
	
	public static void main(String[] args) {
		new App().run();

	}

}
