package com.co.certificacion.swaglab.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonalPage {

    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar nombre de quien compra el producto")
            .located(AppiumBy.accessibilityId("test-First Name"));

    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar apellido de quien compra el producto")
            .located(AppiumBy.accessibilityId("test-Last Name"));

    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Campo para ingresar codigo postal de quien compra el producto")
            .located(AppiumBy.accessibilityId("test-Zip/Postal Code"));

    public static final Target BOTON_CONTINUE = Target.the("Boton para continuar con la compra")
            .located(AppiumBy.accessibilityId("test-CONTINUE"));

    private InformacionPersonalPage() {
        throw new IllegalStateException("Utility class");
    }
}

