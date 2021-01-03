package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.BabyAndKids;
import page_object.NavigationBar;

public class BabySteps {
    private final Logger LOGGER= LogManager.getLogger(FurnitureSteps.class);

    WebDriver driver = Hooks.driver;
    @When("^User mouse hover on 'Baby & Kids' and click on the link of 'kids beds'$")
    public void ClickKidAndBed(){
        LOGGER.info("MouseHover for Baby&kids----Bed");
        new NavigationBar(driver)
                .MouseHoverHomePage()
                .ClickBabyAndKidsBed();
    }

    @And("^User click on 'Robidoux Convertible Toddler Bed' by selecting its size and color$")
    public void filterBed()  {
        LOGGER.info("All inputs for Baby&kids----Bed");
        new BabyAndKids(driver)
                .MouseSizeBed()
                .ClickToddlerBed()
                .MouseHoverColorBed()
                .ClickWhiteBed()
                .ClickItemBed();
    }
   // ##########################################bounce house########################################################

    @When("^User mouse hover on 'Baby & Kids' and click on the link of 'Bounce Houses & Inflatable Slides'$")
    public void mouseHoverBounceHouses(){
        LOGGER.info("MouseHover for Baby&kids----Bounce house");
        new NavigationBar(driver)
                .MouseHoverHomePage()
                .ClickBabyAndKidsBounceHouse();
    }

    @And("^User click on 'Endless Fun 11-in-1 Inflatable Water Bounce House' by selecting 'Age and Number of kids'$")
    public void filterBounceHouse(){
        LOGGER.info("All inputs for Baby&kids----Bounce house");
        new BabyAndKids(driver)
                .MouseHoverBounceHouse()
                .ClickAgeForBounceHouse()
                .ClickItemBounceHouse();
    }
    //#######################################Dresser###########################################################

    @When("^User mouse hover on 'Baby & Kids' and click on the link of 'Kids Dressers'$")
    public void mouseHoverDresser(){
        LOGGER.info("MouseHover for  Baby&kids----Dresser");
        new NavigationBar(driver)
                .MouseHoverHomePage()
                .ClickBabyAndKidsDresser();
    }

    @And("^User click on 'Essex 6 Drawer Double Dresser' by selecting its  'color'$")
    public void filterDresser(){
        LOGGER.info("All inputs for  Baby&kids----Dresser");
        new BabyAndKids(driver)
                .MouseHoverDresser()
                .ClickColorForDresser()
                .ClickOnADresser();
    }

    //#############################Shop under $100########################################

    @When("^User mouse hover on 'Baby & Kids' and click on the link of 'Kids Seating Under 100'$")
    public void mouseHoverShopByPrice(){
        LOGGER.info("MouseHover for ShopUnderPrice$100");
        new NavigationBar(driver)
                .MouseHoverHomePage()
                .ClickBabyAndKidsUnderShop();
    }

    @And("^User click on 'Chewelah Kids Cotton Foam Chair' by selecting its kids 'age'$")
    public void filterShopByPrice(){
        LOGGER.info("Inputs for ShopUnderPrice$100");
        new BabyAndKids(driver)
                .MouseHoverUnderShop()
                .ClickAgeForUnderShop()
                .ClickAnItemForUnderShop()
                .AddToCartForUnderShop()
                .ClickReviewCartUnderShop();
    }

    //##################################################################################
    @When("^User mouse hover on 'Baby & Kids' and click on the link of 'Toy Organizer'$")
    public void MouseHoveBabyKids(){
        LOGGER.info("MouseHover for Baby&kids----ToyOrganizer");
        new NavigationBar(driver)
                .MouseHoverHomePage()
                .ClickBabyAndKidsOrganizingToy();
    }

    @And("^User click on 'Brecken Kid Toy Organizer' by selecting its size and color$")
    public void filterToyOrganizer(){
        LOGGER.info("All input for Baby&kids----ToyOrganizer");
        new BabyAndKids(driver)
                .MouseHoverOrganizerToy()
                .ClickWhiteOrganizerToy()
                .ClickAnOrganizingToy();
    }
    @Then("^user should see the item price with text is \"(.+?)\"$")
   public void validateItemText(String text){
           new BabyAndKids(driver)
           .ValidationItemWithText(text);

    }
}
