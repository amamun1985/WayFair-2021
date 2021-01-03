package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import command_providers.ScreenShort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Furniture extends NavigationBar{
    private final Logger LOGGER= LogManager.getLogger(Furniture.class);
    //Cabinet
    private static final By MouseHoverDimentionCabinet=By.xpath("//*[@id='bd']//span[text()='Overall Dimensions']");
    private static final By ClickDimentionSmallCabinet=By.xpath("//*[@id='bd']//label/span[text()='Small (Under 24 in.)']/../../label[@class='pl-Checkbox']");
    private static final By MouseHoverColorCabinets=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ClickColorCabinet=By.xpath("//*[@id='bd']//label/span[text()='Brown']/../../label[@class='pl-Checkbox']");
    private static final By MouseHoverPricePerItem=By.xpath("//*[@id='bd']//span[text()='Price Per Item']");
    private static final By SelectPricePerItem=By.xpath("//*[@id='bd']//label/span[text()='$150 to $200']/../../label[@class='pl-Checkbox']");
    private static final By ClickItemCabinet=By.xpath("//*[@id='sbprodgrid']//h2[text()='Marcos 2 Drawer Accent Chest']/../../div[@class='ProductCard-header']");

    //chair
    private static final By ColourMouseHover=By.xpath("//*[@id='bd']//span[text()='Upholstery Color']");
    private static final By ColorBlue=By.xpath("//*[@id='bd']//span[text()='Blue']/../../label[@class='pl-Checkbox']");
    private static final By ChairDesignMouseHover=By.xpath("//*[@id='bd']//span[text()='Chair Design']");
    private static final By ArmChair=By.xpath("//*[@id='bd']//span[text()='Armchair']/../../label[@class='pl-SelectableInput']");
    private static final By PricePerItemMouseHover=By.xpath("//*[@id='bd']//span[text()='Price Per Item']");
    private static final By PriceUnder=By.xpath("//*[@id='bd']//span[text()='Under $150']/../../label[@class='pl-Checkbox']");
    private static final By MouseHoverMaterial=By.xpath("//*[@id='bd']//span[text()='Upholstery Material']");
    private static final By Material=By.xpath("//*[@id='bd']//span[text()='Faux Leather']/../../label[@class='pl-Checkbox']");
    private static final By PriceItem=By.xpath("//*[@id='sbprodgrid']//h2[text()='Schlater 24\" W Faux leather Armchair']/../../div[@class='ProductCard-header']");


    //Coffee table
    private static final By MouseHoverColorCoffee=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ClickColorCoffee=By.xpath("//*[@id='bd']//span[text()='Brown']/../../label[@class='pl-Checkbox']");
    private static final By MouseHoverPricePerItemCoffee=By.xpath("//*[@id='bd']//span[text()='Price Per Item']");
    private static final By ClickPricePerItemCoffee=By.xpath("//*[@id='bd']//span[text()='$100 to $250']/../../label[@class='pl-Checkbox']");
    private static final By CoffeeTable=By.xpath("//*[@id='bd']//h2[@data-enzyme-id='BrowseProductCardWrapper-component-name' and text()='Maywood Frame 2 Nesting Tables']");

    //Sofa
    private static final By MouseHoverColor=By.xpath("//*[@id='bd']//span[text()='Upholstery Color']");
    private static final By ClickColorGray=By.xpath("//*[@id='bd']//span[text()='Gray']/../../label[@class='pl-Checkbox']");
    private static final By SelectSofa=By.xpath("//*[@id='sbprodgrid']//h2[@data-enzyme-id='BrowseProductCardWrapper-component-name' and text()='Twin 66.1\" Tufted Back Convertible Sofa']");

    //TV
    private static final By MouseHoverTVSize=By.xpath("//*[@id='bd']//span[text()='Size / Dimensions']");
    private static final By ClickTVSmall=By.xpath("//*[@id='bd']//span[text()='Small (under 48 in.)']/../../label[@class='pl-Checkbox']");
    private static final By MouseHoverColorTV=By.xpath("//*[@id='bd']//span[text()='Color']");
    private static final By ClickTVWhite=By.xpath("//*[@id='bd']//span[text()='White']/../../label[@class='pl-Checkbox']");
    private static final By TVItem=By.xpath("//*[@id='bd']//h2[text()='Lorraine TV Stand for TVs up to 55\" with Electric Fireplace Included']");


    public Furniture(WebDriver driver) {
        super(driver);
    }
    public Furniture mouseCabinet(){
    ActOn.element(driver,MouseHoverDimentionCabinet).mouseHover();
    LOGGER.info("MouseHover on dimention of cabinet");
        return this;
}
public Furniture clickSmallCabinet(){
    ActOn.element(driver,ClickDimentionSmallCabinet).click();
    LOGGER.info("Select small size of cabinet");
        return  this;
}
public Furniture MouseHoverColorCabinet(){
    ActOn.element(driver,MouseHoverColorCabinets).mouseHover();
    LOGGER.info("MouseHover on color ");
        return this;
}
public Furniture ClickColCabinet(){
    ActOn.element(driver,ClickColorCabinet).click();
    LOGGER.info("Click on color");
    return this;
}


    public Furniture MouseHoverPricePerItemCabinet(){
        ActOn.element(driver,MouseHoverPricePerItem).mouseHover();
        LOGGER.info("MouseHover on price per item ");
        return this;
    }
    public Furniture ClickUnderTwoHundredCabinet(){
        ActOn.element(driver,SelectPricePerItem).click();
        LOGGER.info("Click price under item");
        return this;
    }

public Furniture ClickItemsCabinets() throws IOException {
    ActOn.element(driver,ClickItemCabinet).click();
    LOGGER.info("Select the cabinet item which you want to validate");
    ScreenShort.myShort(driver,ClickItemCabinet).myScreenShot("C:/wayfair101/target/ScreenShot");
    return this;
}
public Furniture ValidationItemPrice(String itemPrice) {
    ActOn.browser(driver).clickBrowserTab(1);
    By price = By.xpath("//*[@id='bd']//div[1]/span[text()='" + itemPrice + "']");

    AssertThat.elementAssertions(driver,price).elementExist();
    LOGGER.info("validation item price");
    return this;
}
//####################################################################################################################################


//###########################################chair########################################################
public Furniture MouseHoversColorChairs(){
       ActOn.element(driver,ColourMouseHover).mouseHover();
    LOGGER.info("mouse hover on chair color");
    return this;
}
public Furniture ClickColorBlueChair(){
        ActOn.element(driver,ColorBlue).click();
    LOGGER.info("Click on color");
        return this;
    }
    public Furniture MouseHoverDesignChair(){
        ActOn.element(driver,ChairDesignMouseHover).mouseHover();
        LOGGER.info("Mouse Hover Design Chair");
        return this;
    }
    public Furniture ClickTypeOfChair(){
        ActOn.element(driver,ArmChair).click();
        LOGGER.info("select arm chair");
        return this;
    }
    public Furniture MouseHoverPriceChair(){
        ActOn.element(driver,PricePerItemMouseHover).mouseHover();
        LOGGER.info("Mouse Hover Price Chair");
        return this;
    }
    public Furniture ClickPriceUnderChair(){
        ActOn.element(driver,PriceUnder).click();
        LOGGER.info("Click Price Under Chair");
        return this;
    }
    public Furniture MouseHoverMaterialChair(){
        ActOn.element(driver,MouseHoverMaterial).mouseHover();
        LOGGER.info("Mouse Hover Material Chair");
        return this;
    }
    public Furniture ClickMaterialChair(){
        ActOn.element(driver,Material).click();
        LOGGER.info("Click Material Chair");
        return this;
    }
    public Furniture ClickItemChair(){
        ActOn.element(driver,PriceItem).click();
        LOGGER.info("Select the chair item which you want to validate");
        return this;
    }

    //##################################################Coffee table##########################################

    public Furniture MouseHoverColorCoffees(){
        ActOn.element(driver,MouseHoverColorCoffee).mouseHover();
        LOGGER.info("Mouse Hover Color Coffees");
        return this;
    }
    public Furniture ClickColorCoffees(){
        ActOn.element(driver,ClickColorCoffee).click();
        LOGGER.info("Click Color Coffees");
        return this;
    }

    public Furniture MouseHoverPricePerCoffees(){
        ActOn.element(driver,MouseHoverPricePerItemCoffee).mouseHover();
        LOGGER.info("Mouse Hover PricePer Coffee");
        return this;
    }
    public Furniture ClickPricePerCoffees(){
        ActOn.element(driver,ClickPricePerItemCoffee).click();
        LOGGER.info("Click PricePer Coffees");
        return this;
    }

    public Furniture ClickTableCoffee(){
        ActOn.element(driver,CoffeeTable).click();
        LOGGER.info("Select the coffee table item which you want to validate");
        return this;
    }

    //##########################################################sofa#####################################
    public Furniture MouseHoverSofa(){
        ActOn.element(driver,MouseHoverColor).mouseHover();
        LOGGER.info("Mouse Hover Sofa");
        return this;
    }
    public Furniture ClickColorSofa(){
        ActOn.element(driver,ClickColorGray).click();
        LOGGER.info("Click Color Sofa");
        return this;
    }
    public Furniture ClickItemSofa(){
        ActOn.element(driver,SelectSofa).click();
        LOGGER.info("Select the sofa item which you want to validate");
        return this;
    }
    //TV Stand #################################################################################
    public Furniture MouseHoverTV(){
        ActOn.element(driver,MouseHoverTVSize).mouseHover();
        LOGGER.info("Mouse Hover TV stand");
        return this;
    }
    public Furniture ClickSmallTV(){
        ActOn.element(driver,ClickTVSmall).click();
        LOGGER.info("select Small TV");
        return this;
    }
    public Furniture MouseHoverColorsTV(){
        ActOn.element(driver,MouseHoverColorTV).mouseHover();
        LOGGER.info("Mouse Hover ColorsTV");
        return this;
    }
    public Furniture ClickWhiteTV(){
        ActOn.element(driver,ClickTVWhite).click();
        LOGGER.info("Select WhiteTV");
        return this;
    }
    public Furniture ClickItemTV(){
        ActOn.element(driver,TVItem).click();
        LOGGER.info("Select the TV stand item which you want to validate");
        return this;
    }

}
