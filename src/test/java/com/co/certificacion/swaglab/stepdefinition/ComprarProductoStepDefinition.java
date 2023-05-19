package com.co.certificacion.swaglab.stepdefinition;


import com.co.certificacion.swaglab.question.MensajeDeCompra;
import com.co.certificacion.swaglab.question.ObtenerTexto;
import com.co.certificacion.swaglab.task.*;
import com.co.certificacion.swaglab.utils.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.co.certificacion.swaglab.userinterface.ComprobacionCompraPage.LABEL_PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class ComprarProductoStepDefinition {

    @Before
    public void inicializarEscenario() {
        setTheStage(new OnlineCast());
    }

    @Dado("Camilo inicia sesion en la app")
    public void camiloIniciaSesionEnLaAppa(List<Map<String, Object>> data) {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.mobile())));
        theActorCalled("Camilo");
        theActorInTheSpotlight().wasAbleTo(CargarDatos.con(data));
        theActorInTheSpotlight().attemptsTo(Autenticacion.EnLaApp());
    }

    @Cuando("^Agrego producto a el carrito de comprar$")
    public void agregoProductoAElCarritoDeComprar(List<Map<String, Object>> data) {
        theActorInTheSpotlight().wasAbleTo(CargarDatos.con(data));
        theActorInTheSpotlight().attemptsTo(AgregarProducto.aElCarritoDeCompras());
    }

    @Cuando("^Ingreso mis datos para la compra$")
    public void ingresoMisDatosParaLaCompra(List<Map<String, Object>> data) {
        theActorInTheSpotlight().wasAbleTo(CargarDatos.con(data));
        theActorInTheSpotlight().attemptsTo(IngresarInformacion.paraLaCompra());
        theActorInTheSpotlight().should(seeThat(ObtenerTexto.delElemento(LABEL_PRODUCTO),
                equalTo(theActorInTheSpotlight().recall("productoSeleccionado"))));
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.deProducto());
    }

    @Entonces("^Visualizo la orden ingreso exitosamente$")
    public void visualizoLaOrdenIngresoExitosamente() {
        theActorInTheSpotlight().should(seeThat(MensajeDeCompra.exitosa()));
    }


}



