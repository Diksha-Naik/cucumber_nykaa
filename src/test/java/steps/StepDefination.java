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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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

    @Given("The user navigate to the home page of nykaa")
    public void the_user_navigate_to_the_home_page_of_nykaa() {
        url = QaProps.getValue("url");
        driver.get(url);

    }

    @When("The user can able to hover the cursor on Brand")
    public void the_user_can_able_to_hover_the_cursor_on_brand() {
        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
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
    public void the_user_should_get_the_maybelline_page() throws InterruptedException {
        WebElement MaybellinePage = nykaaPage.getMaybellinePage();
        Thread.sleep(2000);
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


    @When("The user can able to hover the cursor on luxe")
    public void the_user_can_able_to_hover_the_cursor_on_luxe()  {
        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
       WaitUtil.waitTillVisible(driver,nykaaPage.getLuxe());
        action.moveToElement(nykaaPage.getLuxe()).build().perform();
    }

    @Then("The user should get the menu page of luxe")
    public void the_user_should_get_the_menu_page_of_luxe() {
        WebElement menu6 = nykaaPage.getLuxePage();
        Assert.assertTrue(menu6.isDisplayed());
    }

    @And("The user can able to hover the cursor on Fragrance")
    public void the_user_can_able_to_hover_the_cursor_on_fragrance() {
        action.moveToElement(nykaaPage.getFragrance()).build().perform();
    }

    @Then("The user should get the menu page of Fragrance")
    public void the_user_should_get_the_menu_page_of_fragrance() {
        Assert.assertTrue(nykaaPage.getFragrancePage().isDisplayed());
    }

    @And("The user can able to click on deodorant")
    public void the_user_can_able_to_click_on_deodorant()  {
        WaitUtil.waitTillVisible(driver,nykaaPage.getDeodorants());
        nykaaPage.getDeodorants().click();
    }

    @Then("The user should get deodorant page")
    public void the_user_should_get_deodorant_page() {
        Assert.assertTrue(nykaaPage.getDeodorantsPage().isDisplayed());
    }

    @And("The user can able to click in on luxe")
    public void the_user_can_able_to_click_in_on_luxe() throws InterruptedException {
        url4 = QaProps.getValue("url4");
        ClickUtil.click(driver,nykaaPage.getLuxe());
        Thread.sleep(2000);
        driver.getCurrentUrl();
        driver.get(url4);
    }

    @Then("The user should redirect to luxe main page and come back to the main page")
    public void the_user_should_redirect_to_luxe_main_page_and_come_back_to_the_main_page() {
        data = TestDataReader.getData(scenario.getName());
        Assert.assertEquals(nykaaPage.getLuxeMainPage().getText(), data.get("ExceptedResultOfLuxePage"));
        currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);

    }


    @When("The user can able to hover the cursor on luxe and than on skin")
    public void the_user_can_able_to_hover_the_cursor_on_luxe_and_than_on_skin()  {
        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
        WaitUtil.waitTillVisible(driver,nykaaPage.getLuxe());
        action.moveToElement(nykaaPage.getLuxe()).build().perform();
        action.moveToElement(nykaaPage.getLuxeSkinButton()).build().perform();
    }

    @Then("The user should get luxe skin page")
    public void the_user_should_get_luxe_skin_page() {
        Assert.assertTrue(nykaaPage.getSkinPage().isDisplayed());
    }

    @And("The user should able to click on Toner")
    public void the_user_should_able_to_click_on_toner() throws InterruptedException {
        url6 = QaProps.getValue("url6");
        nykaaPage.getToner().click();
        Thread.sleep(5000);
        driver.getCurrentUrl();
        driver.get(url6);
        currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    @Then("The User should get the toner page")
    public void the_user_should_get_the_toner_page() {
        Assert.assertTrue(nykaaPage.getTonerPage().isDisplayed());
    }

    @And("The user can able to click on brand and select the NUXE")
    public void the_user_can_able_to_click_on_brand_and_select_the_nuxe() {
        ClickUtil.click(driver,nykaaPage.getTonerBrand());
        ClickUtil.click(driver,nykaaPage.getNuxeProduct());
    }

    @Then("The selected item should display")
    public void the_selected_item_should_display()  {
        WaitUtil.waitTillVisible(driver,nykaaPage.getNuxePage());
        Assert.assertTrue(nykaaPage.getNuxePage().isDisplayed());

    }

    @And("The user can able to add product to cart")
    public void the_user_can_able_to_add_product_to_cart()  {
        WaitUtil.waitTillVisible(driver,nykaaPage.getHoverOverProduct());
        action.moveToElement(nykaaPage.getHoverOverProduct()).build().perform();
        ClickUtil.click(driver,nykaaPage.getAddToBag());
        WaitUtil.waitTillVisible(driver,nykaaPage.getBag());
        ClickUtil.click(driver,nykaaPage.getBag());

    }

    @Then("The selected item should be displayed in bad")
    public void the_selected_item_should_be_displayed_in_bad() {
        WaitUtil.waitTillVisible(driver,nykaaPage.getBagpage());
        Assert.assertTrue(nykaaPage.getBagpage().isDisplayed());
    }


    @When("The user can able to goto deodorant page")
    public void the_user_can_able_to_goto_deodorant_page() {
        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
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

    @When("The user can able to click the jean page and click on check pin Code")
    public void the_user_can_able_to_click_the_jean_page_and_click_on_check_pin_code() {

        nykaaPage = new NykaaPage(driver);
        action = new Actions(driver);
        url3 = QaProps.getValue("url3");
        driver.get(url3);
        ClickUtil.click(driver,nykaaPage.getCheckButton());
    }

    @Then("The Error message should be displayed that {string}")
    public void the_error_message_should_be_displayed_that(String string) {
        data = TestDataReader.getData(scenario.getName());
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
    @When("The user can able to click on Enter")
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
