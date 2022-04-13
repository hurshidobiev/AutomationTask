package net.automation.steps;

import io.cucumber.java.en.*;
import net.automation.pages.HomePage;
import net.automation.utils.BrowserUtils;
import net.automation.utils.ConfigReader;
import net.automation.utils.Driver;
import org.junit.Assert;

public class HomePageStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("the user is on home page")
    public void theUserIsOnHomePage() {
        Driver.get().get(ConfigReader.get("url"));
    }

    @When("the user clicks run button")
    public void theUserClicksRunButton() {
        homePage.runButton.click();
    }

    @Then("{string} should be displayed on Output window")
    public void shouldBeDisplayedOnOutputWindow(String output) {
        Assert.assertTrue(homePage.output.isDisplayed());
        Assert.assertEquals("verify output text is \"Hello World\"", output, homePage.output.getText());
    }

    @When("the user clicks {string} button")
    public void theUserClicksButton(String shareButton) {
        homePage.clickButton(shareButton);
    }

    @Then("the link displayed should start with {string}")
    public void theLinkDisplayedShouldStartWith(String shareLink) {
        BrowserUtils.waitForVisibility(homePage.shareLink,3);
        homePage.shareLink.click();
        Assert.assertTrue(homePage.shareLink.getAttribute("value").startsWith(shareLink));
    }

}
