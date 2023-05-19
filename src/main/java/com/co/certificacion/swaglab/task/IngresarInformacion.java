package com.co.certificacion.swaglab.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.certificacion.swaglab.models.DatosPrueba.getDatosPrueba;
import static com.co.certificacion.swaglab.userinterface.InformacionPersonalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarInformacion implements Task {

    public static IngresarInformacion paraLaCompra() {
        return instrumented(IngresarInformacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_NOMBRE),
                Enter.theValue(getDatosPrueba().get("nombre").toString()).into(CAMPO_NOMBRE),
                Click.on(CAMPO_APELLIDO),
                Enter.theValue(getDatosPrueba().get("apellido").toString()).into(CAMPO_APELLIDO),
                Click.on(CAMPO_CODIGO_POSTAL),
                Enter.theValue(getDatosPrueba().get("codigo_postal").toString()).into(CAMPO_CODIGO_POSTAL),
                Click.on(BOTON_CONTINUE)
        );
    }
}
