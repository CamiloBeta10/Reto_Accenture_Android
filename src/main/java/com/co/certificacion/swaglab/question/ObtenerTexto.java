package com.co.certificacion.swaglab.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerTexto implements Question<String> {

    private final Target target;

    public ObtenerTexto(Target target) {
        this.target = target;
    }

    public static ObtenerTexto delElemento(Target target) {
        return new ObtenerTexto(target);
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).answeredBy(actor).toString();
    }
}
