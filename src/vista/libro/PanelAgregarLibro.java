/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.libro;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import com.toedter.calendar.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author yesid caicedo
 */
public class PanelAgregarLibro extends JDialog {

    private JComboBox autor;

    private JComboBox editorial;

    private JDateChooser fecha;

    private JLabel lblNombre;

    private JLabel lblIdioma;

    private JLabel lblCantidad;

    private JLabel lblPrecio;

    private JLabel lblAutor;

    private JLabel lblEditorial;

    private JLabel lblImagen;

    private JLabel lblFecha;

    private JTextField txtNombre;

    private JTextField txtIdioma;

    private JTextField txtCantidad;

    private JTextField txtPrecio;

    private JButton btnExplorar;

    private JButton btnGuardar;

    private JButton btnCancelar;

    public PanelAgregarLibro() {
        setLayout(new BorderLayout(5, 5));
        setResizable(false);

        JPanel panelDatos = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        lblNombre = new JLabel("Nombre del libro:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblNombre, gbc);

        lblIdioma = new JLabel("Idioma del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblIdioma, gbc);

        lblCantidad = new JLabel("Cantidad:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblCantidad, gbc);

        lblPrecio = new JLabel("Precio del libro");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblPrecio, gbc);

        lblAutor = new JLabel("Autor del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblAutor, gbc);

        lblEditorial = new JLabel("Editorial del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblEditorial, gbc);

        lblImagen = new JLabel("Imagen del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblImagen, gbc);

        lblFecha = new JLabel("Fecha de publicación:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblFecha, gbc);

        txtNombre = new JTextField(20);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(txtNombre, gbc);

        txtIdioma = new JTextField(20);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(txtIdioma, gbc);

        txtCantidad = new JTextField(20);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(txtCantidad, gbc);

        txtPrecio = new JTextField(20);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(txtPrecio, gbc);

        autor = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelDatos.add(autor, gbc);

        editorial = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelDatos.add(editorial, gbc);

        btnExplorar = new JButton("Examinar");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelDatos.add(btnExplorar, gbc);

        fecha = new JDateChooser();
        fecha.setIcon(new ImageIcon(getToolkit().getClass().getResource("/img/ic_today_black_24dp_2x.png")));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelDatos.add(fecha, gbc);

        JPanel panelBoton = new JPanel(new GridBagLayout());
        btnGuardar = new JButton("Guardar",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_save_black_24dp_2x.png")));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelBoton.add(btnGuardar, gbc);

        btnCancelar = new JButton("Cancelar",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_cancel_black_24dp_2x.png")));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelBoton.add(btnCancelar, gbc);

        add(panelDatos, BorderLayout.NORTH);
        add(panelBoton, BorderLayout.SOUTH);

    }

}
