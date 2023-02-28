package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",//stepdefinitions path
        tags="@iphone or @tesla",
        dryRun =false // Ama dryRun true demek hızlı bütün stepleri
        // ara tara tanımlanmamış step definition var mı yok mu ona bakar(Missing definition var mı yok mu ona bakar)
        //zamandan tasarruf etmemizi sağlar. DryRun
)
public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//