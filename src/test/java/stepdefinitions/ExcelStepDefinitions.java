package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
//Page Objelerini oluştur
    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdı) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String path="./src/test/resources/testdata/mysmoketestdata.xlsx";
       // String sayfa = "customer_info";
        excelUtils=new ExcelUtils(path,sayfaAdı);
        excelData=excelUtils.getDataList();
        //loop koyalım
        for (Map<String, String> data :excelData){
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
            homePage=new HomePage();
            loginPage=new LoginPage();
            //anasayfa login butonuna tıkla
            homePage.firstLogin.click();
            ReusableMethods.waitFor(2);
            //email gönder
            loginPage.email.sendKeys(data.get("username"));
            //şifre gönder
            loginPage.password.sendKeys(data.get("password"));
            //login butonua tıkla
            loginPage.login.click();
            //giriş yapıldığını verify edelim
            Assert.assertTrue(homePage.userID.isDisplayed());
            ReusableMethods.getScreenshot("Login_Goruntusu");
            //Logout yapalım
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
            ReusableMethods.waitFor(1);
        }
        Driver.closeDriver();

    }
}
