package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_firstTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(4000);

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl= driver.getCurrentUrl();
        String actualTitle= driver.getTitle();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");

        }else {
            System.out.println("Url test FAILED");
            System.out.println("Actual Url: " + actualUrl);
            System.out.println("Actual Url aranan "+ actualUrl + " kelimesini icermiyor");
        }

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title test PASSED");

        }else {
            System.out.println("Title test FAILED");
            System.out.println("Actual Title: " + actualTitle);
            System.out.println("Actual Title aranan "+ actualTitle + " kelimesini icermiyor");
        }

        driver.close();


    }
}
