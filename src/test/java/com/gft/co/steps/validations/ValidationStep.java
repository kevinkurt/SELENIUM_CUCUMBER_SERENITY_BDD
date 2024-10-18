package com.gft.co.steps.validations;

import com.gft.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("validar visualizacion del modulo de productos")
    public boolean titleVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("validar visualizacion del mensaje de error")
    public boolean errormessageISDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }

}