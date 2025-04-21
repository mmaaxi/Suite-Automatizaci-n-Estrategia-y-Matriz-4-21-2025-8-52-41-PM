package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_1Page;

public class tc_1Steps {

    WebDriver driver;
    tc_1Page page;

    public tc_1Steps() {
        driver = Hooks.driver;
        page = new tc_1Page(driver);
    }

    @Given("Estoy en la aplicación de validación de estrategias")
    public void estoy_en_la_aplicacion_de_validacion_de_estrategias() {
        page.navigateToApplication();
    }

    @When("Ejecuto la validación de estrategia")
    public void ejecuto_la_validacion_de_estrategia() {
        page.runStrategyValidation();
    }

    @Then("La estrategia está correctamente aplicada")
    public void la_estrategia_esta_correctamente_aplicada() {
        page.verifyStrategyApplied();
    }
    
    @Given("La estrategia está aplicada")
    public void la_estrategia_esta_aplicada() {
        page.verifyStrategyApplied();
    }

    @When("Compruebo los resultados de la estrategia")
    public void compruebo_los_resultados_de_la_estrategia() {
        page.checkStrategyResults();
    }

    @Then("Resultados consistentes con la estrategia definida")
    public void resultados_consistentes_con_la_estrategia_definida() {
        page.verifyConsistentResults();
    }
}