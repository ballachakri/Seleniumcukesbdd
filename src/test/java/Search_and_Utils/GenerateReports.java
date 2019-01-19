package Search_and_Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReports {

    public static void testCaseReports()
    {
        ExtentHtmlReporter report =
                new ExtentHtmlReporter ("C:/Users/sball/IdeaProjects/seleniumcucumberargosBDD/target/reports/report.html");
        ExtentReports extent = new ExtentReports ();
        extent.attachReporter (report);

        ExtentTest logger = extent.createTest ("Search");

        logger.log (Status.INFO, " Status INFO");
     //   logger.log (Status.PASS, " Status passed");
       // logger.log (Status.FAIL, " Status Failed");
        extent.flush ();
        // logger.addScreenCaptureFromPath ("target/screenShots/screenShot.png");

    }
}