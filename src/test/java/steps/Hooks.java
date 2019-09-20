package steps;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import pageObject.Browser;

public class Hooks {

    @Before
    public void open(){
        Browser.getDriver();
    }

//    @After
//    public void close(){
//        Browser.closeDriver();
//    }
}
