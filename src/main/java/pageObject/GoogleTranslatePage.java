package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleTranslatePage extends DriverManager{
    private By textAreaLocator = By.xpath("//*[@id=\"source\"]");
    private By resultTranslationLocator = By.xpath("//span[contains(@class,'tlid-translation')]");
    private By definitionLocator = By.xpath("(//div[@class='gt-def-row'])[2]");
    private By languagesFromMenuLocator = By.xpath("//div[contains(@class, 'sl-more tlid-open-source-language-list')]");
    private By languagesToMenuLocator = By.xpath("//div[@class='tl-more tlid-open-target-language-list']");
    private By searchLanguageFromLocator = By.xpath("//input[@id='sl_list-search-box']");
    private By searchLanguageToLocator = By.xpath("//input[@id='tl_list-search-box']");
    private final String URL = "https://translate.google.com/?hl=ru";

    public void open() {
        driver.get(URL);
    }

    public WebElement getLanguagesFromMenu() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(languagesFromMenuLocator));
    }

    public WebElement getSearchLanguageFrom() {
        return driver.findElement(searchLanguageFromLocator);
    }

    public WebElement getLanguagesToMenu() {
        return driver.findElement(languagesToMenuLocator);
    }

    public WebElement getSearchLanguageTo() {
        return driver.findElement(searchLanguageToLocator);
    }

    public WebElement getTextAreaField() {
        return driver.findElement(textAreaLocator);
    }

    public WebElement getResultTranslation() {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(resultTranslationLocator));
        return driver.findElement(resultTranslationLocator);
    }

    public WebElement getDefinition() {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(definitionLocator));
        return driver.findElement(definitionLocator);
    }

    public void selectLanguages(String languageFrom, String languageTo) {
        getLanguagesFromMenu().click();
        getSearchLanguageFrom().sendKeys(languageFrom, Keys.ENTER);
        getLanguagesToMenu().click();
        getSearchLanguageTo().sendKeys(languageTo, Keys.ENTER);
    }

    public void enterText(String text) {
        getTextAreaField().click();
        getTextAreaField().sendKeys(text);
    }

    public String getTranslation() {
        String actualTranslation = getResultTranslation().getText();
        return actualTranslation;
    }

    public int getNumberOfSymbols() {
        int amountOfCharacters = getResultTranslation().getText().length();
        System.out.println(amountOfCharacters);
        return amountOfCharacters;
    }

    public String getWordDefinition() {
        String definition = getDefinition().getText();
        return definition;
    }
}
