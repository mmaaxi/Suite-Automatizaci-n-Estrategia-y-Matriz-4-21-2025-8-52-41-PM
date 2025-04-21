Feature: Verificación de Matriz

  Scenario: Validar la matriz de datos de prueba
    Given La matriz de datos es cargada
    When Verifico la integridad de los datos en la matriz
    Then La matriz se carga correctamente sin errores
    And Los datos son coherentes y completos