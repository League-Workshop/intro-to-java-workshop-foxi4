package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	

		
		// 1.  Create a variable to hold the user's score 
	public static void main(String[] args) {
	int score=0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Who was this first president?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("George Washington")) {
		JOptionPane.showMessageDialog(null,"Correct!");
		}
		// 4.  if the user's answer was correct, add one to their score 
		if(answer.equalsIgnoreCase("Abraham Lincoln")) {
		JOptionPane.showMessageDialog(null,"WRONG!");
		}
		int score1=1;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 

		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
