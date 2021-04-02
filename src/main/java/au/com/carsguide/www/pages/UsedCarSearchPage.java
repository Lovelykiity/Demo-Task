package au.com.carsguide.www.pages;

import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UsedCarSearchPage extends Util {
    private static final Logger log= LogManager.getLogger(UsedCarSearchPage.class.getName());
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement _verifyUsedCarSearchText;
    //Verify Used Car Text Page
    public String verifyUsedSearchText(){
        Reporter.addStepLog("Navigate to Used Car Search Page"+_verifyUsedCarSearchText.toString()+"<br>");
        log.info("Navigate to Used Car Search Page"+_verifyUsedCarSearchText.toString());
        return getTextFromElement(_verifyUsedCarSearchText);
    }
}
