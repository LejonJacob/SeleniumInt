package Day03_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D06_webElementMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.clear();

        aramaKutusu.sendKeys("java");


        System.out.println(aramaKutusu.getSize()); // (616, 38)
        System.out.println(aramaKutusu.getTagName()); // input
        System.out.println(aramaKutusu.getAttribute("name")); // field-keywords
        System.out.println(aramaKutusu.getRect().getX()); // 281

        System.out.println(aramaKutusu.isDisplayed()); // true
        System.out.println(aramaKutusu.isEnabled()); // true
        aramaKutusu.isSelected();




    }
}
