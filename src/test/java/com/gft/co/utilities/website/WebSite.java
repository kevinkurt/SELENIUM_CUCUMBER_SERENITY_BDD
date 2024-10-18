package com.gft.co.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("navegar al sitio web")
    public void navogateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }

}
