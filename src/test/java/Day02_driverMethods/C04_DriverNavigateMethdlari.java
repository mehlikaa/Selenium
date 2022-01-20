package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethdlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        //driver.get ile ayni islemi yapar.ama daha hizlidir.

        driver.get("https://www.techproeducation.com");

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();

    }
}
