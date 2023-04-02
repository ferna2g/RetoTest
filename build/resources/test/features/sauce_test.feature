
  Feature: Iniciar sesion en Sauce Demo
    Scenario: Iniciar sesion con exito
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi nombre de usuario "standard_user" y mi contrasena "secret_sauce"
    Then veo la pagina de productos

    Scenario Outline: Agregar un producto al carrito de compras
      When selecciono el producto "<producto>" de la lista
      And  presiono el boton de agregar carrito
      And  veo que el producto "<producto>" fue agregado al carrito de compra
      Then regreso a productos

     Examples:
      | producto                |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |

     Scenario: Ordenar por precio de menor a mayor
      When selecciono "Price (low to high)" en el menu de ordenamiento
      Then veo los productos ordenados por precio de menor a mayor
      And el precio del primer producto es menor o igual al precio del segundo producto
      And el precio del segundo producto es menor o igual al precio del tercer producto
      And el precio del tercer producto es menor o igual al precio del cuarto producto
