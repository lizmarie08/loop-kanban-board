# language: es

Característica: Mover Tarjetas en el Tablero Kanban

Como usuario, quiero poder mover tarjetas entre columnas en el tablero Kanban
para gestionar el progreso de las tareas de manera efectiva.

  Antecedentes:
    Dado sergey está en la página de inicio de sesión
    Y ingresa el nombre de usuario "cbarahona@calengs.com" y la contraseña "testenvpass"
    Y debería estar en su panel de control

  Escenario: Mover una tarjeta a una columna diferente
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea por hacer" en la columna "Por Hacer"
    Y existe una columna "En Progreso"
    Cuando el usuario arrastra la tarjeta a la columna "En Progreso"
    Entonces la tarjeta "Tarea por hacer" debería estar en la columna "En Progreso"
    Y la tarjeta debería tener el estado "En Progreso"

  Escenario: Mover una tarjeta a una columna finalizada
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea en curso" en la columna "En Progreso"
    Y existe una columna "Finalizado"
    Cuando el usuario arrastra la tarjeta a la columna "Finalizado"
    Entonces la tarjeta "Tarea en curso" debería estar en la columna "Finalizado"
    Y la tarjeta debería tener el estado "Finalizado"

  Escenario: Mover una tarjeta hacia atrás
    Dado el usuario está en la página del tablero Kanban
    Y existe una tarjeta con el título "Tarea finalizada" en la columna "Finalizado"
    Y existe una columna "En Progreso"
    Cuando el usuario arrastra la tarjeta a la columna "En Progreso"
    Entonces la tarjeta "Tarea finalizada" debería estar en la columna "En Progreso"
    Y la tarjeta debería tener el estado "En Progreso"
