package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import pageObject.DriverManager;

public class Hooks extends DriverManager {
    @Before
    public void open() {
       getDriver();
    }

    @After
    public void close() {
       closeDriver();
    }
}
