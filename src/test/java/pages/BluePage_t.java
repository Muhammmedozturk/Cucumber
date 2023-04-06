package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluePage_t {
    public BluePage_t(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
