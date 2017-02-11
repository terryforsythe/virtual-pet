import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		String petRefusal = "GRRR!";
		String moreWithPet;

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to your Virtual Pet!\n");

		System.out.println("What would you like to name your pet?");
		String petName = input.next();
		VirtualPet virtualPet = new VirtualPet(petName);

		do {

			System.out.println(petName + "'s attribute levels:");
			System.out.println("Hunger " + virtualPet.getHunger());
			System.out.println("Thirst " + virtualPet.getThirst());
			System.out.println("Waste " + virtualPet.getWaste());

			System.out.println("What would you like to do with your pet?");
			System.out.println("1 - Feed");
			System.out.println("2 - Water");
			System.out.println("3 - Take to potty");

			int menuChoice = input.nextInt();

			switch (menuChoice) {
			case 1:
				virtualPet.feed();
				break;
			case 2:
				virtualPet.water();
				break;
			case 3:
				if (virtualPet.getWaste() == 0) {
					System.out.println(petRefusal);
				} else {
					virtualPet.potty();
				}
			}

			virtualPet.tick();

			System.out.println("Would you like to do more with your pet? \n");
			moreWithPet = input.next().toUpperCase().substring(0, 1);

			if (moreWithPet.equals("N")) {
				System.out.println("Have a good day!");
			}

		} while (moreWithPet.equals("Y"));

		input.close();
	}

}
