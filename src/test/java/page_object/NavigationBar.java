package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final Logger LOGGER= LogManager.getLogger(NavigationBar.class);
    //cabinet
    private static final By MouseHover=By.xpath("//*[@id='store_nav']//li/a[text()='Furniture']");
    private static final By ClickCabinet=By.xpath("//*[@id='store_nav']//a[text()='Cabinets & Chests']");
    //chair
    private static final By ClickAccentChairs=By.xpath("//*[@id='store_nav']//a[text()='Accent Chairs']");
    //coffee table
    private static final By ClickCoffeeTable=By.xpath("//*[@id='store_nav']//a[text()='Coffee Tables']");
    private static final By ClickCoffeeTableAgain=By.xpath("//*[@id='45982']//div[text()='Coffee Tables']");
    //Sofa
    private static final By ClickSofa=By.xpath("//*[@id='store_nav']//a[text()='Sofas & Loveseats']");
    //TV
    private static final By ClickTVStand=By.xpath("//*[@id='store_nav']//a[text()='TV Stands']");

    //Beds
    private static final By MouseHoverBaby=By.xpath("//*[@id='store_nav']//li/a[text()='Baby & Kids']");
    private static final By ClickBabyAndKids=By.xpath("//*[@id='store_nav']//a[text()='Kids Beds']");
    //BounceHouse
    private static final By ClickBounceHouses=By.xpath("//*[@id='store_nav']//a[text()='Bounce Houses & Inflatable Slides']");

    //Dresser
    private static final By ClickBabyAndKidsDresser=By.xpath("//*[@id='store_nav']//a[text()='Kids Dressers']");
    //ShopUnderPrice
    private static final By ClickUnderPrice=By.xpath("//*[@id='store_nav']//p[text()='Kids Seating Under $100']");
    //ToyOrganizer
    private static final By ClickBabyAndKidsToy=By.xpath("//*[@id='store_nav']//a[text()='Toy Organizers']");

    WebDriver driver;

    public NavigationBar(WebDriver driver){
        this.driver=driver;
    }
    public NavigationBar MouseHoverHome(){
        ActOn.element(driver,MouseHover).mouseHover();
        LOGGER.info("Mouse hover on furniture home page");
        return this;
    }
    public Furniture clickOnCabinet(){
    ActOn.element(driver,ClickCabinet).click();
    LOGGER.info("Click the link of cabinet");
        return new Furniture(driver);
    }
    //#########################################
    public Furniture ClickAccentChair(){
        ActOn.element(driver,ClickAccentChairs).click();
        LOGGER.info("Click the link of Accent chair");
        return new Furniture(driver);
    }
    //###################################################coffee table########################
    public Furniture ClickTablesCoffee(){
        ActOn.element(driver,ClickCoffeeTable).click();
        LOGGER.info("Click the link of coffee table");
        return new Furniture(driver);
    }
    public Furniture ClickAgainCoffee(){
        ActOn.element(driver,ClickCoffeeTableAgain).click();
        LOGGER.info("Click again the link of coffee table");
        return new Furniture(driver);
    }
    //#######################sofa######################################
    public Furniture ClickSofa(){
        ActOn.element(driver,ClickSofa).click();
        LOGGER.info("Click the link of bed and sofa");
        return new Furniture(driver);
    }
    //###########################################TV STAND#################################
    public Furniture ClickStandsTV(){
        ActOn.element(driver,ClickTVStand).click();
        LOGGER.info("Click the link of TV stand");
        return new Furniture(driver);
    }

    //###############################################Beds######################################

    public NavigationBar MouseHoverHomePage(){
        ActOn.element(driver,MouseHoverBaby).mouseHover();
        LOGGER.info("Mouse hover on baby and kids");
        return this;
    }
    public BabyAndKids ClickBabyAndKidsBed(){
        ActOn.element(driver,ClickBabyAndKids).click();
        LOGGER.info("Click the link of kids bed");
        return new BabyAndKids(driver);
    }
    //#####################################
    public BabyAndKids ClickBabyAndKidsBounceHouse(){
        ActOn.element(driver,ClickBounceHouses).click();
        LOGGER.info("Click the link of bounce houses");
        return new BabyAndKids(driver);
    }
    public BabyAndKids ClickBabyAndKidsDresser(){
        ActOn.element(driver,ClickBabyAndKidsDresser).click();
        LOGGER.info("Click the link of dresser");
        return new BabyAndKids(driver);
    }
    public BabyAndKids ClickBabyAndKidsUnderShop(){
        ActOn.element(driver,ClickUnderPrice).click();
        LOGGER.info("Click the link of shop under price $100");
        return new BabyAndKids(driver);
    }
    public BabyAndKids ClickBabyAndKidsOrganizingToy(){
        ActOn.element(driver,ClickBabyAndKidsToy).click();
        LOGGER.info("Click the link of toy organizer");
        return new BabyAndKids(driver);
    }

}

