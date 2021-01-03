package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyAndKids extends NavigationBar{
    private final Logger LOGGER= LogManager.getLogger(BabyAndKids.class);
    //beds
    private static final By MouseHoverBedSize=By.xpath("//*[@id='bd']//span[text()='Bed Size']");
    private static final By SizeToddler=By.xpath("//*[@id='bd']//span[text()='Toddler']/../../label[@class='pl-SelectableInput']");
    private static final By MouseHoverColor=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ColorWhite=By.xpath("//*[@id='bd']//span[text()='White']/../../label[@class='pl-Checkbox']");
    private static final By SelectBed=By.xpath("//*[@id='bd']//h2[text()='Robidoux Convertible Toddler Bed']");

    //Bounce
    private static final By MouseHoverAge=By.xpath("//*[@id='bd']//span[text()='Age and Number of Kids']");
    private static final By SelectAge=By.xpath("//*[@id='bd']//span[text()='2 Years']/../../label[@class='pl-Checkbox']");
    private static final By SelectBounceHouse=By.xpath("//*[@id='bd']//h2[text()='Endless Fun 11-in-1 Inflatable Water Bounce House']");
    //Dresser
    private static final By MouseHoverColorDresser=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ColorWhiteDresser=By.xpath("//*[@id='bd']//span[text()='White']/../../label[@class='pl-Checkbox']");
    private static final By SelectDresser=By.xpath("//*[@id='bd']//h2[text()='Essex 6 Drawer Double Dresser']");
    //ShopUnderPrice
    private static final By MouseHoverAgeShop=By.xpath("//*[@id='bd']//span[text()='Age Group']");
    private static final By SelectAgeShop=By.xpath("//*[@id='bd']//span[text()='2 - 4 Years']/../../label[@class='pl-Checkbox']");
    private static final By SelectItem=By.xpath("//*[@id='bd']//h2[text()='Chewelah Kids Cotton Foam Chair']");
    private static final By AddToCart=By.id("btn-add-to-cart");
    private static final By ClickReviewCart=By.xpath("//span[text()='Review Cart']/../../a[@class='Button Button--transactionAlt Button--fullWidth']");
    //Toy Organizer
    private static final By MouseHoverColorToy=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ColorWhiteToy=By.xpath("//*[@id='bd']//span[text()='White']/../../label[@class='pl-Checkbox']");
    private static final By SelectDresserToy=By.xpath("//*[@id='bd']//h2[text()='Brecken Kid Toy Organizer']");

    public BabyAndKids(WebDriver driver) {
        super(driver);
    }
    public BabyAndKids MouseSizeBed(){
        ActOn.element(driver,MouseHoverBedSize).mouseHover();
        LOGGER.info("Mouse hover bed size");
        return this;
    }
    public BabyAndKids ClickToddlerBed(){
        ActOn.element(driver,SizeToddler).click();
        LOGGER.info("select Toddler Bed");
        return  this;
    }
    public BabyAndKids MouseHoverColorBed(){
        ActOn.element(driver,MouseHoverColor).mouseHover();
        LOGGER.info("Mouse Hover Color Bed");
        return this;
    }
    public BabyAndKids ClickWhiteBed(){
        ActOn.element(driver,ColorWhite).click();
        LOGGER.info("select white bed");
        return this;
    }
    public BabyAndKids ClickItemBed() {
        ActOn.element(driver,SelectBed).click();
        LOGGER.info("Select the baby bed item which you want to validate");
        return this;
    }
    //BounceHouses################################################################################
    public BabyAndKids MouseHoverBounceHouse(){
        ActOn.element(driver,MouseHoverAge).mouseHover();
        LOGGER.info("Mouse Hover Age");
        return this;
    }
    public BabyAndKids ClickAgeForBounceHouse(){
        ActOn.element(driver,SelectAge).click();
        LOGGER.info("Select Age");
        return this;
    }
    public BabyAndKids ClickItemBounceHouse(){
        ActOn.element(driver,SelectBounceHouse).click();
        LOGGER.info("Select Bounce House");
        return this;
    }

    //Dresser###################################################################################
    public BabyAndKids MouseHoverDresser(){
        ActOn.element(driver,MouseHoverColorDresser).mouseHover();
        LOGGER.info("Mouse Hover Color Dresser");
        return this;
    }
    public BabyAndKids ClickColorForDresser(){
        ActOn.element(driver,ColorWhiteDresser).click();
        LOGGER.info("select Color White Dresser");
        return this;
    }
    public BabyAndKids ClickOnADresser(){
        ActOn.element(driver,SelectDresser).click();
        LOGGER.info("Select the dresser item which you want to validate");
        return this;
    }

    //ShopUnderPrice#############################################################################
    public BabyAndKids MouseHoverUnderShop(){
        ActOn.element(driver,MouseHoverAgeShop).mouseHover();
        LOGGER.info("Mouse Hover Age Shop");
        return this;
    }
    public BabyAndKids ClickAgeForUnderShop(){
        ActOn.element(driver,SelectAgeShop).click();
        LOGGER.info("Select Age Shop");
        return this;
    }
    public BabyAndKids ClickAnItemForUnderShop(){
        ActOn.element(driver,SelectItem).click();
        LOGGER.info("Select the item of under shop which you want to validate");
        return this;
    }
    public BabyAndKids AddToCartForUnderShop(){
        ActOn.browser(driver).clickBrowserTab(1);
        LOGGER.info("different page open");
        ActOn.element(driver,AddToCart).click();
        LOGGER.info("Item added to cart");
        return this;
    }

    public BabyAndKids ClickReviewCartUnderShop(){
        ActOn.element(driver,ClickReviewCart).click();
        LOGGER.info("Click ReviewCart");
        return this;
    }

    //Toy organizer#####################################################################################
    public BabyAndKids MouseHoverOrganizerToy(){
        ActOn.element(driver,MouseHoverColorToy).mouseHover();
        LOGGER.info("Mouse Hover Color Toy");
        return this;
    }
    public BabyAndKids ClickWhiteOrganizerToy(){
        ActOn.element(driver,ColorWhiteToy).click();
        LOGGER.info("Color White Toy");
        return this;
    }

    public BabyAndKids ClickAnOrganizingToy(){
        ActOn.element(driver,SelectDresserToy).click();
        LOGGER.info("Select Dresser Toy");
        return this;
    }
  //  ###########################
  public BabyAndKids ValidationItemWithText(String itemPrice){
      ActOn.browser(driver).clickBrowserTab(1);
      By price = By.xpath("//*[@id='bd']//span[text()='" + itemPrice + "']");
      AssertThat.elementAssertions(driver,price).elementExist();
      LOGGER.info("validation item price");
      return this;
  }

}

