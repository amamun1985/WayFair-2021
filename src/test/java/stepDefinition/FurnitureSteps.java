package stepDefinition;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import page_object.Furniture;
import page_object.NavigationBar;
import utilities.ReadConfigFiles;
import java.io.IOException;
import java.util.Properties;

public class FurnitureSteps {

    private final Logger LOGGER= LogManager.getLogger(FurnitureSteps.class);

    WebDriver driver = Hooks.driver;

    @Given("^user is on wayfair home page$")
    public void navHomePage() throws IOException {
        LOGGER.info("---------------Test Case 101: Furniture Cabinet-------");
        ReadConfigFiles readConfigFiles = new ReadConfigFiles();
        Properties prop = readConfigFiles.getPropertyValue();
        String url = prop.getProperty("URL");
        LOGGER.info("URL is:" + url);
        ActOn.browser(driver).openBrowser(url);

        LOGGER.info("Way fair home page opened");
    }

    @When("^User mouse hover on furniture and click on the link of 'cabinetAndChest'$")
    public void MouseHoverCabinet(){
        LOGGER.info("MouseHover for Cabinet and Chest");
        new NavigationBar(driver)
                .MouseHoverHome()
                .clickOnCabinet();
    }

    @And("^User click on 'Marcos 2 Drawer Accent Chest' by selecting its color$")
    public void filterCabinet() throws IOException {
        LOGGER.info(" Cabinet and Chest filter input value");
        new Furniture(driver)
                .mouseCabinet()
                .clickSmallCabinet()
                .MouseHoverColorCabinet()
                .ClickColCabinet()
                .MouseHoverPricePerItemCabinet()
                .ClickUnderTwoHundredCabinet()
                .ClickItemsCabinets();
    }

    @Then("^user should see the item price is \"(.+?)\"$")
    public void valCabinet(String price) throws IOException {
        LOGGER.info(" Cabinet and Chest price validation");
        new Furniture(driver)
                .ValidationItemPrice(price);
    }

    @When("^User mouse hover on furniture and click on the item of 'chair'$")
    public void ClickAccentChair() {
        LOGGER.info("MouseHover for Chair");
        new NavigationBar(driver)
                .MouseHoverHome()
                .ClickAccentChair();
    }
    @And("^User select the colors and click on 'Schlater 24\" W Faux leather Armchair'$")
    public void enterInputValues(){
        LOGGER.info("insert all input value for Chair");
        new Furniture(driver)
                .MouseHoversColorChairs()
                .ClickColorBlueChair()
                .MouseHoverDesignChair()
                .ClickTypeOfChair()
                .MouseHoverPriceChair()
                .ClickPriceUnderChair()
                .MouseHoverMaterialChair()
                .ClickMaterialChair()
                .ClickItemChair();
    }
    @When("^User mouse Hover on 'Furniture' by selecting the link 'Coffee Tables'$")
    public void coffeeMouseHover(){
        LOGGER.info("MouseHover for Coffee table");
        new NavigationBar(driver)
                .MouseHoverHome()
                .ClickTablesCoffee()
                .ClickAgainCoffee();
    }
@Then("^User click on 'Maywood Frame 2 Nesting Tables' by its 'color' and 'UnderPrice'$")
    public void valuesCoffee(){
        LOGGER.info("All input values for Coffee table");
        new Furniture(driver)
                .MouseHoverColorCoffees()
                .ClickColorCoffees()
                .MouseHoverPricePerCoffees()
                .ClickPricePerCoffees()
                .ClickTableCoffee();


    }
@When("^User mouse Hover on 'Furniture' by selecting the link 'sofas and loveSeats'$")
    public void mouseHovSofa(){
        LOGGER.info("MouseHover for sofa");
        new NavigationBar(driver)
                .MouseHoverHome()
                .ClickSofa();
    }
    @Then("^User click on 'Twin 66.1\" Tufted Back Convertible Sofa' by selecting its 'color'$")
    public void filterSofa(){
        LOGGER.info("All input values for sofa");
        new Furniture(driver)
                .MouseHoverSofa()
                .ClickColorSofa()
                .ClickItemSofa();
    }
    @When("^User mouse Hover on 'Furniture' by selecting the link 'TV Stands'$")
    public void clickTVStand(){
        LOGGER.info("MouseHover for TV stand");
        new NavigationBar(driver)
                .MouseHoverHome()
                .ClickStandsTV();
    }

    @And("^User click on 'Lorraine TV Stand for TVs up to 55\" with Electric Fireplace Included' by selecting its 'color'$")
    public void filterTV(){
        LOGGER.info("All input values for TV stand");
        new Furniture(driver)
                .MouseHoverTV()
                .ClickSmallTV()
                .MouseHoverColorsTV()
                .ClickWhiteTV()
                .ClickItemTV();
    }
}
