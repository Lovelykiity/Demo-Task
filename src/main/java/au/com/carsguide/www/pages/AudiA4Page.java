package au.com.carsguide.www.pages;

import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AudiA4Page extends Util {
    private static final Logger log= LogManager.getLogger(AudiA4Page.class.getName());
    @FindBy(xpath = "//*[@id=\"all-tab-content\"]/div/div[3]/h1")
    WebElement _verifyAudiText;
    public String vrifyAudiA4PageText(){
        Reporter.addStepLog("Verifying Audi A4 Page"+_verifyAudiText.toString()+"<br>");
        log.info("Verifying Audi A4 Page"+_verifyAudiText.toString());
        return getTextFromElement(_verifyAudiText);
    }
    public String getTitle(){
       return driver.getTitle();
    }
}
