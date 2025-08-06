package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) {
	    // Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get(" https://training-support.net/webelements/login-form/");

	    //Get title
	    System.out.println("Page title is" + driver.getTitle());
	    //find username box
	    driver.findElement(By.id("username")).sendKeys("admin");
	    //Enter password
	    driver.findElement(By.id("password")).sendKeys("password");
	    driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
	    
	    //Find and click About Us link
	    driver.findElement(By.linkText("About Us")).click();
	    System.out.println("New page title is: " + driver.getTitle());
	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();

}
	}