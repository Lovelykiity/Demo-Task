package au.com.carsguide.www.pages;

import au.com.carsguide.www.util.Util;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewAndUsedCarsSearchPage extends Util {
    private static final Logger log= LogManager.getLogger(NewAndUsedCarsSearchPage.class.getName());
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement _verifySearchCarsText;
    @FindBy(xpath = "//select[@id='makes']")
    WebElement _anyMakeField;
    @FindBy(xpath = "//select[@id='models']")
    WebElement _anyModelField;
    @FindBy(xpath = "//select[@id='locations']")
    WebElement _anyLocationField;
    @FindBy(xpath ="//select[@id='priceTo']" )
    WebElement _priceField;
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement _findMyNextCarBtn;
    //Verify Search Text Page
    public String verifySearchCarsText(){
        Reporter.addStepLog("Navigate to SearchCarsPage SuccessFully"+_verifySearchCarsText.toString()+"<br>");
        log.info("Navigate to SearchCarsPage SuccessFully"+_verifySearchCarsText.toString());
        return getTextFromElement(_verifySearchCarsText);
    }
    //Select BMW From DropDown Any Make Field
    public void selectCarFromDropDown(String brand){
        Reporter.addStepLog("Select  Car From Drop Down"+_anyMakeField.toString()+"<br>");
        log.info("Select  From Drop Down"+_anyMakeField.toString());
        //clickOnElement(_anyMakeField);
        selectByVisibleTextFromDropDown(_anyMakeField,brand);
    }
    //Select Series From Drop Down
    public void selectSeriesAsCarModel(String model){
        Reporter.addStepLog("Selecting SERIES As Car Model"+_anyModelField.toString()+"<br>");
        log.info("Selecting SERIES As Car Model"+_anyModelField.toString());
        selectByVisibleTextFromDropDown(_anyModelField,model);

    }
    //Selcect Location From Drop Down
    public  void selectLocationFromDropDown(String location){
        Reporter.addStepLog("Selecting Location From Drop Down"+_anyLocationField.toString()+"<br>");
        log.info("Selecting Location From Drop Down"+_anyLocationField.toString());
        selectByVisibleTextFromDropDown(_anyLocationField,location);
    }
    //Select Price From Drop Down
    public void selectPriceFromDropDown(String price){
        Reporter.addStepLog("Selecting Price From Drop Down"+_priceField.toString()+"<br>");
        log.info("Selecting Price From Drop Down"+_priceField.toString());
        selectByVisibleTextFromDropDown(_priceField,price);
    }
    //Click on Find My Next Car
public void clickOnFindMyNextCar(){
        Reporter.addStepLog("Clicking On Find My Next Car Button"+_findMyNextCarBtn.toString()+"<br>");
        log.info("Clicking On Find My Next Car Button"+_findMyNextCarBtn.toString());
        clickOnElement(_findMyNextCarBtn);
}
}
