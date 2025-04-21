Feature: Verificación de Estrategia

  Scenario: Ejecutar y validar estrategia
    Given Estoy en la aplicación de validación de estrategias
    When Ejecuto la validación de estrategia
    Then La estrategia está correctamente aplicada

  Scenario: Comprobar resultados de estrategia
    Given La estrategia está aplicada
    When Compruebo los resultados de la estrategia
    Then Resultados consistentes con la estrategia definida