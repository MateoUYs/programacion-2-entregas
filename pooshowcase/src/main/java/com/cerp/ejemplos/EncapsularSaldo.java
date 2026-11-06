package com.cerp.ejemplos;

public class EncapsularSaldo {
    private static class Cuenta {
        private int saldo;

        public void depositar(int importe) {
            if (importe <= 0) {
                throw new IllegalArgumentException("El depósito debe ser positivo.");
            }
            saldo += importe;
        }

        public int getSaldo() {
            return saldo;
        }
    }

    public static String ejecutar() {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(100);
        try {
            cuenta.depositar(-20);
        } catch (IllegalArgumentException error) {
            return error.getMessage() + "\nSaldo final: " + cuenta.getSaldo();
        }
        return "Saldo final: " + cuenta.getSaldo();
    }

    public static void main(String[] args) {
        System.out.println(ejecutar());
    }
}
