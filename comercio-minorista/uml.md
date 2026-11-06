# De UML Gota a Gota a UML actual

Programación 2 · Teórico 2.2, actividad 1.

## Lectura del prefacio

Fowler presenta el libro como una entrada breve al modelado orientado a objetos. Se concentra en las partes de UML que ayudan a entender y comunicar un diseño. Los ejemplos muestran que se puede elegir el diagrama según lo que se necesita aclarar y según el nivel de detalle que haga falta. La experiencia del autor al aplicar los modelos en proyectos explica su énfasis en el uso práctico de la notación. [Fowler y Scott, UML Gota a Gota, prefacio](https://es.scribd.com/doc/55576119/Uml-Gota-a-Gota-Fowler)

## Cómo llegamos hasta aquí

| Período | Cambio |
| --- | --- |
| Década de 1980 y comienzos de la de 1990 | Se difundieron lenguajes orientados a objetos como Smalltalk y C++. Aparecieron métodos de análisis y diseño con notaciones propias para representar los sistemas. |
| Mediados de los noventa | Booch, Rumbaugh y Jacobson combinaron aportes de sus métodos. Los modelos de objetos y los casos de uso pasaron a formar parte de una notación común. |
| 1997 | OMG adoptó UML 1.1. La estandarización permitió que equipos y herramientas compartieran un vocabulario de modelado. |
| 1999 | Se publicó la edición en español de UML Gota a Gota. Presentaba el lenguaje en el contexto del desarrollo orientado a objetos de ese momento. |
| 2005 | OMG publicó UML 2.0. La evolución de UML amplió la posibilidad de representar estructuras e interacciones complejas. |
| 2015 y 2017 | OMG publicó UML 2.5 y luego UML 2.5.1. La ficha oficial de OMG enumera 2.5.1 como su versión formal más reciente. |
| Actualidad | Es común elaborar modelos en editores gráficos y compartir diagramas junto con la documentación del proyecto. En esta actividad, el archivo editable acompaña al diagrama que se puede abrir desde GitHub. |

La historia previa a UML explica por qué conviven diagramas de naturaleza diferente. Una sola vista del sistema difícilmente responde al mismo tiempo quién lo usa, cómo se organiza la información y en qué orden ocurren las interacciones. [Fowler y Scott, How We Got Here](https://www.oreilly.com/library/view/uml-distilled-a/020165783X/020165783X_ch01lev1sec2.html) · [Historial oficial de versiones de OMG](https://www.omg.org/spec/UML/) · [UML 2.0](https://www.omg.org/spec/UML/2.0/)

## Conceptos de Visual Paradigm

| Concepto | Qué representa | Ejemplo del curso |
| --- | --- | --- |
| Actor y caso de uso | El actor es un rol externo. El caso de uso describe un objetivo que ese rol alcanza con ayuda del sistema. | El Vendedor registra una venta. |
| Límite del sistema | El rectángulo reúne las funciones que son parte del sistema. Los actores quedan afuera. | El servicio de pagos es externo al comercio. |
| Asociación | Vincula a un actor con un caso en el que participa. En un diagrama de clases expresa un vínculo del dominio. | Vendedor y Registrar una venta. En otro diagrama, Libro y Categoría. |
| Inclusión | El caso base incorpora el comportamiento del caso incluido. La flecha sale del base y apunta al incluido. | Registrar una venta incluye Consultar disponibilidad. |
| Extensión | Se agrega comportamiento al caso base cuando se cumple una condición. La flecha sale de la extensión y apunta al caso base. | Pagar con tarjeta de crédito extiende Registrar una venta cuando se elige ese medio. |
| Clase y multiplicidad | La clase representa un conjunto de objetos con rasgos comunes. La multiplicidad expresa cuántas instancias pueden asociarse en cada extremo. | Cada libro se clasifica en una categoría y cada categoría puede agrupar varios libros. |
| Generalización | Una clase especializada puede compartir atributos y relaciones del tipo general. El triángulo apunta al tipo general. | Auto es un Vehículo. |
| Secuencia | Muestra el orden en que los participantes intercambian mensajes en un escenario. | El sistema pide autorización y después recibe el resultado. |

El diagrama de casos de uso muestra el alcance de las funciones. Las fichas permiten conocer el orden de pasos y las alternativas de cada caso. El diagrama conceptual agrega la estructura del dominio. [Guía de casos de uso](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-use-case-diagram/) · [Guía de clases](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-class-diagram/) · [Guía de secuencia](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-sequence-diagram/)

## Para discutir en clase

1. ¿Qué diferencia hay entre la participación del cliente en la compra y la del vendedor como actor en el diagrama?
2. ¿Qué cambia en la ficha de venta si el servicio de pagos no responde?
3. ¿Qué dato adicional se necesita si el comercio quiere controlar unidades en stock?
