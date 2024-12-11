@Suite @Carrito
  Feature: CP02 - Validar el uso de carrito de compras

    Background: validar el uso del carrito de compras en la pagina web

      Given el usuario navega al sitio web



    @validarcarritodecompras
    Scenario: 3 - validar el uso del carrito de compras seleccionando un producto
      When ingresa credenciales validas
      And la aplicacion deberia mostrar el modulo principal de producto
      And seleccionamos un producto y su visualiazacion
      And lo añadimos al carrito de compras y visualizamos el carrito de compras
      Then nos deslogeamos de la aplicacion