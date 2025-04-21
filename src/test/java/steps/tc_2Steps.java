package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_2Page;
import org.junit.Assert;

public class tc_2Steps {

    tc_2Page matrizPage = new tc_2Page();

    @Given("La matriz de datos es cargada")
    public void laMatrizDeDatosEsCargada() {
        matrizPage.cargarMatriz();
    }

    @When("Verifico la integridad de los datos en la matriz")
    public void verificoIntegridadDeDatos() {
        matrizPage.validarIntegridadDeDatos();
    }

    @Then("La matriz se carga correctamente sin errores")
    public void laMatrizSeCargaCorrectamenteSinErrores() {
        Assert.assertTrue(matrizPage.esMatrizCargadaCorrectamente());
    }

    @Then("Los datos son coherentes y completos")
    public void losDatosSonCoherentesYCompletos() {
        Assert.assertTrue(matrizPage.sonDatosCoherentesYCompletos());
    }
}