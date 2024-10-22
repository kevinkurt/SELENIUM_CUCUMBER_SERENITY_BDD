@Suite @Login
Feature: CP02 - Validar la seleccion de un producto
# aqui se realiza la descripcion nueva y titulo
  Background: validar el la seleccion correcta de un producto en la pagina
# dejamos lo que nos funcione
    Given el usuario navega al sitio web

  @validarseleccioncarrito
  Scenario: 1- validar seleccion correcta de un producto
    When ingresa credenciales validas
    And la aplicacion deberia mostrar el modulo principal de producto
    And seleccionamos un producto y su visualiazacion
    Then nos deslogeamos de la aplicacion



