import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotPractice {
    public static void main (String[] args) throws IOException {


//    working
//        System.setProperty("webdriver.chrome.driver","C:\\users\\sball\\downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver d= new ChromeDriver();
//


        // working
//        System.setProperty("webdriver.edge.driver","C:\\users\\sball\\downloads\\MicrosoftWebDriver.exe");
//        WebDriver d = new EdgeDriver();

// working
//        WebDriver d = new SafariDriver ();
//        d.get ("https://www.lidl.co.uk/en/index.htm");

WebDriver d=new FirefoxDriver ();


        d.get ("http:www.argos.co.uk");
        d.manage ().window ().maximize ();
        TakesScreenshot ts=(TakesScreenshot)d;
        File source=ts.getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (source,new File ("./screenShots/target/firstsrcshoot.png"));
    }
}