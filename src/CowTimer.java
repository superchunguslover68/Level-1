import java.applet.AudioClip;
import java.awt.BasicStroke;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 * Work in seconds when testing, then change to minutes
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
CowTimer ba = new CowTimer();
ba.setTime(20);
ba.start();
String speak = "Moo";

	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {

for (int i = 0; i > -1; i++) {
	System.out.println(minutes);

Thread.sleep(60);

minutes--;
if(minutes== 0){
playSound("Moo.wav");
speak("eeeeeeeeeeeeeeeeeeeeeeeEEEEEEEEEEEEEEEEEEEEEEEEEEeeeeeeeeeeeeeeeeeeeeeeeeEEEEEEEEEEEEEEEEEEEEEEEEEEEeeeeeeeeeeeeeeeEEEEEEEEEEEEEEEEEEEEEEeeeeeeeeeeeeeeeeeeeeeee");
}
}
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

