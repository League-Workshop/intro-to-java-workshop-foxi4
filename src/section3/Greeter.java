package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"What's your name?");
		String name = JOptionPane.showInputDialog(null,"The names Bob." + " Yours?");
	}
}
