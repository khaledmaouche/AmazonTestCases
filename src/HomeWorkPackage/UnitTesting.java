package HomeWorkPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTesting extends Amazon_Test_Cases {




    @Test
    public void testburgerButton() throws InterruptedException {
        burgerButton();
        String actualText=driver.findElement(By.xpath(menuActualText)).getText();
        Assert.assertEquals(actualText,menuExpectedText);

    }
    @Test
    public void testprimeVideoArrow() throws InterruptedException {
        primeVideoArrow();
        String actualText=driver.findElement(By.cssSelector(primeVideoActualText)).getText();
        Assert.assertEquals(actualText, primeVideoExpectedText);

    }
}
