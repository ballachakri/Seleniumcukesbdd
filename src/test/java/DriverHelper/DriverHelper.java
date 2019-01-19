package DriverHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public static WebDriver driver;


    private String browser = "";

 //   private String remoteURL = "ip address and port number";

    public DriverHelper ( ) {
        PageFactory.initElements (driver, this);
    }


    public void ChoiceTheBrowser ( ) throws MalformedURLException {


        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\users\\sball\\downloads\\chromedriver_win32\\chromedriver.exe");
//              ChromeDriverManager.getInstance (DriverManagerType.CHROME).setup ();
                driver = new ChromeDriver ();
//               driver = new RemoteWebDriver (new URL("198.168.0.16:4444"),cap);
                break;
            case "edge":

                DesiredCapabilities cap = new DesiredCapabilities();
              System.setProperty("webdriver.edge.driver","C:\\Users\\sball\\Downloads\\MicrosoftWebDriver.exe");

//             InternetExplorerDriverManager.getInstance (DriverManagerType.EDGE).setup ();
               driver = new EdgeDriver ();

//
          //   driver = new RemoteWebDriver (new URL ("http://192.168.0.28:32973"),cap);
                break;
            case "ie":
            System.setProperty ("webdriver.ie.driver","C:\\Users\\sball\\Downloads\\MicrosoftWebDriver.exe");
                 driver=new InternetExplorerDriver ();
                break;
            case "safari":
                driver = new SafariDriver ();
//                driver = new RemoteWebDriver (new URL ("198.168.0.16:4444"),cap);
                break;
            default:
                driver = new FirefoxDriver ();

 //               driver = new RemoteWebDriver (new URL ("198.168.0.16:4444"),cap);
                break;
        }

    }


    public void navigateToBrowser (String url) {
        driver.get (url);
    }

    public void maxiBrowser ( ) {
        driver.manage ().window ().maximize ();
    }

    public void killCookies ( ) {
        driver.findElement (By.linkText ("GOT IT")).click ();
    }

    public void applyWait ( ) {
        driver.manage ().timeouts ().implicitlyWait (30, TimeUnit.SECONDS);
    }

    public void sleep (int msec) {
        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }

    public void closeTheBrowser ( ) {
        driver.quit ();

    }


}

