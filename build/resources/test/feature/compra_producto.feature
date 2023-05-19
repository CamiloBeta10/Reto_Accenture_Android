# language: es

Característica:  El usuario compra un producto
  Yo como usuario compro un producto por la app swag lab

  Escenario: comprar producto por la app swag lab
    Dado Camilo inicia sesion en la app
      | usuario       | clave        |
      | standard_user | secret_sauce |
    Cuando Agrego producto a el carrito de comprar
      | producto                |
      | Sauce Labs Bolt T-Shirt |
    Y  Ingreso mis datos para la compra
      | nombre | apellido | codigo_postal |
      | Camilo | Betancur | 054400        |
    Entonces Visualizo la orden ingreso exitosamente