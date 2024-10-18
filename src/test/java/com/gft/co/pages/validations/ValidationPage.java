package com.gft.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    protected  WebElementFacade lbl_errorMessage;






}