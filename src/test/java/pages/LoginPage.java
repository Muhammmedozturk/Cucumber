package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*
Scenari Outline ile DDT yapılabilir. Scenario Outline iyi bilinmelidir.
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
En çok kullanılan cucumber ozelliklerinden biridir
Examples kelisi veri girisleri icin kullanilmalidir
Step definitionslardaki data tipi STRINGdir
Examples kelimesi en sonda kullanilir
Data Tables ile DDT yapılabilir
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
Scenari Outline kadar yaygın degildir
Examples kelimesi kullanılmaz
Step definitionslardaki data tipi DATATABLE
DataTablelar ara adimlardada(STEPS) kullanilabilir
     */

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[text()=' Login']")
    public WebElement login;
}