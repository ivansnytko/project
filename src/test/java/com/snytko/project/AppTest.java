package com.snytko.project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	WebDriver driver;

	@BeforeTest
	public void startDriver() throws MalformedURLException {
//		if (tlDriver.get() == null) {
////			driver = new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub") ,new DesiredCapabilities(BrowserType.CHROME, "", Platform.MAC));
////			driver = new RemoteWebDriver(DesiredCapabilities.chrome());
////			driver = new InternetExplorerDriver();
//			driver = new ChromeDriver();
//			driver = new RemoteWebDriver(DesiredCapabilities.chrome());
//			tlDriver.set(driver);
//			System.out.println("driver");
//		} else {
//			driver = tlDriver.get();
//		}
	}

	@Test
	public void init1() {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("init1");
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
//		driver.navigate().to("http://www.google.com");
		driver.get("http://www.google.com");
		((RemoteWebDriver) driver).executeScript("window.open()");
		List<String> a = new ArrayList<String>(driver.getWindowHandles());
		a.get(0);
		driver.getTitle();
	}

	@Test
	public void init2() {
		driver.get("http://www.google.com");
		System.out.println("init2");
	}

	@Test
	public void init3() {
		driver.get("http://www.google.com");
		System.out.println("init3");
	}

	@Test
	public void init4() {
		driver.get("http://www.google.com");
		System.out.println("init4");
	}

	@Test
	public void init5() {
		driver.get("http://www.google.com");
		System.out.println("init5");
	}

	@AfterClass
	public void quitDriver() {
		driver.quit();
		driver = null;
		System.out.println("quit");
	}

}
