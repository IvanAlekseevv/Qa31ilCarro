package tests;

import models.Car;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTests extends TestsBase{

    @BeforeMethod
    public void preCondition(){
        //Если я не залогинен нужно залогинеться
        // if !logged ---> login()

    }
    @Test
    public void addNewCarSuccess(){
        // model ---open carform ---> fill carForm --- attachPhoto ---submitBTN
        Car car = Car.builder()
                .address("Tel Aviv, Israel")
                .make("BMW")
                .model("M5")
                .year("2020")
                .engine("2.5")
                .fuel("Petrol")
                .gear("MT")
                .wD("AWD")
                .doors("5")
                .seats("4")
                .clasS("C")
                .fuelConsumption("6.5")
                .carRegNumber("102-33-39")
                .price("65")
                .distanceIncluded("500")
                .features("type of")
                .about("Very good car")
                .build();

        app.getCarHelper().openCarForm();
        app.getCarHelper().fillCarForm(car);
        app.getCarHelper().attachPhoto("");
        app.getCarHelper().submitForm();


    }
}
