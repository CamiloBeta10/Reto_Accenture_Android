package com.co.certificacion.swaglab.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.certificacion.swaglab.models.DatosPrueba.getDatosPrueba;
import static com.co.certificacion.swaglab.userinterface.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {

    public static Autenticacion EnLaApp() {
        return instrumented(Autenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NOMBRE_USUARIO),
                Enter.theValue(getDatosPrueba().get("usuario").toString()).into(NOMBRE_USUARIO),
                Click.on(CLAVE_USUARIO),
                Enter.theValue(getDatosPrueba().get("clave").toString()).into(CLAVE_USUARIO),
                Click.on(BOTON_LOGIN)
        );

    }


}
