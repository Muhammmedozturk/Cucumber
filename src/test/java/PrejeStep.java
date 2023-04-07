import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ProjePage;
import utilities.Driver;

public class PrejeStep {

    ProjePage projePage=new ProjePage();
    @Given("Kullanici Given Kullanici {string} adresine girer")
    public void kullanici_given_kullanici_adresine_girer(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {

    }
    @When("kullanici {string} alanina kullanici adini girer")
    public void kullanici_alanina_kullanici_adini_girer(String string) {

    }
    @When("kullanici {string} alanina kullanici password girer")
    public void kullanici_alanina_kullanici_password_girer(String string) {

    }
    @When("kullanici acilan sayfada menu butonuna tiklar")
    public void kullanici_acilan_sayfada_menu_butonuna_tiklar() {

    }
    @When("kullanici sol taraftan contact get all butonuna tiklar")
    public void kullanici_sol_taraftan_contact_get_all_butonuna_tiklar() {

    }
    @When("kullanici acilan sayfada yazilan mesajlari goruntuledigini dogrular")
    public void kullanici_acilan_sayfada_yazilan_mesajlari_goruntuledigini_dogrular() {

    }
}
