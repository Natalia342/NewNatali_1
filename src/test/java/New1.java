import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New1 {
    WebDriver wd;
    @Test
    public void myTest(){
    wd = new ChromeDriver();
  //  wd.get("https://www.linkedin.com/in/natalia-talova/");
    wd.navigate().to("https://www.shufersal.co.il/online/he/A");


    wd.quit();
    }
    @Test
    public void myTest1(){

    }
}
