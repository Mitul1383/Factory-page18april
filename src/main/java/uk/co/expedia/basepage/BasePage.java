package uk.co.expedia.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.apache.log4j.PropertyConfigurator.configure;

public class BasePage {
    public static WebDriver driver;
    public BasePage() {
        PageFactory.initElements(driver,this);
        configure(System.getProperty("user.dir")+"/src/test/java/uk/co/expedia/resources/propertiesfile/log4j.properties");

    }
}
