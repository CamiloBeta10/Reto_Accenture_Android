package com.co.certificacion.swaglab.task;

import com.co.certificacion.swaglab.interaction.Esperar;
import com.co.certificacion.swaglab.interaction.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.certificacion.swaglab.userinterface.ComprobacionCompraPage.BOTON_FINISH;
import static com.co.certificacion.swaglab.userinterface.ComprobacionCompraPage.LABEL_FINISH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompra implements Task {

    public static FinalizarCompra deProducto() {
        return instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.hastaElElemento(LABEL_FINISH),
                Esperar.conDuracion(1),
                Click.on(BOTON_FINISH)
        );

    }
}
