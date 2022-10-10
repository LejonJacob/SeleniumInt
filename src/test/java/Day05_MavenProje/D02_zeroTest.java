package Day05_MavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D02_zeroTest {
    public static void main(String[] args) {

        /*
            1. http://zero.webappsecurity.com sayfasina gidin
            2. Signin buttonuna tiklayin
            3. Login alanine  “username” yazdirin
            4. Password alanine “password” yazdirin
            5. Sign in buttonuna tiklayin
            6. Pay Bills sayfasina gidin
            7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
            8. tarih kismina “2022-10-10” yazdirin
            9. Pay buttonuna tiklayin
            10. “The payment was successfully submitted.” mesajinin ciktigini control edin

         */


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

        driver.findElement(By.id("signin_button")).click();

        WebElement loginUsernameKutusu= driver.findElement(By.id("user_login"));
        loginUsernameKutusu.sendKeys("username");

        WebElement passwordKutusu = driver.findElement(By.id("user_password"));
        passwordKutusu.sendKeys("password");

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.navigate().back();

        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();

        WebElement amountKutusu = driver.findElement(By.id("sp_amount"));

        amountKutusu.sendKeys("2000");

        WebElement tarihKutusu= driver.findElement(By.id("sp_date"));
        tarihKutusu.sendKeys("2022-10-10");

        //9. Pay buttonuna tiklayin
        WebElement payButonu= driver.findElement(By.id("pay_saved_payees"));
        payButonu.click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement basariliYazisiElementi= driver.findElement(By.id("alert_content"));

        String actualBasariliYazisi= basariliYazisiElementi.getText();
        String expectedbasariliYazisi= "The payment was successfully submitted.";

        if (actualBasariliYazisi.equals(expectedbasariliYazisi)){
            System.out.println("Basarili odeme yazisi gorunuyor, test PASSED");

        } else {
            System.out.println("Basarili odeme yazisi gorunmuyor, test FAILED");
        }

    }
}

