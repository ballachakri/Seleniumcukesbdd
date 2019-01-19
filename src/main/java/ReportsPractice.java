import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReportsPractice  {
    public static void main (String[] args) {
        WebDriver d=new FirefoxDriver ();
        d.get ("http:www.argos.co.uk");
        ExtentHtmlReporter report=new ExtentHtmlReporter
                ("C:/Users/sball/IdeaProjects/seleniumcucumberargosBDD/target/reports/report.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter (report);

        ExtentTest logger=extent.createTest ("@search");
        logger.log (Status.INFO, "  search");
        logger.log(Status.PASS,"  search test passed");
         extent.flush ();
    }
}
