package Day02_DriverMethods2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_driverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        // Driver objesi olusturunca Selenium webDriver
        // Bilgisayarimizdaki chrome browser'dan bir bos sayfa actirir
        // Eger firefox veya safari gibi baska bir browser kullanmak istersek
        // Selenium sitesinden o browser'in WebDriver'ini indirip projemize eklememiz gerekir

        driver.get("https://www.amazon.com");

        // Eger kodlarimizi belirli bir sure bekletmek istersek
        Thread.sleep(4000); // yazilan milisaniye kadar kodlari bekletir
        System.out.println("sayfa url'i : "+driver.getCurrentUrl());

        System.out.println("Sayfanin title'i : "+driver.getTitle());

        driver.close();
    }
}