package com.co.certificacion.swaglab.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprobacionCompraPage {

    public static final String LABEL_FINISH = "FINISH";

    public static final Target BOTON_FINISH = Target.the("Boton para finalizar la compra")
            .located(AppiumBy.accessibilityId("test-FINISH"));

    public static final Target LABEL_PRODUCTO = Target.the("Nombre e informacion de el producto a comprar")
            .located(AppiumBy.accessibilityId("test-Item"));

    public static final Target LABEL_MENSAJE_COMPRA = Target.the("Mensaje de agradecimiento por la compra")
            .located(By.xpath("//android.widget.TextView[@text='THANK YOU FOR YOU ORDER']"));


    private ComprobacionCompraPage() {
        throw new IllegalStateException("Utility class");
    }

}

