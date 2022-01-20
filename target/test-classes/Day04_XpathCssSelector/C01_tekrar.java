package Day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//        1. Bir class oluşturun : AmazonSearchTest
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//        a.google web sayfasına gidin. https://www. amazon.com/
//        b. Search(ara) “city bike”
//        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
//        d. “Shopping” e tıklayın.
//        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
//copy xpath -->
// *[@id="search"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div
public class C01_tekrar {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        WebElement aramaYap= driver.findElement(By.id("twotabsearchtextbox"));
        aramaYap.sendKeys("city bike"+ Keys.ENTER);
        //2.yol
        //aramaYap.sendKeys("city bike");
        //aramaYap.submit();
        //3. yol
        //WebElement aramaButton= driver.findElement(By.id("nav-search-submit-button"));
        //aramaButton.click();

        //neden olmadi
        //WebElement sonucYazisiElementi=driver.findElement(By.className("a-color-state a-text-bold"));
        //System.out.println("Sonuc yazisi..: "+sonucYazisiElementi.getText());

        // sadece click yapmak gibi basit bir islemde kullanacagimiz webelementler icin
        // variable olusturmadan direk locate edip, istedigimiz islemi yapabiliriz
        WebElement ilkUrunResmi= driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();
        //ust ile isi yapar
        // driver.findElement(By.className("s-image")).click();
        Thread.sleep(35000);
        //driver.close();

    }
}
