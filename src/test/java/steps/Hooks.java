package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import pageObject.Browser;

public class Hooks extends Browser {
    @Before
    public void open() {
       getDriver();
    }

    @After
    public void close() {
       closeDriver();
    }
}
