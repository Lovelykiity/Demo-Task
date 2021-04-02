package au.com.carsguide.www.pages;

import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BmwOneSeriesPage extends Util {
    private static final Logger log= LogManager.getLogger(BmwOneSeriesPage.class.getName());
    @FindBy(xpath = "//*[@id=\"all-tab-content\"]/div/div[3]/h1")
    WebElement _verifyBmwPageText;
    //I should see list of searched cars "20 BMW 1 Series for Sale under $30,000 in Sydney, NSW"
    public String verifyBmwPageText(){
        Reporter.addStepLog("Verify Bmw Page"+_verifyBmwPageText.toString()+"<br>");
        log.info("Verify Bmw Page"+_verifyBmwPageText.toString());
        return getTextFromElement(_verifyBmwPageText);
    }
    //Get Title of Page
    public String getTitle(){
       return driver.getTitle();
    }

}
