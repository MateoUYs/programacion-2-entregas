package com.cerp.controlador;

import com.cerp.modelo.CatalogoConceptos;
import com.cerp.modelo.Concepto;
import com.cerp.vista.InicioVista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class InicioControlador {
    private final InicioVista vista;
    private final CatalogoConceptos catalogo;

    public InicioControlador(InicioVista vista, CatalogoConceptos catalogo) {
        this.vista = vista;
        this.catalogo = catalogo;

        vista.getTemas().addListSelectionListener(evento -> {
            Concepto elegido = vista.getTemas().getSelectedValue();
            if (!evento.getValueIsAdjusting() && elegido != null) {
                vista.mostrarConcepto(elegido, catalogo.tieneEjemploPublicado(elegido));
            }
        });
        vista.getBotonEjemplo().addActionListener(evento -> ejecutarEjemplo());
        vista.getBotonReplit().addActionListener(evento -> abrirReplit());
        vista.getTemas().setSelectedIndex(0);
    }

    private void ejecutarEjemplo() {
        Concepto elegido = vista.getTemas().getSelectedValue();
        if (elegido != null) {
            JOptionPane.showMessageDialog(vista, elegido.ejecutarEjemplo(),
                    "Ejemplo de " + elegido.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void abrirReplit() {
        Concepto elegido = vista.getTemas().getSelectedValue();
        if (elegido == null) {
            return;
        }

        URI enlace = catalogo.getEnlaceReplit(elegido);
        if (!catalogo.tieneEjemploPublicado(elegido)) {
            String instrucciones = "Elegí GitHub en la pantalla de importación.\n"
                    + "Importá el repositorio y ejecutá el proyecto con Run.\n"
                    + "En el menú, elegí " + elegido.getTitulo() + ".";
            if (!catalogo.getRepositorio().isEmpty()) {
                instrucciones += "\n\n" + catalogo.getRepositorio();
            }
            mostrarTexto("Importar en Replit", instrucciones);
        }

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(enlace);
                return;
            } catch (IOException error) {
                mostrarTexto("Copiá este enlace en el navegador", enlace.toString());
                return;
            }
        }
        mostrarTexto("Copiá este enlace en el navegador", enlace.toString());
    }

    private void mostrarTexto(String titulo, String contenido) {
        JTextArea texto = new JTextArea(contenido);
        texto.setEditable(false);
        JOptionPane.showMessageDialog(vista, texto, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
