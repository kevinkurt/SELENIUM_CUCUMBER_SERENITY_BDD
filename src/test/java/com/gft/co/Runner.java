package com.gft.co;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



//este va a hacer nuestro runner donde vamos a configurarlo para ejecutarlo

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feactures",
        glue = "com.gft.co.definitions",
        tags = "@Login"
)
public class Runner {

}
