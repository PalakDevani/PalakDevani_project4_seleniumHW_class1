package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();  // setting the properties
        driver.get(baseUrl); // launch baseUrl

        String title = driver.getTitle(); //3. print the title of the page in console
        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl()); //4. print the Current URl
        System.out.println("Page source: " + driver.getPageSource()); //5. print the page source

        // enter the email to email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys(("standard_user"));

        // enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce!");


        driver.quit(); // close the browser
    }
}
