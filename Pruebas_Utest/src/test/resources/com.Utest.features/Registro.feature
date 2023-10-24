@PruebasRegistro
Feature: Pruebas Registro

  @CPLA001
  Scenario Outline: CPLA001 Creacion de usuario nuevo
    Given Ingresar al portal
    When Realizar el resgistro <firstName> <lastName> <email> <mes> <dia> <año> <idioma> <city> <zip> <yourMobileDevice> <model> <operatingSystem> <password> <confirmPassword>
    Then Valido creacion

    Examples:
      | firstName | lastName      | email        | mes      | dia      | año      |idioma    |city      |zip    |yourMobileDevice    |model      |operatingSystem    |password      |confirmPassword    |
    ##@externaldata@./src/test/resources/Data/DataRegistro.xlsx@CPL001
|"FelipeO"|"OrjuelaF"|"fisesistemas@hotmail.com"|"February"|"11"|"1996"|"spanish"|"Bogotá Colombia"|"110111"|"Apple"|"iPhone 4"|"iOS 11.1.1"|"Prueba#12345"|"Prueba#12345"|


