package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluePage {
    public BluePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
