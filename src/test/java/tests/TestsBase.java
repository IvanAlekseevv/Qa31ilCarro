package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestsBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        //open browser
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        //open www
        wd.navigate().to("https://ilcarro.xyz/search");
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }


    public void type(By locator, String text) {
        if (text != null && !text.isEmpty()) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }


    public void click(By locator){
        wd.findElement(locator).click();
    }

}
