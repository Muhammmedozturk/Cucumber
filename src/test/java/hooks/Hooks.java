package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {
    /*
    Hooks : Her bir Scenario yada Scenario Outline dan ONCE yada SONRA calismasmasini istedigim metotlar konur
    @Before ve @After metotlarini icerir
    Burda onemli olan raporlama isleminin ekran goruntusuyle birlikde Hooks yardimiyla yapilmasidir
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("Afher Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_");
            Driver.closeDriver();
        }
    }
}
/*
ARAMA RAPORLARINI BULUTA EKLEME
1. resources dosyasinin altında cucumber properties dosyası olustur : cucumber.properties
2. Su kodu ekle: cucumber.publish.enabled=true
3. Testi calistir. Bu sekilde cucumber html raporu cloud yuklenecektir. Fakat GitHub ile girls yapilmassa 24 saat icinde silinecektir. Bu yüzden GitHub ile giriş yapalım.
4. Login with GitHub a tikla > Authorize SmartBear
5. Create Collection
6. Tokeni cucumber.properties e ekle
7. Testi tekrar calistir. Collections klasorunde raporlar olusucakdir.
 */