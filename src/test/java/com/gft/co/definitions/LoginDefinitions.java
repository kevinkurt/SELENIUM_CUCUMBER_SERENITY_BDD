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

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navogateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredencials(){
        login.typeUsername("standard_user");
        login.typepassword("secret_sauce");
        login.clicklogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de producto")
    public void systemShowProdutsModule(){
        Assert.assertTrue(validate.titleVisible());
    }

    @When("ingresa credenciales invalidas")
    public void userLoginWithinValidCredencials(){
        login.typeUsername("standard_user");
        login.typepassword("asdasdasd");
        login.clicklogin();
    }

    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errormessageISDisplayed());
    }


}
