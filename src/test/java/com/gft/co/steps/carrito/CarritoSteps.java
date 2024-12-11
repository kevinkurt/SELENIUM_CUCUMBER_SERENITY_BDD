package com.gft.co.steps.carrito;

import com.gft.co.pages.login.CarritoPage;
import net.thucydides.core.annotations.Step;

public class CarritoSteps extends CarritoPage {

    @Step("boton añadir carrito")
        public void addcarrito(){
            btn_ADD_TO_CART.click();
        }
    }


