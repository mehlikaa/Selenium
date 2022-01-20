package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_tekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");



        driver = new ChromeDriver();


    }

}
