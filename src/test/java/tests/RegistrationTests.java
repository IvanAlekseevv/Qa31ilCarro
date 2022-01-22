package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestsBase {

    @Test
    public void registrationSuccess() {
        int index = (int) (System.currentTimeMillis() / 1000 % 3600);
        System.out.println(index);
        //open form registration
        app.getUserHelper().openRegistrationForm();
        //fill form -----type()
        app.getUserHelper().fillRegistrationForm("Doda", "Dodik", "doda" + index + "@gmail.com", "Dd12345$");
        //checkbox
        app.getUserHelper().checkPolicy();
        //button register -----click()
        app.getUserHelper().submitForm();

        //app.getUserHelper().pause(2000);
        Assert.assertTrue(app.getUserHelper().isRegistrationSuccess());

    }

    @Test
    public void registrationSuccessModel() {
        int index = (int) (System.currentTimeMillis() / 1000 % 3600);
        System.out.println(index);

        User user = new User().withName("Doda").withLastName("Dodik").withEmail("doda" + index + "@gmail.com").withPassword("Dd12345$");


        app.getUserHelper().openRegistrationForm();
        app.getUserHelper().fillRegistrationForm(user);
        app.getUserHelper().checkPolicy();
        app.getUserHelper().submitForm();

        Assert.assertTrue(app.getUserHelper().isRegistrationSuccess());

    }
}
