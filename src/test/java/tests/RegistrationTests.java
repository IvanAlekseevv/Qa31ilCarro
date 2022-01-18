package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegistrationTests extends TestsBase {

@Test
public void registrationSuccess(){
    //open form registration
    app.getUserHelper().openRegistrationForm();
    //fill form -----type()
    app.getUserHelper().fillRegistrationForm("Doda","Dodik","doda@gmail.com","Dd12345$");
    //checkbox
    app.getUserHelper().checkPolicy();
    //button register -----click()
    app.getUserHelper().submitForm();

}

}
