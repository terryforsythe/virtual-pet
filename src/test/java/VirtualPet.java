import java.util.Random;

public class VirtualPet {

	private String name;

	private int hunger = 10;
	private int thirst = 10;
	private int waste = 0;

	public VirtualPet(String name) {
		this.name = name;
	}

	public String getVirtualPetName() {
		return name;
	}

	private void petRefusal() {
		System.out.println("GRRR!");
	}

	public void tick() {
		hungerIncrease();
		thirstIncrease();
	}

	public void feed() {
		hungerDecrease();
		thirstIncrease();
		wasteIncrease();
	}

	public void potty() {
		waste -= 4;
	}

	public void water() {
		thirstDecrease();
		wasteIncrease();
	}

	private void wasteIncrease() {
		waste += 4;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	private void hungerDecrease() {
		hunger -= 4;
	}

	private void hungerIncrease() {
		hunger += 4;
	}

	private void thirstDecrease() {
		thirst -= 4;
	}

	private void thirstIncrease() {
		thirst += 4;
	}

}
