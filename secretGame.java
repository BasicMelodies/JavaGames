
// Scanner input
import java.util.*;

public class secretGame { // Declares the class

	public static void main(String[] a) {

		Scanner game4 = new Scanner(System.in); // Scanner

		// Menu 1
		System.out.println("You picked Text Adventure, if you picked the wrong choice. Rerun the program. Note: Make sure to expand the console, you gotta read!");
		System.out.println("Which text adventure would you like to play?");
		System.out.println("1) Space");
		System.out.println("2) Buttons");
		
		int txt = game4.nextInt();

		if (txt == 1) {
			System.out.println(
					"You woke up in a pod, you're unable to move your body, but you can move your right arm far enough to press two buttons.");
			System.out.println("Do you: ");
			System.out.println("1) Press the green button!");
			System.out.println("2) Press the red button!");

			int chance = game4.nextInt(); // Declares int and stores variable

			// First nested if-statement
			if (chance == 1) { // Start of the if-statements
				System.out.println(
						"You pressed the green button, your pod was shotout from where ever you were and you see that it was a half destroyed space station from the pod's small window!");
				System.out.println(
						"Six hours pass and you land back on Earth. You can see three figure from the window of your pod");
				System.out.println("Do you: ");
				System.out.println("1) Wait");
				System.out.println("2) Press the red button!");

				int hope = game4.nextInt(); // Declares int and stores variable

				if (hope == 1) { // Option 1
					System.out.println(
							"You waited and then the pod was set a on fire! It seemed the three figures didn't like your pod.");
					System.out.println(
							"You struggled to get their attention, you tried your best to show them that a living being was in the pod");
					System.out.println(
							"But it was all for nothing, your pod explosed with you in it. . . ending your short lived adventure.");

				} else if (hope == 2) { // Option 2
					System.out.println(
							"Your pod door opens and you see three farmers! They stare in awe at whats before them.");
					System.out.println(
							"You fall out of your pod and they see that your hurt, but your free from your prison.");
					System.out.println("The three farmers take you into town ending your adventure.");
					System.out.println(
							"but little did you know, opening your door not only freed you but it also released soemthing else. . .");
					System.out.println("Replay the game to try to figure out the entire story.");
				}

			} else if (chance == 2) { // Apart of the first if-statement
				System.out.println(
						"You pressed the red button, opening your door. You fall out of your pod hurt, but you can still move");
				System.out.println(
						"You wonder through the halls until you reach a door with a sign that says 'Command center'.");
				System.out.println("You open then door and meet a horrific sight!");
				System.out.println("You see people your faintly recognize fighting off an black goo on a big screen!");
				System.out.println(
						"They slowly are getting taking over by the goo, one by one, until your the only one left.");
				System.out.println(
						"You see yourself press a button and a countdown started. You ran for the pod and an explosion went off.");
				System.out
						.println("You blew up half of the station. killing your former friends and the black goo. . .");
				System.out.println("But as you turn around, you see that a small bit of it is coming towards you!");
				System.out.println("There is a big button red button in the middle of the room.");
				System.out.println("Do you: ");
				System.out.println("1) Run and press the red big button!");
				System.out.println("2) Do down fighting, try your best to kill the goo!");

				int last = game4.nextInt();

				if (last == 1) { // Nested if-statement
					System.out
							.println("You ran and pressed the red button! Before your eyes you see a fiery explosion.");
					System.out.println("It ends up killing you and the last of the goo. You saved Earth. . .");

				} else if (last == 2) { // Nested if-statement
					System.out.println(
							"You tried your best to stomp on the goo, but it slowly overtakes you and covers your body!");
					System.out.println("As the light slowly escapes your eyes, you slowly embrace the goo.");
					System.out.println(
							"You and the goo go back to the space pod, closing it and then pressed the green button.");
					System.out.println("Next stop, Earth. . .");
				}

			} else if (chance != 1 || chance != 2) { // If the user does not
														// pick one of the
														// numbers, they get
														// this, apart of the
														// original if statement
				System.out.println(
						"You didn't press either button, instead you stayed in your pod and waited until the blanket of death covered your soul. What a terrible ending.");

			} 
			
		} else if (txt == 2) {
				System.out.println("You are presented with a series of buttons, you have to touch them in a specific order.");
				System.out.println("Do you: ");
				System.out.println("1) Press the green button!");
				System.out.println("2) Press the red button!");

				int idk = game4.nextInt(); // Declares int and stores variable

				// First nested if-statement
				if (idk == 1) { // Start of the ifs
					System.out.println(
							"You pressed the green button, your pod was shotout from where ever you were and you see that it was a half destroyed space station from the pod's small window!");
					System.out.println(
							"Six hours pass and you land back on Earth. You can see three figure from the window of your pod");
					System.out.println("Do you: ");
					System.out.println("1) Wait");
					System.out.println("2) Press the red button!");

					int hope = game4.nextInt(); // Declares int and stores
												// variable

					if (hope == 1) { // Option 1
						System.out.println(
								"You waited and then the pod was set a on fire! It seemed the three figures didn't like your pod.");
						System.out.println(
								"You struggled to get their attention, you tried your best to show them that a living being was in the pod");
						System.out.println(
								"But it was all for nothing, your pod explosed with you in it. . . ending your short lived adventure.");

					} else if (hope == 2) { // Option 2
						System.out.println(
								"Your pod door opens and you see three farmers! They stare in awe at whats before them.");
						System.out.println(
								"You fall out of your pod and they see that your hurt, but your free from your prison.");
						System.out.println("The three farmers take you into town ending your adventure.");
						System.out.println(
								"but little did you know, opening your door not only freed you but it also released soemthing else. . .");
						System.out.println("Replay the game to try to figure out the entire story.");
					}

				} else if (idk == 2) { // Apart of the first if-statement
					System.out.println(
							"You pressed the red button, opening your door. You fall out of your pod hurt, but you can still move");
					System.out.println(
							"You wonder through the halls until you reach a door with a sign that says 'Command center'.");
					System.out.println("You open then door and meet a horrific sight!");
					System.out.println(
							"You see people your faintly recognize fighting off an black goo on a big screen!");
					System.out.println(
							"They slowly are getting taking over by the goo, one by one, until your the only one left.");
					System.out.println(
							"You see yourself press a button and a countdown started. You ran for the pod and an explosion went off.");
					System.out.println(
							"You blew up half of the station. killing your former friends and the black goo. . .");
					System.out.println("But as you turn around, you see that a small bit of it is coming towards you!");
					System.out.println("There is a big button red button in the middle of the room.");
					System.out.println("Do you: ");
					System.out.println("1) Run and press the red big button!");
					System.out.println("2) Do down fighting, try your best to kill the goo!");

					int last = game4.nextInt();

					if (last == 1) { // Nested if-statement
						System.out.println(
								"You ran and pressed the red button! Before your eyes you see a fiery explosion.");
						System.out.println("It ends up killing you and the last of the goo. You saved Earth. . .");

					} else if (last == 2) { // Nested if-statement
						System.out.println(
								"You tried your best to stomp on the goo, but it slowly overtakes you and covers your body!");
						System.out.println("As the light slowly escapes your eyes, you slowly embrace the goo.");
						System.out.println(
								"You and the goo go back to the space pod, closing it and then pressed the green button.");
						System.out.println("Next stop, Earth. . .");
					}

				} else if (idk != 1 || idk != 2) { // If the user does not
															// pick one of the
															// numbers, they get
															// this, apart of
															// the original if
															// statement
					System.out.println(
							"You didn't press either button, instead you waited until the blanket of death covered your soul. What a terrible ending. :(");

				}
			}
		}

}