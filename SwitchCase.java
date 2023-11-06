import java.util.Scanner;

public class switchc {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);

		System.out.println("Please enter a cmd: ");

		String text = object.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine Started!");
			break;

		case "stop":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("Command not recognized");
		}

	}

}
