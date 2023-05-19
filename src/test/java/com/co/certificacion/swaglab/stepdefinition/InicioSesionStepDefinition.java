package com.co.certificacion.swaglab.stepdefinition;

import com.co.certificacion.swaglab.question.PaginaInicio;
import com.co.certificacion.swaglab.task.Autenticacion;
import com.co.certificacion.swaglab.task.CargarDatos;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStepDefinition {

    @Before
    public void iniciarEscenario() {
        setTheStage(new OnlineCast());
    }

    @Dado("^Yo como usuario del se la app swag lab en android$")
    public void yoComoUsuarioDelSeLaAppSwagLabEnAndroid() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.mobile())));
        theActorCalled("Camilo");

    }

    @Cuando("^Ingreso credenciales para la autenticacion$")
    public void ingresoCredencialesParaLaAutenticacion(List<Map<String, Object>> data) {
        theActorInTheSpotlight().wasAbleTo(CargarDatos.con(data));
        theActorInTheSpotlight().attemptsTo(Autenticacion.EnLaApp());

    }

    @Entonces("^Visualizo la pantalla principal$")
    public void visualizoLaPantallaPrincipal() {
        theActorInTheSpotlight().should(seeThat(PaginaInicio.esVisible()));
    }

}
