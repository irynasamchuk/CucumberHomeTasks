package steps;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.Browser;
import pageObject.GoogleTranslatePage;

public class StepsDefinition {
    GoogleTranslatePage googleTranslatePage = new GoogleTranslatePage();
    @Given("the user is on the google translate page")
    public void theUserIsOnTheGoogleTranslatePage() {
        googleTranslatePage.open();
    }

    @And("selected languages from {string} to {string}")
    public void selectedLanguages(String languageFrom, String languageTo) {
        googleTranslatePage.selectLanguages(languageFrom, languageTo);
    }

    @When("the user looks up the translation of the word {string}")
    public void theUserLooksUpTheTranslationOfTheWord(String word) {
        googleTranslatePage.enterText(word);
    }

    @Then("they should see the translation {string}")
    public void theyShouldSeeTheTranslation(String expectedTranslation) {
        String actualTranslation = googleTranslatePage.getTranslation();
        Assert.assertEquals(expectedTranslation, actualTranslation );
    }

//    @Then("number of characters must be {string}")
//    public void numberOfCharactersMustBe(int expectedAmountOfCharacters) {
//        int actualAmountOfCharacters = googleTranslatePage.getNumberOfSymbols();
//        Assert.assertEquals(expectedAmountOfCharacters, actualAmountOfCharacters);
//    }

    @Then("they should see the definition {string}")
    public void theyShouldSeeTheDefinition(String expectedDefinition) {
        String actualDefinition = googleTranslatePage.getWordDefinition();
        Assert.assertEquals(expectedDefinition, actualDefinition);
    }

    @Then("number of characters must be {string}")
    public void numberOfCharactersMustBe(int arg0) {
        int actualAmountOfCharacters = googleTranslatePage.getNumberOfSymbols();
        Assert.assertEquals(arg0, actualAmountOfCharacters);
    }
}