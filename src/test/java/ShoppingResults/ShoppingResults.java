package ShoppingResults;

import org.openqa.selenium.By;
import DriverHelper.DriverHelper;

public class ShoppingResults extends DriverHelper {

public void productToTrolley()
{
    driver.findElement (By.cssSelector (".add-to-trolley-main button")).click ();
    //driver.findElement (By.cssSelector (".add-to-trolley-button.button.button--primary.button--full"))
    //driver.findElement (By.cssSelector (".xs-row.add-to-trolley-main")).click ();
}
public void goToTrolley()
{
   driver.findElement (By.cssSelector (".xs-hidden.md-block")).click ();
}

public void getItemsFromBasket()
{
//    driver.findElement (By.cssSelector (".description>strong>a")).getText ();

}

public void collection(String postcode)

{
    driver.findElement (By.cssSelector ("#qasSearchTerm")).sendKeys (postcode);
}

public void chooseStore()

{
    driver.findElement (By.cssSelector (".primary-button.btn-md.primary-button.btn-md.enable-storelocator-lightbox")).click ();
}
}


