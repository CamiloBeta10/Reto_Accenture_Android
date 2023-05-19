package com.co.certificacion.swaglab.interaction;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scroll implements Interaction {

    private final String resourceText;

    public Scroll(String resourceText) {
        this.resourceText = resourceText;
    }

    public static Scroll hastaElElemento(String resourceText) {
        return instrumented(Scroll.class, resourceText);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + resourceText + "\"))"));
    }
}
