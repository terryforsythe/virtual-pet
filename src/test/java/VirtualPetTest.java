import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

	private VirtualPet underTest;

	@Before
	public void setup() {
		underTest = new VirtualPet("Effauhf");
	}

	@Test
	public void hunger_IncreaseByTick() {
		underTest.tick();
		int result = underTest.getHunger();
		Assert.assertEquals(14, result);
	}

	@Test
	public void thirst_IncreaseByTick() {
		underTest.tick();
		int result = underTest.getThirst();
		Assert.assertEquals(12, result);
	}

	@Test
	public void hunger_DecreaseWhenFeedOccurs() {
		underTest.feed();
		int result = underTest.getHunger();
		Assert.assertEquals(2, result);
	}

	@Test
	public void thirst_DecreaseWhenWaterOccurs() {
		underTest.water();
		int result = underTest.getThirst();
		Assert.assertEquals(6, result);
	}

	@Test
	public void thirst_IncreaseWhenFeedOccurs() {
		underTest.feed();
		int result = underTest.getThirst();
		Assert.assertEquals(12, result);
	}

	@Test
	public void waste_IncreasesWhenFeedOccurs() {
		underTest.feed();
		int result = underTest.getWaste();
		Assert.assertEquals(4, result);
	}

	@Test
	public void waste_IncreasesWhenWaterOccurs() {
		underTest.water();
		int result = underTest.getWaste();
		Assert.assertEquals(2, result);
	}

	@Test
	public void waste_DecreasesWhenPottyOccurs() {
		underTest.feed();
		underTest.potty();
		int result = underTest.getWaste();
		Assert.assertEquals(0, result);
	}
	
}
