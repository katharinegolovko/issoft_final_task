package by.issoft.utils.factory;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class WebDriverFactory {

    public abstract WebDriver initializeDriver() throws MalformedURLException;

}
