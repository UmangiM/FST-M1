package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/target-practice");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the 7th header and print its text
        String seventhHeaderText = driver.findElement(By.xpath("//h2[contains(text(), '#7')]")).getText();
        System.out.println(seventhHeaderText);
        // Find the 5th header and print its color
        Color eightHeaderColor = Color.fromString(driver.findElement(By.xpath("//h3[contains(text(), '#8')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + eightHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + eightHeaderColor.asHex());

        // Find the Teal button and print its classes
        String tealButtonClass = driver.findElement(By.xpath("//button[text()='Teal']")).getAttribute("class");
        System.out.println(tealButtonClass);
        // Find the yellow button and print its text
        String yellowButtonText = driver.findElement(By.xpath("//button[contains(@class, 'yellow')]")).getText();
        System.out.println(yellowButtonText);


        // Close the browser
       // driver.quit();
    }
}
