package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NykaaPage;
import utils.*;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class StepDefination {
    private WebDriver driver;
    NykaaPage nykaaPage;
    String url, url2, url3, url4, url5, url6;
    HashMap<String, String> data;
    Scenario scenario;
    String currentWindow;
    Actions action;

    public StepDefination(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }

    @Before(order = 1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

//Verify that the user is able to work with Brand
    @Given("The user navigate to the home page of nykaa")
    public void the_user_navigate_to_the_home_page_of_nykaa() {
        url = QaProps.getValue("url");
        driver.get(url);
        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
        data = TestDataReader.getData(scenario.getName());

    }

    @When("The user can able to hover the cursor on Brand")
    public void the_user_can_able_to_hover_the_cursor_on_brand() {

        action.moveToElement(nykaaPage.getHooverOnBrand()).build().perform();

    }

    @Then("The user should get the menu page of brand")
    public void the_user_should_get_the_menu_page_of_brand() {
        WebElement menuPage = nykaaPage.getDisplayMenuPage();
        Assert.assertTrue(menuPage.isDisplayed());

    }

    @And("The user can able to click on the Maybelline icon in brand")
    public void the_user_can_able_to_click_on_the_maybelline_icon_in_brand() {
        ClickUtil.click(driver,nykaaPage.getMaybellineSymbol());


    }

    @Then("The user should get the Maybelline Page")
    public void the_user_should_get_the_maybelline_page(){
        WebElement MaybellinePage = nykaaPage.getMaybellinePage();
        WaitUtil.waitTillVisible(driver,nykaaPage.getMaybellinePage());
        Assert.assertTrue(MaybellinePage.isDisplayed());

    }

    @And("The user can able to hover over only at nykaa and")
    public void the_user_can_able_to_hover_over_only_at_nykaa_and() {
        action.moveToElement(nykaaPage.getHooverOnBrand()).build().perform();
        action.moveToElement(nykaaPage.getOnlyAtNykaa()).build().perform();

    }

    @Then("The user should get Only At Nykaa page")
    public void the_user_should_get_only_at_nykaa_page() {
        WebElement OnlyAtNykaa = nykaaPage.getOnlyAtNykaa();
        Assert.assertTrue(OnlyAtNykaa.isDisplayed());

    }

    @And("The user can able to click on Nykaa Cosmetics")
    public void the_user_can_able_to_click_on_nykaa_cosmetics() {
        ClickUtil.click(driver,nykaaPage.getNykaaCosmetics());


    }

    @Then("the user should get Nykaa Cosmetics page")
    public void the_user_should_get_nykaa_cosmetics_page()  {
        WaitUtil.waitTillVisible(driver,nykaaPage.getNykaaCosmeticsPage());
        WebElement NykaaCosmeticsPage = nykaaPage.getNykaaCosmeticsPage();
        Assert.assertTrue(NykaaCosmeticsPage.isDisplayed());

    }

    //Verify that the user able search product in brand drop down
  @When("The user can able to hover the cursor over Brand")
  public void the_user_can_able_to_hover_the_cursor_over_brand() {
      action.moveToElement(nykaaPage.getHooverOnBrand()).build().perform();
  }
    @Then("The menu page of brand should be displayed")
    public void the_menu_page_of_brand_should_be_displayed() {
        WebElement menuPage = nykaaPage.getDisplayMenuPage();
        Assert.assertTrue(menuPage.isDisplayed());
    }
    @Then("The user can able to search in brand of nykaa")
    public void the_user_can_able_to_search_in_brand_of_nykaa() {

        WaitUtil.waitTillVisible(driver,nykaaPage.getBrandSearchBox());
  nykaaPage.getBrandSearchBox().sendKeys(data.get("BrandSearchBoxInput"));
    }
    @And("the user can able to clck on Lakme")
    public void the_user_can_able_to_clck_on_lakme() {
        Wait wait1 = new FluentWait(driver)
      .withTimeout(10, TimeUnit.SECONDS)
      .pollingEvery(2, TimeUnit.SECONDS)
     .ignoring(Exception.class);
  ClickUtil.click(driver,nykaaPage.getLakme());
    }
    @Then("The user will get the lakme page")
    public void the_user_will_get_the_lakme_page() {
        WebElement menu3 = nykaaPage.getLakmePage();
  Assert.assertTrue(menu3.isDisplayed());
    }
    @And("The user can again able to hover the cursor over brand")
    public void the_user_can_again_able_to_hover_the_cursor_over_brand() {
        driver.get(url);
  action.moveToElement(nykaaPage.getHooverOnBrand()).build().perform();
    }
    @And("The user should click on letter L")
    public void the_user_should_click_on_letter_l() {
        action.moveToElement(nykaaPage.getLetterL()).build().perform();
    }
    @Then("The L letter item should display")
    public void the_l_letter_item_should_display() {
        Assert.assertTrue(nykaaPage.getLNameBrand().isDisplayed());
    }
    @And("The user can able to click on LOrealParis")
    public void the_user_can_able_to_click_on_l_oreal_paris() {
        ClickUtil.click(driver,nykaaPage.getLOrealParis());
    }
    @Then("The LOrealParis page should be displayed in bad")
    public void the_l_oreal_paris_page_should_be_displayed_in_bad() {
        Assert.assertTrue(nykaaPage.getLOrealParispage().isDisplayed());
    }

//Verify that the user able to work with the help
@When("The user can navigate to help page")
public void the_user_can_navigate_to_help_page() {
    url5 = QaProps.getValue("url5");
    driver.get(url5);
}
    @When("The user can able to click on order related issue")
    public void the_user_can_able_to_click_on_order_related_issue() {
        ClickUtil.click(driver,nykaaPage.getOrderRelatedIssue());
    }
    @Then("The order Issue page should displayed")
    public void the_order_issue_page_should_displayed() {
        Assert.assertTrue(nykaaPage.getOrderIssue().isDisplayed());
    }
    @And("The user can able to click on order")
    public void the_user_can_able_to_click_on_order() {
       ClickUtil.click(driver,nykaaPage.getClickOnOrder());
    }
    @Then("Order page should be displayed")
    public void order_page_should_be_displayed() {
        String text1=nykaaPage.getOrderPage().getText();
     Assert.assertEquals(text1,data.get("ExceptedResult"));
    }

//Verify that the user is able to select product
    @When("The user can able to goto deodorant page")
    public void the_user_can_able_to_goto_deodorant_page() {
        url2 = QaProps.getValue("url2");
        driver.get(url2);
    }

    @Then("The user should get the deodorant page")
    public void the_user_should_get_the_deodorant_page() {
        Assert.assertTrue(nykaaPage.getDeodorantsPage().isDisplayed());
    }

    @And("The user can able to filter the product according to need")
    public void the_user_can_able_to_filter_the_product_according_to_need() {

        ClickUtil.click(driver,nykaaPage.getPopularityButton());
        ClickUtil.click(driver,nykaaPage.getClickOnHighToLowbutton());
        ClickUtil.click(driver,nykaaPage.getBrandbutton());
        ClickUtil.click(driver,nykaaPage.getJeanPaulGaultier2());


    }

    @Then("The product should be displyed")
    public void the_product_should_be_displyed() {
        WaitUtil.waitTillVisible(driver,nykaaPage.getJeanPaulGaultierPage());
        Assert.assertTrue(nykaaPage.getJeanPaulGaultierPage().isDisplayed());

    }
//Verify that user is able to enter valid and invalid pin Code
    @When("The user can able to click the jean page and click on check pin Code")
    public void the_user_can_able_to_click_the_jean_page_and_click_on_check_pin_code() {

        url3 = QaProps.getValue("url3");
        driver.get(url3);
        ClickUtil.click(driver,nykaaPage.getCheckButton());
    }

    @Then("The Error message should be displayed that {string}")
    public void the_error_message_should_be_displayed_that(String string) {

        String text = nykaaPage.getErrorMessage().getText();
        Assert.assertEquals(text, data.get("ExceptedNullError"));
    }

    @And("The user Enter the wrong Pin Code")
    public void the_user_enter_the_wrong_pin_code()  {
        nykaaPage.getEnterPinCode().sendKeys(data.get("WrongPincode"));
        nykaaPage.getEnterPinCode().sendKeys(Keys.ENTER);


    }

    @Then("The user should get the error message that\"Information not found for entered pin Code.\"")
    public void the_user_should_get_the_error_message_that_information_not_found_for_entered_pin_code() {
        WaitUtil.waitTillVisible(driver,nykaaPage.getWrongPinErrorMessage());
        String text2 = nykaaPage.getWrongPinErrorMessage().getText();
        Assert.assertEquals(text2, data.get("ExceptedWrongPin"));

    }

    @And("The user can add correct pin Code")
    public void the_user_can_add_correct_pin_code(){
        ClickUtil.click(driver,nykaaPage.getChangeButton());
        nykaaPage.getEnterPinCode().clear();
        WaitUtil.waitTillVisible(driver,nykaaPage.getEnterPinCode());
        nykaaPage.getEnterPinCode().sendKeys(data.get("CorrectPinCode"));
        ClickUtil.click(driver,nykaaPage.getCheckButton());


    }

    @Then("The user should get the place name")
    public void the_user_should_get_the_place_name() {
        WaitUtil.waitTillVisible(driver,nykaaPage.getCorrectPinErrorMessage());
        String text3 = nykaaPage.getCorrectPinErrorMessage().getText();
        Assert.assertEquals(text3, data.get("ExceptedRightPin"));
    }
//Verify That user can search for FAQ in support page
    @Given("The user is able to goto the nykaa support page")
    public void the_user_is_able_to_goto_the_nykaa_support_page() {
        url5 = QaProps.getValue("url5");
        driver.get(url5);

    }
    @When("The user can able to add the Queries in {string}")
    public void the_user_can_able_to_add_the_queries_in(String searchFAQ) {
        nykaaPage = new NykaaPage(driver);
       Wait wait1 = new FluentWait(driver)
               .withTimeout(10, TimeUnit.SECONDS)
              .pollingEvery(2, TimeUnit.SECONDS)
               .ignoring(Exception.class);
        WebElement Input=nykaaPage.getHelp();
        Input.sendKeys(searchFAQ);
    }
    @And("The user can able to click on Enter")
    public void the_user_can_able_to_click_on_enter() {
        nykaaPage.getHelp().sendKeys(Keys.ENTER);
    }
    @Then("The user should get the relevant page")
    public void the_user_should_get_the_relevant_page() {
        WaitUtil.waitTillVisible(driver,nykaaPage.getResult());
        WebElement text=nykaaPage.getResult();
        Assert.assertTrue(text.isDisplayed());
    }
}
