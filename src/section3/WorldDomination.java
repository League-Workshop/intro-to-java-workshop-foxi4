package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you know how to write code? Yes, or no?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Well then, you will RULE THE WORLD SOMEDAY! >:D");}
		// 3. Otherwise, wish them good luck washing dishes.
if(answer.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "Too bad. Good luck washing dishes!");
	}
}}

