package com.cerp.vista;

import com.cerp.modelo.Concepto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class InicioVista extends JFrame {
    private final JList<Concepto> temas;
    private final JLabel titulo = new JLabel();
    private final JTextArea descripcion = new JTextArea();
    private final JButton botonEjemplo = new JButton("Ejecutar ejemplo");
    private final JButton botonReplit = new JButton("Abrir Replit");

    public InicioVista(List<Concepto> conceptos) {
        super("POOShowcase · Programación 2");
        temas = new JList<>(conceptos.toArray(new Concepto[0]));
        temas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane lista = new JScrollPane(temas);
        lista.setPreferredSize(new Dimension(180, 0));
        lista.setBorder(BorderFactory.createTitledBorder("Temas"));

        titulo.setFont(titulo.getFont().deriveFont(Font.BOLD, 21f));
        descripcion.setEditable(false);
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setFont(descripcion.getFont().deriveFont(15f));
        descripcion.setMargin(new java.awt.Insets(9, 11, 9, 11));

        JPanel acciones = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        acciones.add(botonEjemplo);
        acciones.add(javax.swing.Box.createHorizontalStrut(10));
        acciones.add(botonReplit);

        JPanel detalle = new JPanel(new BorderLayout(0, 11));
        detalle.add(titulo, BorderLayout.NORTH);
        detalle.add(new JScrollPane(descripcion), BorderLayout.CENTER);
        detalle.add(acciones, BorderLayout.SOUTH);

        JPanel contenido = new JPanel(new BorderLayout(16, 0));
        contenido.setBorder(BorderFactory.createEmptyBorder(17, 17, 17, 17));
        contenido.add(lista, BorderLayout.WEST);
        contenido.add(detalle, BorderLayout.CENTER);

        setContentPane(contenido);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(630, 410));
        setSize(850, 510);
        setLocationRelativeTo(null);
    }

    public JList<Concepto> getTemas() {
        return temas;
    }

    public JButton getBotonEjemplo() {
        return botonEjemplo;
    }

    public JButton getBotonReplit() {
        return botonReplit;
    }

    public void mostrarConcepto(Concepto concepto, boolean publicado) {
        titulo.setText(concepto.getTitulo());
        descripcion.setText(concepto.getDescripcion().strip());
        descripcion.setCaretPosition(0);
        botonReplit.setText(publicado ? "Abrir código en Replit" : "Importar en Replit");
    }
}
