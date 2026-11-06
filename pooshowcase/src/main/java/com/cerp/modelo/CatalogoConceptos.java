package com.cerp.modelo;

import com.cerp.ejemplos.AbstraerNotificaciones;
import com.cerp.ejemplos.EncapsularSaldo;
import com.cerp.ejemplos.HeredarDePersona;
import com.cerp.ejemplos.TocarInstrumentos;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Properties;

public class CatalogoConceptos {
    private static final URI IMPORTAR_EN_REPLIT = URI.create("https://replit.com/import");

    private final List<Concepto> conceptos = List.of(
        new Concepto("abstraccion", "Abstracción", """
            La abstracción selecciona los datos y las operaciones que importan para una tarea. Para avisar que hay una actividad nueva, el curso necesita poder enviar un mensaje. El código que hace el aviso puede trabajar con esa operación y dejar el envío concreto a cada canal.

            En el ejemplo, Notificador define qué operación tiene que ofrecer un canal. Correo implementa el envío simulado. El programa usa un Notificador y llama a enviar con un mensaje, aunque el objeto concreto es un Correo. Si se agregara otro canal, podría respetar el mismo contrato.

            Probá cambiar el mensaje del ejemplo. El canal recibe otro texto sin cambiar la forma en que el programa le pide enviar la notificación.
            """, AbstraerNotificaciones::ejecutar),
        new Concepto("encapsulamiento", "Encapsulamiento", """
            El encapsulamiento reúne el estado de un objeto con las operaciones que pueden modificarlo. La clase decide qué cambios permite. Por ejemplo, una cuenta puede ofrecer depositar y consultar el saldo, y dejar el atributo saldo como privado.

            En el ejemplo, depositar controla que el importe sea positivo antes de modificar el saldo. Si otra clase pudiera escribir directamente en ese atributo, podría saltarse la regla. El método de consulta devuelve el valor y el depósito mantiene una única forma de cambiarlo.

            La demostración hace un depósito válido y luego intenta uno negativo. El segundo intento se rechaza y el saldo sigue con el valor del primer depósito.
            """, EncapsularSaldo::ejecutar),
        new Concepto("herencia", "Herencia", """
            La herencia expresa una relación entre un tipo más general y otro más específico. Un estudiante es una persona. La clase Persona define el nombre y cómo consultarlo. Estudiante amplía ese modelo con el curso al que asiste.

            En Java, Estudiante usa extends para declarar la relación. Su constructor llama a super para que Persona inicialice el nombre. El método getNombre se aprovecha desde Estudiante sin volver a declarar ese dato. El atributo privado sigue controlado por Persona.

            Al ejecutar el ejemplo se muestra el nombre usando el método heredado y el curso usando un método propio de Estudiante. Agregar otro tipo de persona tendría sentido si comparte ese comportamiento general.
            """, HeredarDePersona::ejecutar),
        new Concepto("polimorfismo", "Polimorfismo", """
            El polimorfismo permite trabajar con objetos de tipos diferentes mediante una operación común. En un ensayo, una guitarra y un tambor pueden tocar. Cada instrumento produce su propio sonido.

            En el ejemplo, Instrumento es una interfaz con el método tocar. Guitarra y Tambor lo implementan. El programa coloca ambos objetos en un arreglo de Instrumento y llama al mismo método para cada uno. Java ejecuta la implementación correspondiente al objeto que hay en esa vuelta.

            Probá invertir el orden de los instrumentos. El recorrido conserva la misma llamada y la salida cambia de orden. Si se agrega un instrumento con otra implementación, el recorrido puede usarlo sin agregar una condición por cada tipo.
            """, TocarInstrumentos::ejecutar)
    );
    private final Properties enlaces = new Properties();

    public CatalogoConceptos() {
        try (InputStream archivo = CatalogoConceptos.class.getResourceAsStream("/enlaces-replit.properties")) {
            if (archivo != null) {
                enlaces.load(archivo);
            }
        } catch (IOException error) {
            throw new IllegalStateException("No se pudieron leer los enlaces de Replit.", error);
        }
    }

    public List<Concepto> getConceptos() {
        return conceptos;
    }

    public String getRepositorio() {
        return enlaces.getProperty("repositorio", "").trim();
    }

    public boolean tieneEjemploPublicado(Concepto concepto) {
        return !enlaces.getProperty(concepto.getClave(), "").isBlank();
    }

    public URI getEnlaceReplit(Concepto concepto) {
        if (tieneEjemploPublicado(concepto)) {
            return URI.create(enlaces.getProperty(concepto.getClave()).trim());
        }
        return IMPORTAR_EN_REPLIT;
    }
}
