package Day02_DriverMethods2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D05_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

         /*

         Waits konusu ilerde daha genis anlatilacak
         Implicitly wait driver'in aradigi elementleri bulabilmesi icin
         kendisine verdigimiz arastirma suresidir
         o sure icerisinde aradigi elementi bulamazsa hata verir

         */

        driver.manage().window().fullscreen();

        System.out.println("Fullscreen Position: "+ driver.manage().window().getPosition());
        System.out.println("Fullscreen Size: "+ driver.manage().window().getSize());
        Thread.sleep(2000);


        driver.manage().window().maximize();

        System.out.println("Maximize Position "+ driver.manage().window().getPosition());
        System.out.println("Maximize Size"+driver.manage().window().getSize());
        Thread.sleep(2000);


        driver.manage().window().minimize();

        System.out.println("Minimize Position: "+ driver.manage().window().getPosition());
        System.out.println("Minimize Size: "+ driver.manage().window().getSize());
        Thread.sleep(2000);


        driver.close();


    }
}
