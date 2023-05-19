package com.co.certificacion.swaglab.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompraPage {

    public static final Target BOTON_CHECKOUT = Target.the("Boton para continuar al checkout de la compra")
            .located(AppiumBy.accessibilityId("test-CHECKOUT"));

    public static final Target INFORMACION_PRODUCTO = Target.the("Nombre e informacion de el producto a comprar")
            .located(AppiumBy.accessibilityId("test-Item"));


    private CarritoCompraPage() {
        throw new IllegalStateException("Utility class");
    }
}
