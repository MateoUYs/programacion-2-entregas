package com.cerp;

import com.cerp.controlador.InicioControlador;
import com.cerp.modelo.CatalogoConceptos;
import com.cerp.vista.ConsolaConceptos;
import com.cerp.vista.InicioVista;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CatalogoConceptos catalogo = new CatalogoConceptos();

        if (args.length > 0 && args[0].equals("--consola")) {
            new ConsolaConceptos(catalogo).mostrar();
            return;
        }

        SwingUtilities.invokeLater(() -> {
            InicioVista vista = new InicioVista(catalogo.getConceptos());
            new InicioControlador(vista, catalogo);
            vista.setVisible(true);
        });
    }
}
