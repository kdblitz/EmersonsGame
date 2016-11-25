package cucumber.stepdefs;

import com.odde.emersonsgame.model.Player;
import com.odde.emersonsgame.model.SpeedType;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;

public class PlayRaceStepdefs implements En {
	public PlayRaceStepdefs() {
		Player p = new Player();

		Given("^Player chooses (\\w+) speed$", (String speed) -> {
			p.setSpeedType(SpeedType.get(speed));
		});
		Given("^Player has (\\d+) damage$", (Integer damage) -> {
			p.setDamage(damage);
		});
		When("^Player rolls (\\d+)$", (Integer roll) -> {
			p.roll(roll);
		});
		Then("^Player moves (\\d+) steps$", (Integer step) -> {
			Assert.assertEquals((int) step, p.getStep());
		});
		Then("^Player gets (\\d+) damage$", (Integer damage) -> {
			Assert.assertEquals((int) damage, p.getDamage());
		});
	}


}