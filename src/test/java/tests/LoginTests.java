package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestsBase{

@Test
public void loginSuccess(){
    //open form login
    app.getUserHelper().openLoginForm();
    //fill form -----type()
    app.getUserHelper().fillLoginForm("lenastep@gmail.com", "12345nnnN");
    //button login -----click()
    app.getUserHelper().submitForm();
}
    @Test
    public void loginSuccessModel(){

        User user = new User().withEmail("lenastep@gmail.com").withPassword("12345nnnN");
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(user);
        app.getUserHelper().submitForm();
    }
}
