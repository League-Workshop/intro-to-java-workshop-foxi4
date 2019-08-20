package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
JOptionPane.showMessageDialog(null, "So, who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		String name = JOptionPane.showInputDialog("I dont like him.");
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "So, changing the topic, what's the name of your bestfriend? I want to know him/her.");
		String cheese = JOptionPane.showInputDialog("Since your nice, I would imagine her being the same!");
		// 4. Tell them their best friend is as sweet as candy
        JOptionPane.showMessageDialog(null, "I know her!, she's as sweet as candy!");
	} 
}



