# language: es

Característica: Asignar Responsables a Tarjetas en el Tablero Kanban

  Como usuario, deseo asignar responsables a las tarjetas del tablero Kanban
  para clarificar quién es responsable de cada tarea.

  Antecedentes:
    Dado Sergey está en la página de inicio de sesión
    Y ingresa el nombre de usuario "cbarahona@calengs.com" y la contraseña "testenvpass"
    Y debería estar en su panel de control

  Escenario: Asignar un responsable a una tarjeta en el tablero
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea importante"
    Y el usuario desea asignar la tarjeta a "Juan Pérez"
    Cuando el usuario asigna "Juan Pérez" como responsable de la tarjeta
    Entonces la tarjeta "Tarea importante" debería mostrar a "Juan Pérez" como su responsable

  Escenario: Cambiar el responsable de una tarjeta
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea crítica" asignada a "Ana Rodríguez"
    Y el usuario desea cambiar el responsable a "Carlos Gómez"
    Cuando el usuario cambia al responsable de "Tarea crítica" a "Carlos Gómez"
    Entonces la tarjeta "Tarea crítica" debería mostrar a "Carlos Gómez" como su nuevo responsable

  Escenario: Eliminar el responsable de una tarjeta
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea de equipo" asignada a "Laura García"
    Y el usuario desea eliminar el responsable de "Tarea de equipo"
    Cuando el usuario quita al responsable de la tarjeta
    Entonces la tarjeta "Tarea de equipo" no debería tener un responsable asignado

  Escenario: Asignar un responsable a una tarjeta sin título
    Dado el usuario está en la página del tablero Kanban
    Y el usuario desea asignar la tarjeta sin título a "Pedro Martínez"
    Cuando el usuario asigna a "Pedro Martínez" como responsable de la tarjeta sin título
    Entonces la tarjeta sin título debería mostrar a "Pedro Martínez" como su responsable
