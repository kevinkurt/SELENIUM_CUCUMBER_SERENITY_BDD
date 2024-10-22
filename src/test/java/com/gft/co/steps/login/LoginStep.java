package com.gft.co.steps.login;

import com.gft.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

import java.time.Duration;


public class LoginStep extends LoginPage {



    @Step("ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }


    @Step("ingresar contraseña")
    public void typepassword(String password){
        txt_password.sendKeys(password);
    }


    @Step("Click en el boton login")
    public void clicklogin(){
        btn_login.click();
    }


    @Step("boton de menu")
    public void clickMenu(){
        btn_menu.click();
    }

    @Step("boton de deslogueo")
    public void clickDeslogeo(){
        btn_deslogeo.click();
    }

    // accion para visualizar el deslogueo
    @Step("visualizacion del deslogueo")
    public boolean visualizacionDeslogueo(){
        return visualiacion_deslogueo.isDisplayed();
    }





}
