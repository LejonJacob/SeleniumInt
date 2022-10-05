package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    public static void main(String[] args) throws InterruptedException {

        /* ...Exercise 2...

         1 - Driver olusturalim
         2 - Java class'imiza chromedriver.exe'yi tanitalim
         3 - Driver'in tum ekrani kaplamasini saglayalim
         4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
             söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
         5 - "https://www.otto.de" adresine gidelim
         6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
         7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
         8 - Ardindan "https://wisequarter.com/" adresine gidelim
         9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
             kontrol edelim
         10- Bir onceki web sayfamiza geri donelim
         11- Sayfayi yenileyelim
         12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
         13- En son adim olarak butun sayfalarimizi kapatmis olalim

         */

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");

        String expectedTitleIcerik="OTTO";
        String expectedUrlIcerik="OTTO";

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


        driver.navigate().to("https://wisequarter.com");

        String expectedTitleIcerik2="Quarter";
        String actualTitle2= driver.getTitle();

        if (actualTitle2.contains(expectedTitleIcerik2)){
            System.out.println("Title Testi PASSED");

        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : " + actualTitle2);
            System.out.println("Actual title aranan " + expectedTitleIcerik2 + " kelimesini icermiyor");

        }

        String wqUrl = driver.getCurrentUrl();

        System.out.println(wqUrl.contains("quarter")? "WQ Url Test Passed" : "WQ Url Test Failed");

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.close();

        driver.quit();



    }
}
