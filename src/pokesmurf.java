// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class pokesmurf {

	private String name;

	pokesmurf(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("My name is " + name + " Smurf.");
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("Papasmurf")) {
			System.out.println("I, " + name + "wear a red hat");
			return "I, " + name + "wear a red hat";
		} else {
			System.out.println("I, " + name + "wear a white hat");
			return "I, " + name + " wear a white hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equals("Smurfette")) {
			System.out.println("I " + name + "am a girl");
			return " I" + name + "am a girl";
		} else {
			System.out.println("I " + name + "am a boy");
			return " I" + name + "am a boy";
		}

	}
}
