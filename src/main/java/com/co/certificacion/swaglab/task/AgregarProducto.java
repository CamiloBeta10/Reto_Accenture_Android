package com.co.certificacion.swaglab.task;

import com.co.certificacion.swaglab.interaction.Buscar;
import com.co.certificacion.swaglab.interaction.Esperar;
import com.co.certificacion.swaglab.interaction.Scroll;
import com.co.certificacion.swaglab.question.ObtenerTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.certificacion.swaglab.models.DatosPrueba.getDatosPrueba;
import static com.co.certificacion.swaglab.userinterface.CarritoCompraPage.BOTON_CHECKOUT;
import static com.co.certificacion.swaglab.userinterface.CarritoCompraPage.INFORMACION_PRODUCTO;
import static com.co.certificacion.swaglab.userinterface.ProductosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    public static AgregarProducto aElCarritoDeCompras() {
        return instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TOGGLE),
                Esperar.conDuracion(2),
                Buscar.elProducto(PRODUCTOS.of(getDatosPrueba().get("producto").toString()))
        );
        actor.attemptsTo(
                Scroll.hastaElElemento(AGREGAR_AL_CARRITO),
                Esperar.conDuracion(2),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_CARRITO_COMPRA)
        );
        Esperar.conDuracion(2);
        actor.remember("productoSeleccionado", ObtenerTexto.delElemento(INFORMACION_PRODUCTO));
        actor.attemptsTo(
                Click.on(BOTON_CHECKOUT)
        );
    }

}
