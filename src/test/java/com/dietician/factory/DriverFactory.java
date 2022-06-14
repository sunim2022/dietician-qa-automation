package com.dietician.factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			WebDriver driver = new ChromeDriver(options);
			
			tlDriver.set(driver);
			//tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();

		//TODO: enable headless mode to run in jenkins.
		// System.out.println("URL -" + prop.get("url"));
		// prop.getProperty("url");
		getDriver().get("http://www.dietician.com");// how to read url from config file?
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
