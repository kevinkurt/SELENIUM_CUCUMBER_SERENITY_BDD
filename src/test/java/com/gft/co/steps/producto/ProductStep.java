package com.gft.co.steps.producto;

import com.gft.co.pages.productos.ProductosPage;
import net.thucydides.core.annotations.Step;

public class ProductStep extends ProductosPage {

    // acciones y pasos

    @Step("seleccionar el producto")
    public void seleccionarProducto(){
        link_producto.click();
    }
    // accion para visualizar el producto
    @Step("visualizacion del producto")
    public boolean visualizacionProducto(){
        return ver_producto.isDisplayed();
    }


}
