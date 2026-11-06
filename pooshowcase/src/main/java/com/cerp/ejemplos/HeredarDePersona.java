package com.cerp.ejemplos;

public class HeredarDePersona {
    private static class Persona {
        private final String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    private static class Estudiante extends Persona {
        private final String curso;

        public Estudiante(String nombre, String curso) {
            super(nombre);
            this.curso = curso;
        }

        public String getCurso() {
            return curso;
        }
    }

    public static String ejecutar() {
        Estudiante estudiante = new Estudiante("Ana", "Programación 2");
        return estudiante.getNombre() + " cursa " + estudiante.getCurso() + ".";
    }

    public static void main(String[] args) {
        System.out.println(ejecutar());
    }
}
