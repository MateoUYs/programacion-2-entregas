package com.cerp.vista;

import com.cerp.modelo.CatalogoConceptos;
import com.cerp.modelo.Concepto;

import java.util.List;
import java.util.Scanner;

public class ConsolaConceptos {
    private final CatalogoConceptos catalogo;

    public ConsolaConceptos(CatalogoConceptos catalogo) {
        this.catalogo = catalogo;
    }

    public void mostrar() {
        List<Concepto> conceptos = catalogo.getConceptos();
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("POOShowcase");
            while (true) {
                for (int i = 0; i < conceptos.size(); i++) {
                    System.out.println((i + 1) + ". " + conceptos.get(i).getTitulo());
                }
                System.out.print("Elegí un tema o escribí 0 para salir: ");
                if (!entrada.hasNextLine()) {
                    return;
                }
                String opcion = entrada.nextLine().trim();
                if (opcion.equals("0")) {
                    return;
                }
                try {
                    int indice = Integer.parseInt(opcion) - 1;
                    if (indice < 0 || indice >= conceptos.size()) {
                        System.out.println("Elegí una opción del menú.");
                        continue;
                    }
                    Concepto concepto = conceptos.get(indice);
                    System.out.println("\n" + concepto.getTitulo());
                    System.out.println(concepto.getDescripcion());
                    System.out.println(concepto.ejecutarEjemplo() + "\n");
                } catch (NumberFormatException error) {
                    System.out.println("Ingresá el número de un tema.");
                }
            }
        }
    }
}
