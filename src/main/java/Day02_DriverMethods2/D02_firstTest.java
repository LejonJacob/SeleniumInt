package Day02_DriverMethods2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_firstTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl= driver.getCurrentUrl();
        String actualTitle= driver.getTitle();


        // url test yapalim
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");

        }else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : " + actualUrl);
            System.out.println("Actual Url aranan " + expectedUrlIcerik + " kelimesini icermiyor");
        }


        // title test
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title Testi PASSED");

        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : " + actualTitle);
            System.out.println("Actual title aranan " + expectedTitleIcerik + " kelimesini icermiyor");
        }

        driver.quit();

        /*
        driver.close sadece acik olan browser'i kapatir
        driver.quit ise test calisirken acilan tum browser'lari kapatir
        */

    }
}