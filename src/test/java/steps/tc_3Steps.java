package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_3Page;
import static org.junit.Assert.assertTrue;

public class tc_3Steps {
    WebDriver driver;
    tc_3Page tc_3page;

    @Given("^el usuario ingresa a la URL del Google Sheets$")
    public void ingresarURLSheet() {
        tc_3page = new tc_3Page(driver);
        tc_3page.navigateToSheet();
    }

    @Then("^la hoja de cálculo se carga y se muestra correctamente$")
    public void validarCargaDeHoja() {
        assertTrue(tc_3page.isSheetLoadedCorrectly());
    }
}