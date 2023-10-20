# language: es

Característica: Funcionalidad de Inicio de Sesión y Gestión de Cuentas en una Aplicación de Tablero Kanban

  @escenario01
  Escenario: Iniciar Sesión con Credenciales Válidas
    Dado sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "cbarahona@calengs.com" y la contraseña "testenvpass"
    Entonces debería estar en su panel de control

  @escenario02
  Escenario: Iniciar Sesión con Credenciales Incorrectas
    Dado Sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "lizmarie@sjdhf.com" y la contraseña "sjsdsskk"
    Entonces debería ver un mensaje de error que dice "Email isn't a valid email"

  @escenario03
  Escenario: Mostrar Contraseña
    Dado Sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "lizmarie@sjdhf.com" y la contraseña "sjsdsskk"
    Y hace clic en el enlace "Show Password"
    Entonces debería ver su contraseña en texto claro

  @escenario04
  Escenario: Olvidé mi Contraseña
    Dado Sergey está en la página de inicio de sesión
    Cuando hace clic en el enlace "Olvidé mi Contraseña"
    Y proporciona su dirección de correo electrónico "micorreo@example.com"
    Y hace clic en el botón "Enviar"
    Entonces debería recibir un correo electrónico de recuperación de contraseña

  @escenario05
  Escenario: Crear una Cuenta Nueva
    Dado Sergey está en la página de registro
    Cuando completa el formulario de registro con su nombre, correo electrónico y contraseña
    Y hace clic en el botón "Registrarse"
    Entonces debería estar en su panel de control

