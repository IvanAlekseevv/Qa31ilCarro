package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestsBase{

@Test
public void loginSuccess(){
    //open form login
    click(By.xpath("//a[text()=' Log in ']"));
    //fill form -----type()
    type(By.id("email"), "lenastep@gmail.com");
    type(By.id("password"), "12345nnnN");
    //button login -----click()
    click(By.cssSelector("[type='submit']"));
}

}
