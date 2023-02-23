package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NykaaPage {
    private WebDriver driver;
    public NykaaPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Verify that the user is able to work with Brand
    //To Hoover cursor on Brand
    @FindBy(xpath = "(//a[@class='css-1mavm7h'])[2]")
    @Getter
     WebElement hooverOnBrand;

    //To check the menu is displayed
    @FindBy(xpath = "//ul[@class='hideArr normal-sub css-1i40r7m']")
            @Getter
     WebElement displayMenuPage;

    //To click on maybelline new york symbol
    @FindBy(xpath = "//a[@href='/brands/maybelline-new-york/c/596?eq=desktop']")
            @Getter
    WebElement maybellineSymbol;

    //To Check the maybellinePage is displayed
    @FindBy(xpath = "//div[@class='css-lgbws3']")
            @Getter
     WebElement maybellinePage;

    //To click on only at Nykaa
    @FindBy(xpath = "(//a[@href='/'])[5]")
            @Getter
     WebElement onlyAtNykaa;

    //To click on the nykaa cosmetic
    @FindBy(xpath = "//a[@href='/brands/nykaa-cosmetics/c/1937?intcmp=brand_menu,exclusive,nykaa']")
            @Getter
     WebElement NykaaCosmetics;

    //To check the visibility of Nykaa Cosmetics Page
    @FindBy(xpath = "//div[@ class='css-e82s8r']")
            @Getter
     WebElement NykaaCosmeticsPage;



    //Verify that the user is able to select product
    //To hoover over luxe
    @FindBy(xpath = "//a[@href='https://www.nykaa.com//luxe-focus']")
            @Getter
     WebElement luxe;

    //To check  the visibility of the LuxePage
    @FindBy(xpath = "(//section[@class='popUpsbox'])[1]")
            @Getter
     WebElement luxePage;

    //To click on deodrants
    @FindBy(xpath = "//a[@href='https://www.nykaa.com/luxury-deos/c/21928']")
            @Getter
     WebElement deodorants;

    //To check the visibility of the deodrant Page;
    @FindBy(xpath = "//div[@class='css-e82s8r']")
            @Getter
     WebElement deodorantsPage;

    //To click on popularity Button
    @FindBy(xpath = "//div[@class='css-0']")
            @Getter
     WebElement popularityButton;

    //To click on High To Low button
    @FindBy(xpath = "(//div[@class='control-box css-1ap0cm9'])[6]")
            @Getter
     WebElement clickOnHighToLowbutton;

    //To click on brand button
    @FindBy(xpath = "(//div[@class='filter-open css-1kwl9pj'])[2]")
            @Getter
     WebElement brandbutton;

    //To click on Jean Paul Gaultier2
    @FindBy(xpath = "(//div[@class='control-box css-1ap0cm9'])[11]")
            @Getter
     WebElement JeanPaulGaultier2;

    //To check visibility of Jean Paul Gaultier Page
    @FindBy(xpath = "//a[@href='/jean-paul-gaultier-scandal-eau-de-parfum/p/267265?productId=267265&pps=1']")
            @Getter
     WebElement JeanPaulGaultierPage;

    //To click on the jean page
    @FindBy(xpath = "//input[@placeholder=\"Enter pincode\"]")
            @Getter
     WebElement enterPinCode;

    //To click on the check button
    @FindBy(xpath = "//button[text()=\"Check\"]")
            @Getter
    WebElement checkButton;

    //To check the error message
    @FindBy(xpath = "//span[text()=\"Please enter valid pincode\"]")
            @Getter
     WebElement errorMessage;

    //To get the error messgae for wrong output
    @FindBy(xpath = "//span[text()=\"Information not found for entered pincode.\"]")
            @Getter
     WebElement wrongPinErrorMessage;

    //To get the error message for correct pin
    @FindBy(xpath = "//span[@class=\"css-ew9amy\"]")
            @Getter
     WebElement correctPinErrorMessage;

    //To click on change button
    @FindBy(xpath = "//button[text()=\"Change\"]")
            @Getter
     WebElement changeButton;



    //Verify That user can search for FAQ in support page
    //To search and enter product name
    @FindBy(id = "TxtSrchVal")
            @Getter
     WebElement help;

    //To get the result of the search
    @FindBy(id = "step-1")
            @Getter
     WebElement result;






   // Verify that the user able search product in brand drop down
    //To search in Lakme brand  search bar
    @FindBy(id = "brandSearchBox")
            @Getter
     WebElement brandSearchBox;

    //To click on Lamke
    @FindBy(xpath = "(//a[text()='Lakme'])[1]")
            @Getter
     WebElement lakme;

    //To check lakme page
    @FindBy(xpath = "//div[@class='css-lgbws3']")
           @Getter
     WebElement lakmePage;

    //To Search Letter L
    @FindBy(xpath = "(//li[@class='Nav-item'])[13]")
            @Getter
     WebElement letterL;

    //To check the all l letter brand appear
    @FindBy(xpath = "//div[@class='ss-wrapper']")
            @Getter
     WebElement LNameBrand;

    //To click on the Lo real Paris
    @FindBy(xpath = "(//a[text()=\"L'Oreal Paris\"])[2]")
            @Getter
     WebElement LOrealParis;

    //To go to lo real Paris page
    @FindBy(xpath = "//div[@class=\"css-lgbws3\"]")
    @Getter
   WebElement LOrealParispage;



    //Verify that the user able to work with the help
//To Click on Order related issue
    @FindBy(xpath = "(//div[@class='bkz-widget-box'])[1]")
            @Getter
   WebElement orderRelatedIssue;

    //To click on Help page
    @FindBy(xpath = "//section[@class='booking-widget']")
            @Getter
    WebElement HelpPage;

    //To click on order Issue
    @FindBy(id = "faq-main-content")
            @Getter
     WebElement orderIssue;

    //To click on Order
    @FindBy(xpath = "(//div[@class=\"card-header\"])[1]")
            @Getter
     WebElement clickOnOrder;

    //To click on order page
    @FindBy(xpath = "//h2[text()='Order Status']")
            @Getter
    WebElement orderPage;

}
