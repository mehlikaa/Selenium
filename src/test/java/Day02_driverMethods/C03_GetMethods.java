package Day02_driverMethods;

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    public static void main(String[] args) throws InterruptedException {
        // yaptiktan sonra yapistir denirse hepsine // koyar
            //1. Yeni bir package olusturalim : day01
            //2. Yeni bir class olusturalim : C01_GetMethods
            //3. Amazon sayfasina gidelim. https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASS");
        } else {
            System.out.println("Title testi FAIL");
        }

        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String urlArananKelime="amazon";
        if (actualUrl.contains(urlArananKelime)){
            System.out.println("URL testi PASS");
        } else {
            System.out.println("URL testi FAIL");
        }

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String actualPageSource=driver.getPageSource();
        String pageArananKelime="alisveris";
        if (actualPageSource.contains(pageArananKelime)){
            System.out.println("Page Source testi PASS");
        } else {
            System.out.println("Page Source testi FAIL");
        }
//10. Sayfayi kapatin.
        Thread.sleep(1000);
        driver.close();
    }


}
