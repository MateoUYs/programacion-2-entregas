package com.cerp.ejemplos;

public class AbstraerNotificaciones {
    private abstract static class Notificador {
        public abstract String enviar(String mensaje);
    }

    private static class Correo extends Notificador {
        @Override
        public String enviar(String mensaje) {
            return "Correo simulado: " + mensaje;
        }
    }

    public static String ejecutar() {
        Notificador notificador = new Correo();
        return notificador.enviar("Hay una actividad nueva.");
    }

    public static void main(String[] args) {
        System.out.println(ejecutar());
    }
}
