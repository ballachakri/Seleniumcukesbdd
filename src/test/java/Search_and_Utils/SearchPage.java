package Search_and_Utils;

import DriverHelper.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.Keys.ENTER;

public class SearchPage extends DriverHelper
{
   @FindBy(css = "#searchTerm")
   private WebElement stxt;


    public void choiceProduct (String myProduct)
    {


        stxt.sendKeys (myProduct);
        stxt.sendKeys (ENTER);
        //driver.findElement (By.cssSelector (".argos-header__search-button")).click ();

//        sleep (3000);
//        new WebDriverWait (driver,20).until (ExpectedConditions.textToBePresentInElementLocated
//                (By.cssSelector (".font-condensed.search-title__term"),myProduct));
    }


    public String getCurrentURL()
    {
        String c_URL;
        c_URL = driver.getCurrentUrl ();
        return  c_URL;
    }
}
