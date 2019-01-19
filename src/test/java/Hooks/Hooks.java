package Hooks;


import DriverHelper.DriverHelper;
import Search_and_Utils.GenerateReports;
import Search_and_Utils.GenerateScreenShots;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.net.MalformedURLException;


public class Hooks {

    private DriverHelper dHelper = new DriverHelper ();


    @Before
    public void openTheBrowser ( ) {
        try {
            dHelper.ChoiceTheBrowser ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        }
        dHelper.navigateToBrowser ("http://www.argos.co.uk");
        dHelper.maxiBrowser ();
      //  dHelper.killCookies ();
        dHelper.applyWait ();
    }

    @After
    public void shutDownBrowser () throws IOException {


        GenerateScreenShots.testCaseScreenShot ();
        GenerateReports.testCaseReports ();
        dHelper.closeTheBrowser ();


    }
}