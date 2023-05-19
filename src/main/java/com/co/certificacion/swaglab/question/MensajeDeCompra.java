package com.co.certificacion.swaglab.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.certificacion.swaglab.userinterface.ComprobacionCompraPage.LABEL_MENSAJE_COMPRA;

public class MensajeDeCompra implements Question<Boolean> {

    public static MensajeDeCompra exitosa() {
        return new MensajeDeCompra();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeCompra = false;
        if (LABEL_MENSAJE_COMPRA.resolveFor(actor).isDisplayed()) {
            mensajeCompra = true;
            actor.should(String.valueOf(LABEL_MENSAJE_COMPRA.resolveFor(actor).isPresent()));
        }
        return mensajeCompra;
    }
}

