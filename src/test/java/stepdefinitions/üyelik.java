package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;

public class üyelik {

    Allpages elements = new Allpages();

    @Given("cookies kabul et")
    public void cookies_kabul_et() {


        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));
    }

    @Then("ana sayafaya gider")
    public void ana_sayafaya_gider() {

    }

    @Then("My Accounta clic yapar")
    public void my_accounta_clic_yapar() {

    }

    @Then("SingIn botonuna click yapar")
    public void sing_ın_botonuna_click_yapar() {

    }

    @Then("başarili giris yapıldı")
    public void başarili_giris_yapıldı() {

    }
}

