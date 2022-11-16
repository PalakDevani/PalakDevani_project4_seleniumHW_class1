package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project4FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl); // launch baseUrl
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());

        // enter the email to email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys(("standard_user"));
        // enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce!");
        //driver.quit(); // close the browser
    }
}
