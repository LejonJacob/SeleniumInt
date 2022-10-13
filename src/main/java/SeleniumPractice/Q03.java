package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) throws InterruptedException {

        /*

                ...Exercise3...
            go to url : https://www.techlistic.com/p/selenium-practice-form.html
            fill the firstname
            fill the lastname
            check the gender
            check the experience
            fill the date
            choose your profession -> Automation Tester
            choose your tool -> Selenium Webdriver
            choose your continent -> Europa
            choose your command  -> Browser Commands
            click submit button

        */

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click(); // Cikan pencereyi asmak icin

        driver.findElement(By.xpath("//a[text()='Tamam']")).click();

        WebElement firstName= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstName.sendKeys("Jacob" + Keys.ENTER);
        Thread.sleep(1500);

        WebElement lastName= driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Lejon" + Keys.ENTER);

        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();
        gender.sendKeys(Keys.PAGE_DOWN);

        driver.findElement(By.id("exp-0")).click();

        driver.findElement(By.id("datepicker")).sendKeys("2022.10.11" + Keys.ENTER);

        driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();

        WebElement bolgeSec = driver.findElement(By.xpath("(//select[@class=\"input-xlarge\"])[1]"));
        bolgeSec.click();
        bolgeSec.findElement(By.xpath("//select[@id=\"continents\"]"));
        bolgeSec.sendKeys("Europe" + Keys.ENTER);
        bolgeSec.findElement(By.xpath("//*[text()=\"Browser Commands\" ]")).click();

        driver.findElement(By.xpath("//input[@class=\"input-file\" ]"));

        driver.findElement(By.linkText("Click here to Download File")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.xpath("//button[@class=\"btn btn-info\" ]")).click();
        Thread.sleep(2000);

        driver.close();


    }
}
