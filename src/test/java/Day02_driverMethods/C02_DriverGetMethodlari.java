package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https:www.amazon.com");
        //driver.getTitle();// bize string bir ifade dondurur sayfanın title'ni getirir
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getPageSource());   // neden olmadi

        Thread.sleep(3000);


    }
}
