package HomeWorkPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Test_Cases {

    //declaring the url
    final static  String amazonurl="https://www.amazon.com/";

    //create object for WebDiver interface
    static WebDriver driver;


    static String burgerbuttonPath="//*[@id=\"nav-hamburger-menu\"]";
    //*[@id="nav-hamburger-menu"]
    static String primeVideoPath="//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a";
    static String amazomMusicPath="//*[@id=\"hmenu-content\"]/ul[34]/li[3]/a/div";
    static String echoAlexaPath="//*[@id=\"hmenu-content\"]/ul[34]/li[4]/a/div";
    static String fireTabletPath="//*[@id=\"hmenu-content\"]/ul[34]/li[5]/a/div";
    static String kindleEReaderBooksPath="//*[@id=\"hmenu-content\"]/ul[34]/li[7]/a/div";
    static String appStoreForAndroidPath="//*[@id=\"hmenu-content\"]/ul[34]/li[8]/a/div";
    static String clothingShoesJewelaryPath="//*[@id=\"hmenu-content\"]/ul[34]/li[10]/a/div";
    static String amazonFreshPath="//*[@id=\"hmenu-content\"]/ul[34]/li[11]/a/div";
    static String subscribeSavePath="//*[@id=\"hmenu-content\"]/ul[34]/li[12]/a/div";
    String menuExpectedText="SHOP BY CATEGORY";
    String menuActualText="//*[@id=\"hmenu-content\"]/ul[1]/li[1]/div";
    String primeVideoExpectedText ="Prime Video";
    String primeVideoActualText ="#a-page > div.DVWebNode-retail-nav-wrapper.DVWebNode.av-native-stick > div > a";


    public static void main(String[] args) throws InterruptedException {

        openBrowserChrome(amazonurl);
        burgerButton();
//        primeVideoArrow();
//        amazonMusic();
//        echoAlexa();
//        fireTablet();
//        fireTv();
//        kindleEReaderBooks();
//        appStoreForAndroid();
//        clothingShoesJewelary();
//        amazonFresh();
//        subscribeSave();

    }





    public static void openBrowserChrome(String str){
        //set driver for chorme
        System.setProperty("webdriver.chrome.driver","BrowserDriver/chromedriver");
        //calling the chorme driver
        driver=new ChromeDriver();
        //setting the url by the parameter variable
        driver.get(str);
    }
    public static void burgerButton() throws InterruptedException {
        openBrowserChrome(amazonurl);
        //click on the button
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        //wait for 3 sceond
        Thread.sleep(3000);
        //Closing the browser
        driver.close();
    }
    public static void primeVideoArrow() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(primeVideoPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#a-page > div.DVWebNode-retail-nav-wrapper.DVWebNode.av-native-stick > div > a")).click();
        Thread.sleep(3000);

        driver.close();
    }
    public static void amazonMusic() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(amazomMusicPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void echoAlexa() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(echoAlexaPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void fireTablet() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(fireTabletPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void fireTv() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(fireTabletPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void kindleEReaderBooks() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(kindleEReaderBooksPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void appStoreForAndroid() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(appStoreForAndroidPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void clothingShoesJewelary() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(clothingShoesJewelaryPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void amazonFresh() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(amazonFreshPath)).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void subscribeSave() throws InterruptedException {
        openBrowserChrome(amazonurl);
        driver.findElement(By.xpath(burgerbuttonPath)).click();
        driver.findElement(By.xpath(subscribeSavePath)).click();
        Thread.sleep(3000);
        driver.close();

    }
}
