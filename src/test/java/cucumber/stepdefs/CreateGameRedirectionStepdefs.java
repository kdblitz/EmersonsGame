package cucumber.stepdefs;

import cucumber.api.java8.En;
import org.openqa.selenium.By;

import static cucumber.stepdefs.support.Url.url;
import static cucumber.stepdefs.support.WebDrivers.getDriver;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.junit.Assert.assertThat;

/**
 * Created by dedel on 11/24/2016.
 */
public class CreateGameRedirectionStepdefs implements En {
    public CreateGameRedirectionStepdefs() {
        Given("^I am in the view all races page", () -> {
            getDriver().get(url("/races"));
        });

        When("^I try create a new game$", () -> {
            getDriver().findElement(By.className("createRaceBtn")).click();
        });

        Then("^I must be redirected to the create game page$", () -> {
            assertThat(getDriver().getCurrentUrl(), endsWith("/createRace"));
        });
    }
}
