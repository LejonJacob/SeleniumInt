package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_driverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();





        driver.get("https://www.amazon.com");
        Thread.sleep(3500);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.close();


    }
}
