package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    UserHelper userHelper;
    CarHelper carHelper;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://ilcarro.xyz/search");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        userHelper = new UserHelper(wd);
        carHelper = new CarHelper(wd);
    }
    public void stop(){
          wd.quit();

    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public CarHelper getCarHelper() {
        return carHelper;
    }
}
