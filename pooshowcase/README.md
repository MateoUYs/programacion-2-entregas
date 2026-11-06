# POOShowcase

Programación 2 · Conceptos fundamentales de POO · Teórico 1.2, p. 9.

POOShowcase permite seleccionar uno de cuatro temas, leer una explicación y ejecutar un ejemplo de Java desde la aplicación. En el modo de consola se pueden revisar los mismos temas, también al importar el proyecto en Replit.

| Tema | Código |
| --- | --- |
| Abstracción | [AbstraerNotificaciones.java](src/main/java/com/cerp/ejemplos/AbstraerNotificaciones.java) |
| Encapsulamiento | [EncapsularSaldo.java](src/main/java/com/cerp/ejemplos/EncapsularSaldo.java) |
| Herencia | [HeredarDePersona.java](src/main/java/com/cerp/ejemplos/HeredarDePersona.java) |
| Polimorfismo | [TocarInstrumentos.java](src/main/java/com/cerp/ejemplos/TocarInstrumentos.java) |

## Ejecutar en la computadora

Se necesita un JDK 17 o posterior. Se puede abrir el proyecto Maven en el IDE y ejecutar `com.cerp.Main`. Desde una terminal con Maven también se puede compilar y abrir la ventana.

```bash
mvn clean package
java -jar target/pooshowcase-1.0.0.jar
```

Para usar el menú de texto se agrega `--consola`. En una terminal con Bash, el script `bash ejecutar-replit.sh` compila y abre directamente ese menú usando el JDK.

## Ejecutar en Replit

1. Abrí el [importador de Replit](https://replit.com/import) e iniciá sesión.
2. Elegí GitHub e importá este repositorio. Para un repositorio privado, Replit solicita acceso a la cuenta con permisos sobre el repositorio.
3. Presioná **Run** y elegí el concepto en el menú. Los ejemplos están en `src/main/java/com/cerp/ejemplos`.

El botón **Importar en Replit** de la ventana abre esa pantalla. Los enlaces directos a proyectos de ejemplo publicados se pueden cargar en [enlaces-replit.properties](src/main/resources/enlaces-replit.properties). Mientras se completan esas URLs, los cuatro ejemplos son ejecutables localmente y el repositorio incluye la configuración de importación. [Guía de importación de Replit](https://docs.replit.com/build/import-from-providers)

## Actividad 1 y base usada

[Revisión de PreguntasDelCursoMVC](revision-mvc.md) · [Preguntas breves de los capítulos de Java](notas-java.md)

Se adaptó la estructura de paquetes y la separación entre modelo, vista y controlador de [la base POOShowcase del curso](https://github.com/Domingo1987/Curso-JAVA/tree/8bbe1b65a7566e01d4d54ba8b8bb5dca6cfa3d18/Proyectos/pooshowcase), que parte de PreguntasDelCursoMVC. El modelo guarda los conceptos, la vista muestra el catálogo y el controlador conecta la selección y los botones con el modelo. Se conserva la [licencia MIT](LICENSE) del material de partida.
