package Day04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D02_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {

        /*

        1-C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i  secin
        10- Urun ucretinin 25$ oldugunu test edin
        11- Sayfayi kapatin

         */


        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.navigate().refresh();

        if (driver.getTitle().contains("Spend less")){
            System.out.println("Title testi  PASSED");

        }else {
            System.out.println("Title testi  FAILED");
        }

        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//img[@alt=\"Amazon.com eGift Card\"])[1]")).click();

        driver.findElement(By.xpath("//button[@value=\"25\"]")).click();

        WebElement ucretElementi= driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));

        String actualUcretStr= ucretElementi.getText();
        String expectedUcretStr="$25.00";

        if (actualUcretStr.equals(expectedUcretStr)){
            System.out.println("Gift card testi PASSED");

        }else {
            System.out.println("Gift card fiyati farkli, test FAILED");
        }

        Thread.sleep(4000);

        driver.close();


    }
}
