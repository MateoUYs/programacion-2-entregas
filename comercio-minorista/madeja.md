# La ingeniería de requisitos en la Junta de Andalucía

La actividad enlaza al subsistema de ingeniería de requisitos de MADEJA y a un recurso de plantillas. Los enlaces cortos redirigían a las direcciones históricas, que no se pudieron cargar al hacer la revisión. Para reconstruir la actividad se usaron el material histórico del marco y las guías y plantillas publicadas por la Junta en su Portal del Conocimiento. [Subsistema enlazado](https://www.juntadeandalucia.es/servicios/madeja/contenido/subsistemas/ingenieria/ingenieria-requisitos) · [Recurso de plantillas enlazado](https://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/515)

## Elementos principales del marco

| Elemento | Para qué sirve |
| --- | --- |
| Procedimientos y roles | Orientan el trabajo desde la identificación de necesidades hasta la gestión de cambios. Indican quién prepara y quién revisa la documentación. |
| Especificación y catálogo | Registran requisitos con un identificador, una descripción y el contexto suficiente para discutirlos y verificarlos. |
| Análisis y casos de uso | Describen la interacción con el sistema y permiten relacionar cada caso con los requisitos que cubre. |
| Validación y trazabilidad | Permiten comprobar el acuerdo con las personas usuarias y seguir qué análisis, diseño o pruebas se deben actualizar cuando cambia un requisito. |
| Recursos de apoyo | Incluyen guías, técnicas de relevamiento y validación, plantillas y apoyo para herramientas de documentación y modelado. |

El marco distingue procedimientos generales, orientaciones de análisis y recursos que ayudan a llevarlos a la práctica. Entre ellos aparecen la especificación de requisitos del sistema, la guía para redactar casos de uso y el apoyo para Enterprise Architect. [Ficha oficial de MADEJA](https://www.juntadeandalucia.es/servicios/publicaciones/detalle/76728.html) · [Material histórico del subsistema](https://es.scribd.com/document/661041963/marco-de-desarrollo-de-la-junta-de-andalucia-ingenieria-2012-11-19)

## Qué se encontró en la documentación

- La **guía del catálogo de requisitos** define cómo organizar las necesidades del sistema y relaciona su elaboración con las sesiones de trabajo con usuarios. Distingue quién elabora el catálogo y quién lo aprueba. [Guía oficial del catálogo](https://www.juntadeandalucia.es/medioambiente/portal/documents/13391456/30432350/Catalogo%2Bde%2BRequisitos%2B%28Gu%C3%ADa%29.pdf/eef32e15-28f7-6f42-134f-d552e14f5be0?t=1639731408484)
- La **guía de casos de uso** explica cómo presentar el alcance con un diagrama, agrupar casos y relacionar cada ficha con requisitos del catálogo. Los flujos de una ficha permiten revisar la respuesta ante situaciones normales y excepcionales. [Guía oficial de casos de uso](https://www.juntadeandalucia.es/medioambiente/portal/documents/13391456/51776828/Casos%2Bde%2BUso%2B%28Gu%C3%ADa%29.pdf/f614b61c-f05f-6204-d108-fe0f8cf60aa7?t=1658484042360)
- El **Portal del Conocimiento** ofrece plantillas editables. Sirven como punto de partida para mantener una estructura y pasar la documentación a otra persona del equipo. [Plantillas oficiales](https://www.juntadeandalucia.es/medioambiente/portal/web/portal-conocimiento/plantillas-2)

## Ejemplo aplicado al comercio

| Elemento | Aplicación |
| --- | --- |
| Requisito COM-RF05 | El vendedor registra la identificación del cliente y los códigos de los productos comprados. |
| Caso de uso que lo detalla | UC05, Registrar una venta. |
| Requisitos relacionados | Comprobación de disponibilidad antes de la operación y autorización si el pago es con tarjeta de crédito. |
| Comprobación | Con dos códigos disponibles y una CI informada se puede registrar la venta. Con un código inactivo se exige corregir la selección. |

Esta forma de documentar me permite ver qué hay que revisar si cambia una regla. Por ejemplo, si «disponible» pasa a depender del stock, hay que revisar el glosario, UC01, las operaciones que lo incluyen y sus comprobaciones. Para un trabajo de clase alcanza con usar las fichas y un identificador por requisito. Lo importante es mantener visible el vínculo entre lo pedido y lo que se comprueba.
