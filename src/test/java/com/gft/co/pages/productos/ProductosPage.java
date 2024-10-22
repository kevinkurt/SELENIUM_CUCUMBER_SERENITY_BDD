package com.gft.co.pages.productos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductosPage extends PageObject  {

    // mapeo de los productos

    // este mapeo es para seleccionar el producto
    @FindBy(id = "item_5_title_link")
    protected WebElementFacade link_producto;

    //mapeo de la visualizacion del producto
    @FindBy(className = "inventory_details_name")
    protected WebElementFacade ver_producto;








}
