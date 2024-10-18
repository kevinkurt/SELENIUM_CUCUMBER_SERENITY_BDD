@Suite @Login
Feature: CP01 - Validar inicio de sesion

  Background: validar el inicio de sesion con credenciales validas e invalidas

    Given el usuario navega al sitio web

  @ValidCredencials
  Scenario: 1- validar con credenciales correctas
    When ingresa credenciales validas
    Then la aplicacion deberia mostrar el modulo principal de producto

  @InvalidCredencials
  Scenario: 2- validar con credenciales incorrectas
    When ingresa credenciales invalidas
    Then la aplicacion deberia mostrar un mensaje de error
