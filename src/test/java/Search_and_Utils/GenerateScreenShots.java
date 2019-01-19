package Search_and_Utils;

import DriverHelper.DriverHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class GenerateScreenShots extends DriverHelper
{

    public static void testCaseScreenShot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFile = ts.getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (scrFile,
                new File ("target/screenShots/screenShot.png"));


        //or FileUtils.copyFile (scrShotFile,new File ("C:/Users/sball/IdeaProjects/seleniumcucumberargosBDD/target/screenShots/screenShot.png"));
        //or   FileUtils.copyFile (scrShotFile,new File ("./screenShot.png"));
       }

}
