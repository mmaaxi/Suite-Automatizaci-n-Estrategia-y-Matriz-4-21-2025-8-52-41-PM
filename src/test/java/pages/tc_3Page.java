package pages;

import org.openqa.selenium.WebDriver;

public class tc_3Page {
    WebDriver driver;
    String sheetURL = "https://docs.google.com/spreadsheets/d/1XrPavtzInBvvLijqWaYU5h4mYgyccBSuc53PG1thhew";

    public tc_3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSheet() {
        driver.get(sheetURL);
    }

    public boolean isSheetLoadedCorrectly() {
        // Implementar verificación para comprobación concreta que la hoja se muestra correctamente.
        // Ejemplos: buscar un texto específico o un elemento conocido del documento
        return driver.getTitle().contains("Google Sheets");
    }
}