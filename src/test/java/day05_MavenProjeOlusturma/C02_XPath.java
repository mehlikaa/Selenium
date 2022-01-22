package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("(//button[@id='signin_button'])")).click();
        //3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");

        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        Thread.sleep(1000);
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //guvenligi gec, ben de guvenlik ayarlarina takildi takildi.
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
        //6. Pay Bills sayfasina gidin
        Thread.sleep(1000);
        driver.findElement(By.linkText("Pay Bills")).click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("300");
        //8. tarih kismina “2020-09-10” yazdirin
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        // Keys.ENTER;
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sp_description']")).sendKeys("Ilk Selenium Odemem");
        Thread.sleep(2000);
        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        String expectedMessage="The payment was successfully submitted.";
       String actualMessage=driver.findElement(By.id("alert_content")).getText();
       if(expectedMessage.equals(actualMessage)){
           System.out.println("ISLEM TAMAM");
       }else{
           System.out.println("Sanirim bir sorunumuz var");
       }
       Thread.sleep(2000);
       driver.close();

    }
}
