 // Copyright Wintriss Technical Schools 2013

import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class popo_quiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		String bumbee  ="http://images.akamai.steamusercontent.com/ugc/43112399603689303/F1C52437243529CE230D4491D7B2A0930B66CB11/";
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
int gg = 0;
		// 2. create a variable of type "Component" that will hold your image
Component bumbus = createImage(bumbee);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
quizWindow.add(bumbus);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String meme = JOptionPane.showInputDialog("What skin = win?");
		// 7. print "CORRECT" if the user gave the right answer
if(meme.equalsIgnoreCase("Asiimov")|| meme.equalsIgnoreCase("Awp Asiimov")){
JOptionPane.showMessageDialog(null, "You a genius!");
gg+=10;
}
else{
JOptionPane.showMessageDialog(null, "Congratulations! You played yourself...");	
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(bumbus);
		// 10. find another image and create it (might take more than one line of code)
String bumbology = "http://images.akamai.steamusercontent.com/ugc/575690321277315598/1B20A1BDF741DE147BFF793B634B442BE8D9B07C/?interpolation=lanczos-none&output-format=jpeg&output-quality=95&fit=inside%7C1024:819&composite-to=*,*%7C1024:819&background-color=black";
		// 11. add the second image to the quiz window
bumbus = createImage(bumbology);
quizWindow.add(bumbus);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String bumboo = JOptionPane.showInputDialog("What other skin = win?");
		// 14+ check answer, say if correct or incorrect, etc.
if(bumboo.equalsIgnoreCase("Electric Hive")|| bumboo.equalsIgnoreCase("Awp Electric Hive")){
JOptionPane.showMessageDialog(null,"You smart" );
gg+=10;
}
else{
JOptionPane.showMessageDialog(null, "10. The amount of points you missed");
}
JOptionPane.showMessageDialog(null, "You have "+gg+" out of 20 points!" );

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





