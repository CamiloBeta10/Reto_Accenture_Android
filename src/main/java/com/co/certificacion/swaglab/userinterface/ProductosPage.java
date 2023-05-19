package com.co.certificacion.swaglab.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class ProductosPage {

    public static String AGREGAR_AL_CARRITO = "ADD TO CART";

    public static final Target TOGGLE = Target.the("Cambio la visualizacion de los objetos")
            .located(AppiumBy.accessibilityId("test-Toggle"));

    public static final Target PRODUCTOS = Target.the("Campo para ingresar nombre de usuario")
            .locatedBy("//*[@text='{0}']");


    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton para agregar producto a el carrito de compra")
            .located(AppiumBy.accessibilityId("test-ADD TO CART"));

    public static final Target BOTON_CARRITO_COMPRA = Target.the("Boton ir a el carrito de compra")
            .located(AppiumBy.accessibilityId("test-Cart"));

    private ProductosPage() {
        throw new IllegalStateException("Utility class");
    }
}

