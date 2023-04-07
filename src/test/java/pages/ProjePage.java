package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjePage {
    public ProjePage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy (xpath = "//*[@class='fa fa-lock']")
    public WebElement login;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;
    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginPage;

}
