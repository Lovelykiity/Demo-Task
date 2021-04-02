package au.com.carsguide.www.cucumber;

import au.com.carsguide.www.basepage.BasePage;
import au.com.carsguide.www.propertyreader.PropertyReader;
import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {
    @Before
    public void openBrowser(){

        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

        Reporter.assignAuthor("Prime Testing", "Ekta Malaviya");
    }



    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenShotPath = Util.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        driver.quit();
    }
}
