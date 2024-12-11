package com.gft.co.definitions;

import com.gft.co.steps.carrito.CarritoSteps;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;

public class CarritoDefinitions {


@Steps(shared = true)
    CarritoSteps carrito;


    @When("lo añadimos al carrito de compras y visualizamos el carrito de compras")
    public void lo_añadimos_al_carrito_de_compras_y_visualizamos_el_carrito_de_compras() {
        // Write code here that turns the phrase above into concrete actions
        carrito.addcarrito();
    }
 // importamos la clase que queremos colocarles

}
