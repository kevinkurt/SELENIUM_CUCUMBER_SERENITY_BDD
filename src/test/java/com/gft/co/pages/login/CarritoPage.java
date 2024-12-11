package com.gft.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoPage extends PageObject {

    // mapeo del carrito de compras para añadir al carrito
    @FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div/button")
    protected WebElementFacade btn_ADD_TO_CART;

}
