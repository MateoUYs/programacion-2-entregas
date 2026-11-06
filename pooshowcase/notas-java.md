# Preguntas breves de los capítulos de Java

## 3.1 · Capítulo 1, p. 48

**¿Qué problema tiene `printVehiculo()` desde la separación en capas?**

La clase Vehiculo pertenece al modelo. Si imprime con `System.out.println`, se ocupa también de la salida de la aplicación. Vehiculo puede devolver sus datos con `toString()`. La vista o el programa principal decide si los presenta en la consola, en una ventana o en otro lugar.

```java
System.out.println(vehiculo.toString());
```

Esa línea se ubica donde se gestiona la presentación.

## 3.5 · Capítulo 3, pp. 4–5

**¿Compila el ejemplo del arreglo y cómo se comporta?**

Con las comillas de Java, el programa compila. Imprime Uno, Dos y Tres. Cuando el índice llega a 3, intenta entrar en una posición que no existe y lanza `ArrayIndexOutOfBoundsException`. Para recorrer el arreglo completo se usa su largo.

```java
for (int i = 0; i < arreglo.length; i++) {
    System.out.println(arreglo[i]);
}
```

## 3.6 · Capítulo 4, pp. 5 y 24

**¿Qué diferencia hay entre un método de instancia y uno static?**

Un método de instancia se ejecuta sobre un objeto y puede acceder a los atributos de esa instancia. Un método `static` pertenece a la clase. Se puede llamar con el nombre de la clase y, para acceder a los datos de instancia, necesita recibir o conseguir un objeto.

**¿Qué hace un productor con la cola llena y un consumidor con la cola vacía?**

El productor espera hasta que haya espacio. El consumidor espera hasta que haya un elemento. Si se usa `wait()`, cada hilo vuelve a comprobar la condición dentro de un `while` al despertar. Un cambio en la cola puede notificar a los hilos que están esperando.
