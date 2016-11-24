package cucumber.stepdefs;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static cucumber.stepdefs.support.Url.url;
import static cucumber.stepdefs.support.WebDrivers.getDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreateRaceStepdefs implements En {
    public CreateRaceStepdefs() {
        Given("^I have a race with no name", () -> {
            getDriver().get(url("/createRace"));
        });

        When("^I try to name the race$", () -> {
            WebElement elem = getDriver().findElement(By.cssSelector("#race-name"));
            elem.sendKeys("My Race");
        });

        Then("^I must see the race using the new name$", () -> {
            WebElement elem = getDriver().findElement(By.cssSelector("#race-name"));

            assertThat(elem.getAttribute("value"), is("My Race"));
        });

        Given("^I have no players", () -> {
            getDriver().get(url("/createRace"));
        });

        When("^I try to add a new player$", () -> {
            WebElement newPlayer = getDriver().findElement(By.cssSelector("#new-player"));
            newPlayer.sendKeys("Player 1");
            WebElement addPlayer = getDriver().findElement(By.cssSelector("#add-player"));
            addPlayer.click();
        });

        Then("^I must see the new player added$", () -> {
            List<WebElement> playerList = getDriver().findElements(By.cssSelector("#player-list li"));

            assertThat(playerList.size(), is(1));
        });
    }
}
