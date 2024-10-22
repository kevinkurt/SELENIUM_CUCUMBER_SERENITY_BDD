package com.gft.co.definitions;

import com.gft.co.steps.producto.ProductStep;
import com.gft.co.steps.validations.ValidationStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VisuaProductoDefinitions {

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ProductStep producto;


    @Then("la aplicacion deberia mostrar el modulo principal de producto")
    public void systemShowProdutsModule(){
        Assert.assertTrue(validate.titleVisible());
    }


    @When("seleccionamos un producto y su visualiazacion")
    public void seleccionamos_un_producto_y_su_visualiazacion() {
        // buscamos las variables que creamos para producto
        producto.seleccionarProducto();
        producto.visualizacionProducto();

    }

}
