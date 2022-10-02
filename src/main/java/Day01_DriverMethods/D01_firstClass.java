package Day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_firstClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.galatasaray.org");

    }
}
