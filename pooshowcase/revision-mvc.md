# Revisión de PreguntasDelCursoMVC

Actividad 1 del teórico 1.2, p. 9.

| Parte | Qué observé |
| --- | --- |
| Modelo | Pregunta reúne el enunciado, las opciones y la respuesta correcta. |
| Vista | InicioVista ofrece el ingreso a las pantallas de juego y administración. Las otras vistas presentan las preguntas y los formularios. |
| Controlador | Los controladores escuchan las acciones de la interfaz y coordinan lo que se hace con las preguntas. |
| Persistencia | FileHandler trabaja con el archivo de preguntas que usa el programa. |

En el juego, una acción de la vista llega al controlador, que consulta la información del modelo y actualiza lo que se muestra. En POOShowcase se usa una separación similar. El modelo contiene temas, la vista permite elegir uno y el controlador muestra su explicación o ejecuta el ejemplo elegido.

La variante POOShowcase del curso aún arranca como cuestionario y su archivo de datos apunta a una ruta específica de la computadora de origen. En esta entrega se cambió ese arranque por un catálogo de conceptos y se cargan los enlaces desde un recurso del proyecto. Así el programa puede abrirse desde el IDE, el JAR o la consola con la misma información.

[Proyecto PreguntasDelCursoMVC del curso](https://github.com/Domingo1987/Curso-JAVA/tree/8bbe1b65a7566e01d4d54ba8b8bb5dca6cfa3d18/Proyectos/PreguntasDelCursoMVC)
