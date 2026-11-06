# Análisis inicial del comercio

## Alcance y usuarios

El comercio necesita controlar los productos de su catálogo y registrar sus ventas. Quiere saber rápidamente si un producto está disponible antes de operar con él.

| Rol | Acciones |
| --- | --- |
| Dueño | Consulta disponibilidad, da de alta, modifica precio o descripción y da de baja productos. |
| Vendedor | Consulta disponibilidad, da de alta productos y registra ventas. Si se paga con tarjeta, inicia el cobro. |
| Servicio de pagos | Interviene como actor externo para validar y autorizar el pago con tarjeta. |
| Cliente | Participa en el negocio al comprar y aportar su identificación. En el escenario descrito, el vendedor interactúa con el sistema. |

## a. Clases y objetos candidatos

| Candidato del enunciado | Decisión y motivo | Ejemplo de instancia o valor |
| --- | --- | --- |
| Producto | Clase. Tiene código único, descripción y precio vigente. La disponibilidad se determina consultando el estado del producto. | Producto A023, «Cuaderno A5». |
| Venta | Clase. Representa una compra registrada y relaciona la identificación del cliente con los productos comprados. | Venta de los productos A023 y B054. |
| Cliente | Candidato del dominio. El enunciado pide guardar su cédula o RUC en la venta. Se puede representar con un dato de identificación mientras se confirma si existe un registro de clientes. | Identificación de tipo CI o RUC. |
| Dueño y Vendedor | Roles de usuario. Serían valores o roles de Usuario si el sistema mantiene cuentas propias. | Una persona que usa el sistema como Vendedor. |
| Pago con tarjeta | Clase candidata asociada con una venta, con referencia de autorización si se decide conservarla. Es opcional para cada venta. | Pago aprobado con referencia de prueba AUT-01. |
| Tarjeta de crédito | Dato transitorio del cobro. Se usa para pedir la validación y autorización. | Una tarjeta presentada por un cliente. |
| Código, descripción y precio | Atributos de Producto. El código es la identidad. El precio se carga inicialmente con el costo y luego puede actualizarse. | Código A023, precio 80. |
| Disponibilidad | Estado consultado a partir del catálogo. Su significado comercial debe confirmarse. | Disponible, dado de baja o inexistente. |
| Comercio y entrega semanal | Contexto del problema. No se pide registrar sucursales ni entregas en este sistema. | El comercio del enunciado. |

## b. Glosario preliminar

La columna de consulta permite validar los términos con quienes representen al dueño y a los vendedores en clase.

| Término | Significado adoptado para este ejercicio | Consulta para validar |
| --- | --- | --- |
| Código identificador | Código que llega con el producto. Distingue un producto en el catálogo. | ¿Con qué formato llega? ¿Se puede volver a usar después de una baja? |
| Producto disponible | Producto cuyo código está registrado y activo. | ¿También hay que comprobar unidades físicas en stock? |
| Alta | Incorporación de un código nuevo junto con su descripción y su precio inicial. | ¿Qué hace el negocio si ya existe el código, pero fue dado de baja? |
| Baja | Se propone pasar el producto a inactivo y conservar su referencia en ventas anteriores. | ¿Debe poder reactivarse? |
| Precio de costo | Importe que se ingresa como precio inicial del producto. | ¿En qué moneda y con cuántos decimales se trabaja? |
| Precio vigente | Importe que se consulta para la operación actual y puede modificar el dueño. | ¿Se conserva el precio aplicado en cada venta? |
| CI y RUC | Se registra uno de los dos tipos de identificación para el cliente de cada venta. | ¿Qué formato se acepta y en qué casos se pide cada uno? |
| Validación de tarjeta | Comprobación necesaria para que el pago pueda pasar a la autorización. | ¿Qué controles hace el servicio de pagos? |
| Autorización | Confirmación del servicio de pagos para el importe de una venta concreta. | ¿Qué respuesta o referencia debe quedar asociada con la venta? |
| Venta | Operación que guarda el identificador del cliente y los códigos de uno o más productos. | ¿Se venden varias unidades de un mismo código y hay que guardar cantidades? |

## Decisiones de trabajo

1. En el diagrama se usa disponibilidad de catálogo. Se distingue un código inexistente de uno inactivo para que el alta detecte códigos ya usados. No se lleva un conteo de stock.
2. La baja lógica mantiene el historial. Se mantiene la unicidad del código también para productos inactivos hasta acordar una eventual reactivación.
3. Se modela al servicio de pagos como externo. Las fichas dejan a confirmar el proveedor, el formato de los datos y las modalidades de pago sin tarjeta.
4. La asignación de roles se toma como condición previa. El ejercicio no define un mecanismo de inicio de sesión.
