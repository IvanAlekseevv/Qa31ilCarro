package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHelper extends HelperBase {


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));

    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
    }

    public void fillLoginForm(User user) {
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }


    public void submitForm() {
        click(By.cssSelector("[type='submit']"));
    }

    public void openRegistrationForm() {
        wd.findElement(By.xpath("//a[text()=' Sign up ']")).click();
        // wd.findElement(By.linkText(" Sign up "));
        // wd.findElement(By.partialLinkText(" Sign up "));
    }

    public void fillRegistrationForm(String name, String lastname, String email, String password) {
        //if form displayed -- fill
        if ((wd.findElement(By.tagName("form")).isDisplayed())) {
            //fill form
            type(By.id("name"), name);
            type(By.cssSelector("#lastName"), lastname);
            type(By.id("email"), email);
            type(By.cssSelector("#password"), password);
        }


    }

    public void checkPolicy() {
        if (!wd.findElement(By.id("terms-of-use")).isSelected()) {
            click(By.xpath("//label[@for='terms-of-use']"));
        }
    }


    public boolean isRegistrationSuccess() {
        WebDriverWait waite = new WebDriverWait(wd,10);
        waite.until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector("dialog-container"))));
        WebElement message = wd.findElement(By.cssSelector("h2.message"));
        String text = message.getText();
        return text.equals("You are logged in success");
}

    public void fillRegistrationForm(User user) {
        if (wd.findElement(By.tagName("form")).isDisplayed()) {
            // fill form
            type(By.id("name"), user.getName());
            type(By.cssSelector("#lastName"), user.getLastName());
            type(By.id("email"), user.getEmail());
            type(By.cssSelector("#password"), user.getPassword());
        }

    }
    }


