package com.gft.co.definitions;

import com.gft.co.steps.login.LoginStep;
import com.gft.co.steps.validations.ValidationStep;
import com.gft.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinitions {

    // agregamos los pasos que vamos a heredar

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;


    // validar lo que nos funciona y eliminar escenarios existentes

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navogateTo("https://www.saucedemo.com/v1/index.html");
    }

    // estas son las acciones llamadas de las clases para ingresar los datos del usuario
    @When("ingresa credenciales validas")
    public void userLoginWithValidCredencials() {
        login.typeUsername("standard_user");
        login.typepassword("secret_sauce");
        login.clicklogin();
        // se le agregar mas cosas al codigo

    }

    @Then("nos deslogeamos de la aplicacion")
    public void nos_deslogeamos_de_la_aplicacion() {
        // accion de deslogueo

        login.clickMenu();
        login.clickDeslogeo();
        login.visualizacionDeslogueo();


    }


}
