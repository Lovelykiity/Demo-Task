package au.com.carsguide.www.cucumber.stepdefs;

import au.com.carsguide.www.pages.AudiA4Page;
import au.com.carsguide.www.pages.HomePage;
import au.com.carsguide.www.pages.NewAndUsedCarsSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarSearch {
    @And("^click on submenu Used Search link$")
    public void clickOnSubmenuUsedSearchLink() {
        new HomePage().clickOnUsedLink();

    }

    @And("^select carMaker \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarMakerFromAnyMakeDropdown(String brand)  {
        new NewAndUsedCarsSearchPage().selectCarFromDropDown(brand);

    }

    @And("^select carModel \"([^\"]*)\" from AmyModel dropdown$")
    public void selectCarModelFromAmyModelDropdown(String model){
        new NewAndUsedCarsSearchPage().selectSeriesAsCarModel(model);

    }

    @And("^select location \"([^\"]*)\"  from SelectLocation dropdown$")
    public void selectLocationFromSelectLocationDropdown(String location)  {
        new NewAndUsedCarsSearchPage().selectLocationFromDropDown(location);

    }

    @And("^select price \"([^\"]*)\" from price dropdown$")
    public void selectPriceFromPriceDropdown(String price) {
        new NewAndUsedCarsSearchPage().selectPriceFromDropDown(price);

    }

    @And("^click on Find_My_Car button$")
    public void clickOnFind_My_CarButton() {
        new NewAndUsedCarsSearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see list of Used cars \"([^\"]*)\"$")
    public void iShouldSeeListOfUsedCars(String text)  {
        Assert.assertEquals(text,new AudiA4Page().vrifyAudiA4PageText());

    }

    @And("^the page title should match expected title  \"([^\"]*)\"$")
    public void thePageTitleShouldMatchExpectedTitle(String title)  {
        Assert.assertEquals(title,new AudiA4Page().getTitle());

    }
}
