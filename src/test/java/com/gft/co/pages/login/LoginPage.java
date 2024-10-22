package com.gft.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageObject {

    // mapeo de el usario
    @FindBy(id="user-name")
    protected WebElementFacade txt_username;

    @FindBy(id="password")
    protected WebElementFacade txt_password;

    @FindBy(id="login-button")
    protected WebElementFacade btn_login;

    @FindBy(className = "bm-burger-button")
    protected WebElementFacade btn_menu;

    @FindBy(id = "logout_sidebar_link")
    protected WebElementFacade btn_deslogeo;

    @FindBy(className = "login-box")
    protected  WebElementFacade visualiacion_deslogueo;



}
