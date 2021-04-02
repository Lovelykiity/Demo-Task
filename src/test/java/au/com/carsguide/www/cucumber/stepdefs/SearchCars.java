package au.com.carsguide.www.cucumber.stepdefs;

import au.com.carsguide.www.pages.BmwOneSeriesPage;
import au.com.carsguide.www.pages.HomePage;
import au.com.carsguide.www.pages.NewAndUsedCarsSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchCars {
    @Given("^I am on the Home Page of CarsGuide Website$")
    public void iAmOnTheHomePageOfCarsGuideWebsite() {

    }

    @When("^I mouse hover to buy\\+sell Menu$")
    public void iMouseHoverToBuySellMenu() {
        new HomePage().mouseHoverToBuySale();
    }

    @And("^click on \"([^\"]*)\" link$")
    public void clickOnLink(String arg0)  {
        new HomePage().searchCarsLink();
    }

    @And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarBrandAsFromAnyMakeDropdown(String brand)  {
        new NewAndUsedCarsSearchPage().selectCarFromDropDown(brand);

    }

    @And("^select \"([^\"]*)\" as car model$")
    public void selectAsCarModel(String model) {
        new NewAndUsedCarsSearchPage().selectSeriesAsCarModel(model);

    }

    @And("^select location as \"([^\"]*)\" from Select Location dropdown$")
    public void selectLocationAsFromSelectLocationDropdown(String location)  {
        new NewAndUsedCarsSearchPage().selectLocationFromDropDown(location);

    }

    @And("^select \"([^\"]*)\" as price$")
    public void selectAsPrice(String price)  {
        new NewAndUsedCarsSearchPage().selectPriceFromDropDown(price);

    }

    @And("^click on Find_My_Next_Car button$")
    public void clickOnFind_My_Next_CarButton() {
        new NewAndUsedCarsSearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see list of searched cars \"([^\"]*)\"$")
    public void iShouldSeeListOfSearchedCars(String text)  {
        Assert.assertEquals(text,new BmwOneSeriesPage().verifyBmwPageText());

    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void thePageTitleShouldBe(String title) {
        Assert.assertEquals(title,new BmwOneSeriesPage().getTitle());

    }
}
