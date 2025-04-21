Feature: Verificación de Integración con Google Sheets

  Scenario: Validar que Google Sheets carga correctamente y se muestra información
    Given el usuario ingresa a la URL del Google Sheets
    Then la hoja de cálculo se carga y se muestra correctamente