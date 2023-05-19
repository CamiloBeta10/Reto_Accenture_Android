package com.co.certificacion.swaglab.task;

import com.co.certificacion.swaglab.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarDatos implements Task {
    private final List<Map<String, Object>> datosPrueba;

    public CargarDatos(List<Map<String, Object>> datosPrueba) {
        this.datosPrueba = datosPrueba;
    }

    public static CargarDatos con(List<Map<String, Object>> data) {
        return instrumented(CargarDatos.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!datosPrueba.isEmpty()) {
            Set<Map.Entry<String, Object>> mapSet = datosPrueba.get(0).entrySet();
            Map<String, Object> mapResult = mapSet.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (DatosPrueba.getDatosPrueba() == null) {
                DatosPrueba.conDatosPrueba(mapResult);
            } else {
                DatosPrueba.getDatosPrueba().clear();
                DatosPrueba.getDatosPrueba().putAll(mapResult);
            }
        }
    }
}