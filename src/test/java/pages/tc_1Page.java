package pages;

import org.openqa.selenium.WebDriver;

public class tc_1Page {

    WebDriver driver;

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToApplication() {
        // Código para navegar a la aplicación de validación de estrategias
        driver.get("http://example.com/strategy-validation");
    }

    public void runStrategyValidation() {
        // Código para ejecutar la validación de estrategia
    }

    public void verifyStrategyApplied() {
        // Código para verificar que la estrategia está correctamente aplicada
    }
    
    public void checkStrategyResults() {
        // Código para comprobar los resultados de la estrategia
    }

    public void verifyConsistentResults() {
        // Código para verificar que los resultados son consistentes con la estrategia definida
    }
}