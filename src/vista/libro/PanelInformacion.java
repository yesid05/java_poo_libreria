/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.libro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Icons;

/**
 *
 * @author yesid caicedo
 */
public class PanelInformacion extends JDialog{
    
    private static final int r = 0;
    
    private static final int g = 71;
    
    private static final int b = 178;
    
    private JLabel lblNombre;
    
    private JLabel lblIdioma;
    
    private JLabel lblCantidad;
    
    private JLabel lblPrecio;
    
    private JLabel lblAutor;
    
    private JLabel lblEditorial;
    
    private JLabel lblImagen;
    
    private JLabel lblFecha;
    
    private JLabel lblNombreDato;
    
    private JLabel lblIdiomaDato;
    
    private JLabel lblCantidadDato;
    
    private JLabel lblPrecioDato;
    
    private JLabel lblAutorDato;
    
    private JLabel lblEditorialDato;
    
    private JLabel lblFechaDato;
    
    private JButton btnAceptar;

    public PanelInformacion() {
        
        setLayout(new BorderLayout());
        
        JPanel panelImagen = new JPanel(new BorderLayout());
        JPanel panelInformacion = new JPanel(new GridBagLayout());
        JPanel panelBoton = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        lblImagen = new JLabel(new ImageIcon(getToolkit().getClass().getResource(Icons.IMG_DAFAULT)));
        panelImagen.add(lblImagen,BorderLayout.CENTER);
        
        lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(new Color(r, g, b));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblNombre,gbc);
        
        lblIdioma = new JLabel("Idioma:");
        lblIdioma.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblIdioma,gbc);
        
        lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblCantidad,gbc);
        
        lblPrecio = new JLabel("Precio:");
        lblPrecio.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblPrecio,gbc);
        
        lblAutor = new JLabel("Autor:");
        lblAutor.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblAutor,gbc);
        
        lblEditorial = new JLabel("Editorial:");
        lblEditorial.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblEditorial,gbc);
        
        lblFecha = new JLabel("Fecha de publicación:");
        lblFecha.setForeground(new Color(r, g, b));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblFecha,gbc);
        
        lblNombreDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblNombreDato,gbc);
        
        lblIdiomaDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblIdiomaDato,gbc);
        
        lblCantidadDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblCantidadDato,gbc);
        
        lblPrecioDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblPrecioDato,gbc);
        
        lblAutorDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblAutorDato,gbc);
        
        lblEditorialDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblEditorialDato,gbc);
        
        lblFechaDato = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInformacion.add(lblFechaDato,gbc);
        
        btnAceptar = new JButton("Aceptar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_OK)));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelBoton.add(btnAceptar,gbc);
        
        add(panelImagen,BorderLayout.NORTH);
        add(panelInformacion,BorderLayout.CENTER);
        add(panelBoton,BorderLayout.SOUTH);
        
    }
    
    
    
}
