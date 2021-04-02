package au.com.carsguide.www.pages;

import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement _buySale;
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement _searchCarsLink;
    @FindBy(linkText = "Used")
    WebElement _usedLink;

    //Mouse Hover To Buy+Sale Link
    public void mouseHoverToBuySale(){
        Reporter.addStepLog("MouseHover To Buy+Sale Link"+_buySale.toString()+"<br>");
        log.info("MouseHover To Buy+Sale Link"+_buySale.toString());
        mouseHoverToElement(_buySale);
    }
    //Click On SearchCars Link
    public void searchCarsLink(){
        Reporter.addStepLog("Clicking on Search cars Link"+_searchCarsLink.toString()+"<br>");
        log.info("Clicking on Search cars Link"+_searchCarsLink.toString());
        clickOnElement(_searchCarsLink);
    }
    //Click on Used Link
    public void clickOnUsedLink(){
        Reporter.addStepLog("Clicking on SubMenu Used"+_usedLink.toString()+"<br>");
        log.info("Clicking on SubMenu Used"+_usedLink.toString());
        clickOnElement(_usedLink);
    }
}
