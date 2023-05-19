package com.co.certificacion.swaglab.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.NoSuchElementException;

public class Buscar implements Interaction {

    private final Target target;

    public Buscar(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 20; i++) {
            if (target.resolveFor(actor).isCurrentlyVisible()) {
                break;
            }
        }
        if (target.resolveFor(actor).isCurrentlyVisible()) {
            actor.attemptsTo(Click.on(target));
        } else {
            throw new NoSuchElementException(target.getCssOrXPathSelector());
        }
    }

    public static Buscar elProducto(Target target) {
        return Tasks.instrumented(Buscar.class, target);
    }
}
