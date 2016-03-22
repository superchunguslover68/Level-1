
public class ket {

	private String name;
	private int lives = 9;

	ket(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void pet() {
		System.out.println("PURRRRRRRRRRRRRRRRRRRRRRRRRR ");

	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		ket ket = new ket("Weeaboo");

		// 1. make the Cat meow
		ket.meow();
		// 2. get the Cat to print it's name
		ket.printName();
		// 3. kill the Cat!
		ket.pet();
		ket.pet();
		ket.pet();
		ket.pet();
		ket.pet();
		ket.pet();
		ket.pet();
	}
}
