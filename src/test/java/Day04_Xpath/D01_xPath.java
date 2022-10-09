package Day04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D01_xPath {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin

        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(1000);
        addButonu.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement delateButonu= driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));

        if (delateButonu.isDisplayed()){
            System.out.println("Delate Butonu Görünme Testi PASSED");
        }else {
            System.out.println("Delate Butonu Görünmüyor, Test FAILED");
        }
        Thread.sleep(5000);

        // 4- Delete tusuna basin
        delateButonu.click();

        // 5- “Add/Remove Elements” yazisinin görünür oldugunu test edin
        if (addButonu.isDisplayed()){
            System.out.println("Add Butonu Görünme Testi PASSED");
        }else {
            System.out.println("Add Butonu Görünmüyor, Test FAILED");
        }
        Thread.sleep(4000);


        driver.close();



    }
}
