package com.co.certificacion.swaglab.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Esperar implements Interaction {

    private final int segundos;

    public Esperar(int segundos) {
        this.segundos = segundos;
    }

    public static Esperar conDuracion(int seconds) {
        return Tasks.instrumented(Esperar.class, seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1_000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
