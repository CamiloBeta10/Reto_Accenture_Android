package com.co.certificacion.swaglab.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/compra_producto.feature",
        glue = "com/co/certificacion/swaglab/stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ComprarProductoRunner {
}
