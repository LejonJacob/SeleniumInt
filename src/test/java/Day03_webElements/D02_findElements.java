package Day03_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D02_findElements {
    public static void main(String[] args) {


        /*
             2- className

             class attribute'u genelde ayni islevi yapan webelementleri gruplandirmak icin kullanilir
             bu gruplandirmalar sayesinde css ile gruptaki tum webElementler tek yerden sekillendirilebilir
             class attribute'u kullanilirken eger class value'u space iceriyorsa,
             classname ile yapilan locate'ler hata verebilir

             genellikle classname ile yapilan locate'ler birden fazla webelement dondureceginden
             List<WebElement> seklinde olusturacagimiz bir List'e kaydolur

             Bu listedeki elementler WebElement oldugu icin
             bu liste direk yazdirilamaz,
             bunun yerine for-each loop kullanilarak webElement ozellikleri yazdirilabilir

         */


        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        List< WebElement> yazilarElementList = driver.findElements(By.className("a-spacing-micro"));

        System.out.println(yazilarElementList.size());

        for (WebElement eachElement: yazilarElementList) {

            System.out.println(eachElement.getSize());
        }

        driver.close();


    }
}