package Day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_firstClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.galatasaray.org");

        /*
           1- Selenium sitesinden sizin isletim sisteminize uygun
              selenium dosyalarini indirin,
              masaustune olusturacaginiz bir klasore, bu zip dosyasini acin

           2- Selenium sitesinden, browsers sekmesinde
              bilgisayariniza uygun driver'i indirin, zip dosyasindan cikarip
              masaustune tasiyin

           3- Selenium sitesinden indirdiginiz chrome surumu ile
              bilgisayardaki chromebrowser surumunun ayni oldugundan emin olun
              ayni degilse, bilgisayardaki chrome browser'i update edin

           4- Yeni bir proje olusturun,
              proje olusturma asamasinda build-system olarak maven secin

           5- src altinda resources klasoru olusturun
              bu klasorun icine indirip, masaustune actigimiz
              selenium klasoru ve chromedriver dosyalarini tasiyin

           6- File/project structure menusunden
              modules ve dependencies'i secin
              + tusuna basip, projeye ekledigimiz selenium klasoru icindeki
              tum jar dosyalarini secip
              apply ve Ok tuslarina basin

           7-  src/main/java altinda bir class olusturun

           8- Class'da main method olusturup yukaridaki kodlari yazin

             NOT : 8. satirdaki 2.parametre windows ve mac icin farklidir


         */

    }
}
