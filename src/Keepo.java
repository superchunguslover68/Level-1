
public class Keepo {
	int bats;
	String color;
	String wings;

	Keepo(int bats, String color, String wings) {
		this.bats = bats;
		this.color = color;
		this.wings = wings;
	}

	void fly() {
		System.out.println(bats + " " + color + " bats are flying using " + wings);
	}

	void fall() {
		System.out.println(bats + " " + color + " bats fell into a valcano and burned to death.");

	}
}
