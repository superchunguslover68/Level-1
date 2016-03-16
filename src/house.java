import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class house {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(3);
		Tortoise.setY(400);
		Tortoise.show();
		drawyHousey("small", "blue", "flat");
		drawyHousey("medium", "red", "pointy" );
		drawyHousey("small", "blue", "flat");
		drawyHousey("large", "red", "pointy");
		drawyHousey("medium" , "green", "flat");
		drawyHousey("large" , "green", "flat");
		drawyHousey("small", "red", "pointy");
		drawyHousey("large" , "green" , "flat");
		drawyHousey("medium", "blue", "pointy");

	}

	private static void drawyHousey(String Height, String Color, String roof) {
		if(Color.equals("green")){
		Tortoise.setPenColor(Colors.Greens.Lime);
		}
		else if(Color.equals("red")){
		Tortoise.setPenColor(Colors.Reds.Crimson);
		}
		else if(Color.equals("blue")){
		Tortoise.setPenColor(Colors.Blues.Cyan);	
		}
		if (Height.equals("small")) {
			Tortoise.move(60);
		} else if (Height.equals("medium")) {
			Tortoise.move(120);
		}

		else if (Height.equals("large")) {
			Tortoise.move(250);
		} 
		if(roof.equals("pointy")){
		Tortoise.turn(45);
		Tortoise.move(15);
		Tortoise.turn(90);
		Tortoise.move(15);
		Tortoise.turn(45);
		}
		else if(roof.equals("flat")){
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
		}
		
		if (Height.equals("small")){
			Tortoise.move(60);
		}
		else if (Height.equals("medium")) {
			Tortoise.move(120);
		} else {
			Tortoise.move(250);
		}
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.DarkGreen);
		Tortoise.move(30);
		Tortoise.turn(-90);

	
		
	}	
	
}
