/*
 * @author Jonathon Thach
 * @version 0.5.0
 * @date September 23, 2017
 * 
 * This program will contain four games: 
 * 1) Rock Paper Scissor: Choose either 3 and the program will display the results.
 * 2) Guessing Game: Guess between 1 - 10 and checks if the player won.
 * 3) Calculator: User will enter two numbers, they choose between 5 choices, and displays the results.
 * 4) Special: Secret game; Text Adventure v.0.0.9.
 * 
 */

//import scanner
// Scanner Random
import java.util.*; // Scanner input

public class fourGames { // Declares the class

	public static void main(String[] a) {

		Scanner game = new Scanner(System.in);

		System.out.println("Welcome to my game! You have four choices, pick the one you like the most or maybe all four of them!");
		System.out.println("1) Rock Paper Scissors!");
		System.out.println("2) Number Guessing Game!");
		System.out.println("3) Calculator Game!");
		System.out.println("4) Text Adventure!");
		int gameChoice = game.nextInt();

		if (gameChoice == 1) {

			Scanner game1 = new Scanner(System.in);

			Random chance = new Random();
			int rand = chance.nextInt((3 - 1) + 1) + 1;

			System.out.println("You picked Rock Paper Scissors, if you picked the wrong choice. Rerun the program.");
			System.out.println("Write the number beside the action to choose it!");
			System.out.println("1) Rock");
			System.out.println("2) Paper");
			System.out.println("3) Scissors");
			int choice = game1.nextInt();

			if (choice == 1 && rand == 1) {
				System.out.println("It looks like you both picked Rock, settle this tie by challenging the computer again!");

			} else if (choice == 1 && rand == 2) {
				System.out.println("You lost. You picked rock and the computer picked Paper. Try again!");

			} else if (choice == 1 && rand == 3) {
				System.out.println("You won! You picked Rock and the computer picked Scissors!");

			} else if (choice == 2 && rand == 1) {
				System.out.println("You won! You picked Paper and the computer picked Rock!");

			} else if (choice == 2 && rand == 2) {
				System.out.println("It looks like you both picked Paper, settle this tie by challenging the computer again!");

			} else if (choice == 2 && rand == 3) {
				System.out.println("You lost. You picked Paper and the computer picked Scissors. Try again!");

			} else if (choice == 3 && rand == 1) {
				System.out.println("You lost. You picked Scissors and the computer picked Rock. Try again!");

			} else if (choice == 3 && rand == 2) {
				System.out.println("You won! You picked Scissors and the computer picked Paper!");

			} else if (choice == 3 && rand == 3) {
				System.out.println("It looks like you both picked Scissors, settle this tie by challenging the computer again!");

			}

		} else if (gameChoice == 2) {
			Scanner game2 = new Scanner(System.in);

			Random chance2 = new Random();
			int rand2 = chance2.nextInt((10 - 1) + 1) + 1;

			System.out.println("You picked The Number Guessing Game, if you picked the wrong choice. Rerun the program.");
			System.out.println("Enter a number betweeen 1-10 and test your luck!");

			int choice = game2.nextInt();

			if (choice == rand2) {
				System.out.println("You won! You picked the same number as the computer! Now use your good luck to use!");

			} else {
				System.out.println("You lost. Your input did not match the random number: " + rand2);

			}

		} else if (gameChoice == 3) {
			Scanner game3 = new Scanner(System.in);
			
			Random chance3 = new Random();
			int rand3 = chance3.nextInt((10 - 1) + 1) + 1;

			System.out.println("You The Calculator Game, if you picked the wrong choice. Rerun the program.");
			System.out.println("Pick your first digit!");
			double choice1 = game3.nextInt();
			
			System.out.println("Pick your second digit!");
			double choice2 = game3.nextInt();
			
			System.out.println("Now pick what you want to do with them!");
			System.out.println("1) Addition");
			System.out.println("2) Subtract");
			System.out.println("3) Multiply");
			System.out.println("4) Divide");
			System.out.println("5) Super Secret");
			
			int choice3 = game3.nextInt();

			double add = (choice1 + choice2), sub = (choice1 - choice2), multi = (choice1 * choice2),
					divide = (choice1 / choice2);
			double secret1 = ((add / choice2) - sub), secret2 = ((add * sub) / multi),
					secret3 = ((add + sub) + (divide * multi));

			if (choice3 == 1) {
				System.out.println(choice1 + " + " + choice2 + " = " + add);

			} else if (choice3 == 2) {
				System.out.println(choice1 + " - " + choice2 + " = " + sub);

			} else if (choice3 == 3) {
				System.out.println(choice1 + " * " + choice2 + " = " + multi);

			} else if (choice3 == 4) {
				System.out.println(choice1 + " / " + choice2 + " = " + divide);

			} else if (choice3 == 5 && rand3 >= 6) {
				System.out.println("We did (sum / " + choice2 + " ) - difference and got: " + secret1);

			} else if (choice3 == 5 && rand3 == 5) {
				System.out.println("We did (sum * difference) / product and got: " + secret2);

			} else if (choice3 == 5 && rand3 <= 4) {
				System.out.println("We did (sum + difference) + (quotient/product) and got: " + secret3);

			} else {
				System.out.println("It looks like you didn't pick a proper answer. Try again.");

			}

		} else if (gameChoice == 4) {
			Scanner game4 = new Scanner(System.in);

			System.out.println("You picked Text Adventure, if you picked the wrong choice. Rerun the program. Note: Make sure to expand the console, you gotta read!");
			System.out.println("You woke up in a pod, you're unable to move your body, but you can move your right arm far enough to press two buttons.");
			System.out.println("Do you: ");
			System.out.println("1) Press the green button!");
			System.out.println("2) Press the red button!");

			int chance = game4.nextInt();

			if (chance == 1) {
				System.out.println("You pressed the green button, your pod was shotout from where ever you were and you see that it was a half destroyed space station from the pod's small window!");
				System.out.println("Six hours pass and you land back on Earth. You can see three figure from the window of your pod");
				System.out.println("Do you: ");
				System.out.println("1) Wait");
				System.out.println("2) Press the red button!");

				int hope = game4.nextInt();

				if (hope == 1) {
					System.out.println("You waited and then the pod was set a on fire! It seemed the three figures didn't like your pod.");
					System.out.println("You struggled to get their attention, you tried your best to show them that a living being was in the pod");
					System.out.println("But it was all for nothing, your pod explosed with you in it. . . ending your short lived adventure.");

				} else if (hope == 2) {
					System.out.println("Your pod door opens and you see three farmers! They stare in awe at whats before them.");
					System.out.println("You fall out of your pod and they see that your hurt, but your free from your prison.");
					System.out.println("The three farmers take you into town ending your adventure.");
					System.out.println("but little did you know, opening your door not only freed you but it also released soemthing else. . .");
					System.out.println("Replay the game to try to figure out the entire story.");
				}

			} else if (chance == 2) {
				System.out.println("You pressed the red button, opening your door. You fall out of your pod hurt, but you can still move");
				System.out.println("You wonder through the halls until you reach a door with a sign that says 'Command center'.");
				System.out.println("You open then door and meet a horrific sight!");
				System.out.println("You see people your faintly recognize fighting off an black goo on a big screen!");
				System.out.println("They slowly are getting taking over by the goo, one by one, until your the only one left.");
				System.out.println("You see yourself press a button and a countdown started. You ran for the pod and an explosion went off.");
				System.out.println("You blew up half of the station. killing your former friends and the black goo. . .");
				System.out.println("But as you turn around, you see that a small bit of it is coming towards you!");
				System.out.println("There is a big button red button in the middle of the room.");
				System.out.println("Do you: ");
				System.out.println("1) Run and press the red big button!");
				System.out.println("2) Do down fighting, try your best to kill the goo!");

				int last = game4.nextInt();

				if (last == 1) {
					System.out.println("You ran and pressed the red button! Before your eyes you see a fiery explosion.");
					System.out.println("It ends up killing you and the last of the goo. You saved Earth. . .");

				} else if (last == 2) {
					System.out.println("You tried your best to stomp on the goo, but it slowly overtakes you and covers your body!");
					System.out.println("As the light slowly escapes your eyes, you slowly embrace the goo.");
					System.out.println("You and the goo go back to the space pod, closing it and then pressed the green button.");
					System.out.println("Next stop, Earth. . .");
				}

			} else if (chance != 1 || chance != 2) {
				System.out.println("You didn't press either button, instead you stayed in your pod and waited until the blanket of death covered your soul. What a terrible ending.");

			}

		} else {
			System.out.println("Looks like you didn't pick a number between 1-4 , terminating the program. :(");

		}

	}
}
