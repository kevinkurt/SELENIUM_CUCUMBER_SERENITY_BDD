@Suite @Login
Feature: CP01 - Validar el inicion de sesion y deslogueo
# aqui se realiza la descripcion nueva y titulo
  Background: validar el uso de credenciales y realizar el inicio de sesion en la pagina
# dejamos lo que nos funcione
    Given el usuario navega al sitio web

  @validarseleccioncarrito
  Scenario: 1- validar seleccion correcta de un producto
    When ingresa credenciales validas
    And la aplicacion deberia mostrar el modulo principal de producto
   Then nos deslogeamos de la aplicacion



