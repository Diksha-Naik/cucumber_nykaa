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




    //To hoover over luxe
    @FindBy(xpath = "//a[@href='https://www.nykaa.com//luxe-focus']")
            @Getter
     WebElement luxe;
    //To check  the visibility of the LuxePage
    @FindBy(xpath = "(//section[@class='popUpsbox'])[1]")
            @Getter
     WebElement luxePage;
    //To click on fragrance
    @FindBy(xpath = "(//a[text()='Fragrance'])[1]")
            @Getter
     WebElement fragrance;
    //To check the visibility of fragrance Page
    @FindBy(xpath = "(//div[@class='popUpsContentBox'])[1]")
            @Getter
     WebElement fragrancePage;
    //To click on deodrants
    @FindBy(xpath = "//a[@href='https://www.nykaa.com/luxury-deos/c/21928']")
            @Getter
     WebElement deodorants;
    //To check the visibility of the deodrant Page;
    @FindBy(xpath = "//div[@class='css-e82s8r']")
            @Getter
     WebElement deodorantsPage;
    //To go to main luxe page
    @FindBy(xpath = "(//div[@class='PageHeading title-medium'])[1]")
            @Getter
     WebElement luxeMainPage;

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


    //To click on the toner
    @FindBy(xpath = "//a[text()=' Toner']")
            @Getter
     WebElement toner;
    //To click on skin button
    @FindBy(xpath = "//a[@data-link-name=\"#luxeSkin\"]")
            @Getter
     WebElement luxeSkinButton;
    //To click on skin page
    @FindBy(xpath = "//div[@class=\"css-e82s8r\"]")
            @Getter
     WebElement skinPage;

    @FindBy(id="first-filter")
            @Getter
     WebElement tonerBrand;
    @FindBy(xpath = "(//div[@class=\"control-box css-1ap0cm9\"])[21]")
            @Getter
     WebElement nuxeProduct;
    @FindBy(xpath = "//div[@class=\"css-ifdzs8\"]")
            @Getter
     WebElement  hoverOverProduct;
    @FindBy(xpath = "//span[text()='Add to Bag']")
            @Getter
     WebElement addToBag;
    @FindBy(xpath = "//div[@class=\"css-0 e1ewpqpu1\"]")
            @Getter
     WebElement bag;
    @FindBy(xpath = "//div[@class='css-lgbws3']")
            @Getter
     WebElement tonerPage;

    @FindBy(xpath= "//div[@class=\"    css-1w65igk e1j92jav0\"]")
            @Getter
     WebElement bagpage;
    @FindBy(xpath = "//a[@href=\"/nuxe-toning-mist/p/1091048?productId=1091048&pps=1\"]")
            @Getter
    WebElement nuxePage;
    @FindBy(id = "TxtSrchVal")
            @Getter
     WebElement help;

    @FindBy(id = "step-1")
            @Getter
     WebElement result;

//    public WebElement getHelp() {
//        return help;
//    }
//
//    public WebElement getResult() {
//        return result;
//    }
//    public WebElement getNuxePage() {
//        return nuxePage;
//    }
//
//    public WebElement getBagpage() {
//        return bagpage;
//    }
//
//
//
//    public WebElement getTonerPage() {
//        return tonerPage;
//    }
//
//
//
//
//    public WebElement getTonerBrand() {
//        return tonerBrand;
//    }
//
//    public WebElement getNuxeProduct() {
//        return nuxeProduct;
//    }
//
//    public WebElement getHoverOverProduct() {
//        return hoverOverProduct;
//    }
//
//    public WebElement getLuxeSkinButton() {
//        return luxeSkinButton;
//    }
//
//    public WebElement getChangeButton() {
//        return changeButton;
//    }
//
//    public WebElement getJeanPaulGaultier2() {
//        return JeanPaulGaultier2;
//    }
//    public WebElement getBag() {
//        return bag;
//    }
//    public WebElement getToner() {
//        return toner;
//    }
//
//    public WebElement getSkinPage() {
//        return skinPage;
//    }
//
//    public WebElement getAddToBag() {
//        return addToBag;
//    }
//
//    public WebElement getLuxe() {
//        return luxe;
//    }
//    public WebElement getLuxePage() {
//        return luxePage;
//    }
//    public WebElement getFragrance() {
//        return fragrance;
//    }
//    public WebElement getFragrancePage() {
//        return fragrancePage;
//    }
//
////    public WebElement getHooverOnBrand() {
////        return hooverOnBrand;
////    }
//
//    public WebElement getDisplayMenuPage() {
//        return displayMenuPage;
//    }
//
//    public WebElement getMaybellineSymbol() {
//        return maybellineSymbol;
//    }
//
//    public WebElement getMaybellinePage() {
//        return maybellinePage;
//    }
//
//    public WebElement getOnlyAtNykaa() {
//        return onlyAtNykaa;
//    }
//
//    public WebElement getNykaaCosmetics() {
//        return NykaaCosmetics;
//    }
//
//    public WebElement getNykaaCosmeticsPage() {
//        return NykaaCosmeticsPage;
//    }
//
//    public WebElement getDeodorants() {
//        return deodorants;
//    }
//
//    public WebElement getDeodorantsPage() {
//        return deodorantsPage;
//    }
//
//    public WebElement getLuxeMainPage() {
//        return luxeMainPage;
//    }
//
//    public WebElement getPopularityButton() {
//        return popularityButton;
//    }
//
//    public WebElement getClickOnHighToLowbutton() {
//        return clickOnHighToLowbutton;
//    }
//
//    public WebElement getBrandbutton() {
//        return brandbutton;
//    }
//
//    public WebElement getJeanPaulGaultierPage() {
//        return JeanPaulGaultierPage;
//    }
//
//    public WebElement getEnterPinCode() {
//        return enterPinCode;
//    }
//
//    public WebElement getCheckButton() {
//        return checkButton;
//    }
//
//    public WebElement getErrorMessage() {
//        return errorMessage;
//    }
//
//    public WebElement getWrongPinErrorMessage() {
//        return wrongPinErrorMessage;
//    }
//
//    public WebElement getCorrectPinErrorMessage() {
//        return correctPinErrorMessage;
//    }
}
