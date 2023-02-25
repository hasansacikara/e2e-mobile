package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefinitions {

    Allpages elements = new Allpages();


    @Given("Alltricks anasayfasina git")
    public void alltricks_anasayfasina_git() {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));


    }

    @Given("Profil sekmesine geç")
    public void profil_sekmesine_geç() {

    }

    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() {

    }


}