package com.cerp.ejemplos;

import java.util.StringJoiner;

public class TocarInstrumentos {
    private interface Instrumento {
        String tocar();
    }

    private static class Guitarra implements Instrumento {
        @Override
        public String tocar() {
            return "Guitarra: tin tin";
        }
    }

    private static class Tambor implements Instrumento {
        @Override
        public String tocar() {
            return "Tambor: pum pum";
        }
    }

    public static String ejecutar() {
        Instrumento[] instrumentos = {new Guitarra(), new Tambor()};
        StringJoiner sonidos = new StringJoiner("\n");
        for (Instrumento instrumento : instrumentos) {
            sonidos.add(instrumento.tocar());
        }
        return sonidos.toString();
    }

    public static void main(String[] args) {
        System.out.println(ejecutar());
    }
}
