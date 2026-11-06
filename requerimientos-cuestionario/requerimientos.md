# Bosquejo de requerimientos

## Alcance

El banco se guarda en una base de datos. El repaso usa una selección aleatoria de las preguntas disponibles. Este bosquejo parte del enunciado de la p. 3 del teórico 1.3 e identifica por separado las decisiones sugeridas por el ensayo de entrevista.

| ID | Requerimiento funcional | Verificación |
| --- | --- | --- |
| RF01 | El creador puede registrar una pregunta con enunciado, opciones y respuesta correcta. | Se guarda una pregunta completa y aparece en el banco. |
| RF02 | El creador puede cambiar los datos de una pregunta existente. | Al abrirla de nuevo se ven los datos corregidos. |
| RF03 | El creador puede eliminar una pregunta del banco. | La pregunta eliminada queda fuera de futuras sesiones. |
| RF04 | El estudiante puede elegir una cantidad y comenzar una sesión con esa cantidad de preguntas al azar. | Con cinco disponibles y una solicitud de tres, recibe tres preguntas distintas del banco. |
| RF05 | El estudiante puede seleccionar una opción por pregunta durante el repaso. | El sistema guarda una opción por cada pregunta que se responde. |
| RF06 | Al finalizar, el estudiante puede ver el resultado de su sesión. | Si acierta dos de tres, se muestra el resultado de dos sobre tres. |

## Datos

- **Pregunta** con identificador, enunciado, opciones y opción correcta.
- **Sesión de repaso** con las preguntas seleccionadas y las respuestas registradas.
- **Resultado** con cantidad de aciertos y cantidad total de preguntas de la sesión.

## Reglas propuestas para validar

| Regla | Verificación |
| --- | --- |
| Se proponen cuatro opciones distintas y exactamente una correcta. | Una pregunta incompleta se rechaza con un mensaje que identifica el dato a corregir. |
| Se proponen cantidades enteras entre 1 y el total disponible. | Si el banco está vacío, se informa. Si la cantidad está fuera del rango, se permite corregirla. |
| Se propone seleccionar sin repetir preguntas dentro de la sesión. | Una selección de todo el banco contiene cada pregunta una vez. |
| La sesión conserva una copia de lo presentado al estudiante. | Una edición o eliminación posterior no cambia la corrección de una sesión ya iniciada. |
| El creador tiene permiso de mantenimiento y el estudiante de práctica. | Un usuario con rol de estudiante no puede modificar el banco. |

## Condiciones de calidad propuestas

- **Persistencia.** Las preguntas se conservan después de cerrar y volver a abrir el sistema.
- **Usabilidad.** Una validación fallida identifica el campo que debe corregirse y conserva los datos ya ingresados.
- **Privacidad.** Se debe acordar quién puede consultar los resultados antes de habilitar su almacenamiento fuera de una sesión.

Queda por confirmar si se quiere elegir temas, retomar una sesión interrumpida, guardar un historial o mostrar la solución después del resultado.
