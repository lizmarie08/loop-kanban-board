# language: es
Característica: Creación de Tarjetas Kanban

  Como usuario, quiero poder crear tarjetas Kanban en el tablero para gestionar mis tareas.

  Antecedentes:
    Dado sergey está en la página de inicio de sesión
    Y ingresa el nombre de usuario "cbarahona@calengs.com" y la contraseña "testenvpass"
    Y debería estar en su panel de control

  @escenario01
  Esquema del escenario: Crear una tarjeta Kanban en el tablero
    Cuando el usuario hace clic en el botón "Crear Tarjeta"
    Y completa el formulario de creación de tarjeta con el título "<Título>" y la descripción "<Descripción>"
    Y hace clic en el botón "Guardar"
    Entonces debería ver una nueva tarjeta en el tablero con el título "<Título>"
    Y la tarjeta debería estar en el estado "Por hacer"
    Ejemplos:
      | Título       | Descripción                   |
      | Nueva Tarea  | Esta es una nueva tarea por hacer |
      | Tarea sin descripción |                            |
      | Tarea con descripción larga | Esta es una descripción muy larga que se utiliza para probar la creación de tarjetas con descripciones extensas en el tablero |

