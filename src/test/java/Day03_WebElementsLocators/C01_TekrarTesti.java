package Day03_WebElementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1. Yeni bir class olusturun (TekrarTesti)
//2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
//3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
//4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
//5. Youtube sayfasina geri donun
//6. Sayfayi yenileyin
//7. Amazon sayfasina donun
//8. Sayfayi tamsayfa yapin
//9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
//11.Sayfayi kapatin
public class C01_TekrarTesti {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.youtube.com");
        String actualTitleYoutube=driver.getTitle();
        String expectedYoutubeTitle="youtube";

        if(actualTitleYoutube.equals (expectedYoutubeTitle)){
            System.out.println("Youtube title testi PASS");
        } else {
            System.out.println("Youtube title testi FAILED \n actual sayfa basligi "+actualTitleYoutube);
        }

        String actualArananYoutubeUrl=driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";

        if (actualArananYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("Youtube URL testi PASS");
        } else {
        System.out.println("Youtube URL testi FAILED\n Actual URL ... : "+actualArananYoutubeUrl);
        }
        //----> 4
        driver.navigate().to("https://www.amazon.com");
        //----> 5
        driver.navigate().back();
        //----> 6
        driver.navigate().refresh();
        //----> 7
        driver.navigate().forward();
        //----> 8
        driver.manage().window().fullscreen();
        //---> 9
        String actualAmazonTitle=driver.getTitle();
        String amazonTitleArananKelime="Amazon";

        if(actualAmazonTitle.contains(amazonTitleArananKelime)) {
            System.out.println("Amazon Title Testi FPASS" );
        }else {
            System.out.println("Amazon Title Testi FAILED \n Actual Amazon Title ..: "+actualAmazonTitle);
        }

        //---> 10
        String expectedAmazonUrl="https:www.amazon.com/";
        String actualAmazonUrl=driver.getCurrentUrl();

        if(expectedAmazonUrl.equals(actualAmazonUrl)){
            System.out.println("Amazon URL testi PASS");
        } else {
            System.out.println("Amazon URL testi FAILED ..\nCurrent URL"+actualAmazonUrl);
        }
        //===> 11
        driver.close();
    }
}
