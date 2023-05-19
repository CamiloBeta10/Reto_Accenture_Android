package com.co.certificacion.swaglab.question;

import com.co.certificacion.swaglab.interaction.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.certificacion.swaglab.userinterface.InicioSesionPage.LABEL_PAGINA_INICIO;

public class PaginaInicio implements Question<Boolean> {

    public static PaginaInicio esVisible() {
        return new PaginaInicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean strElementoExistente = false;
        Esperar.conDuracion(5);
        if (LABEL_PAGINA_INICIO.resolveFor(actor).isVisible()) {
            strElementoExistente = true;
        }
        return strElementoExistente;
    }
}
