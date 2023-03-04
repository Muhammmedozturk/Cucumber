package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
//Page Objelerini oluştur
    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) {
        // Write code here that turns the phrase above into concrete actions
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils=new ExcelUtils(path,sayfa);
        excelData=excelUtils.getDataList();

    }
}
