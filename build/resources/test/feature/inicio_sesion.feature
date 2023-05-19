# language:es

Característica: Inicio de session de un usuario en la plataforma Swag Labs
  Yo como usuario de Swag Labs necesito ingresar con mi credenciales e iniciar session en la app

  Escenario: : Inicio de session en la app de Android
    Dado Yo como usuario del se la app swag lab en android
    Cuando Ingreso credenciales para la autenticacion
      | usuario       | clave        |
      | standard_user | secret_sauce |
    Entonces Visualizo la pantalla principal