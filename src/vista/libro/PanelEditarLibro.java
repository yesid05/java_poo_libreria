/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.libro;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Autor;
import modelo.Editorial;

/**
 *
 * @author yesid caicedo
 */
public class PanelEditarLibro extends JDialog{

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
    
    private JComboBox<Autor> jcbAutor;
    
    private JComboBox<Editorial> jcbEditorial;
    
    private JDateChooser jdcFecha;
    
    private JButton btnExaminar;
    
    private JButton btnCancelar;
    
    private JButton btnGuardar;
    
    public PanelEditarLibro() {
        setLayout(new BorderLayout(5,5));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        JPanel panelDatos = new JPanel(new GridBagLayout());        
        JPanel panelBoton = new JPanel(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        lblNombre = new JLabel("Nombre del libro:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblNombre,gbc);
        
        lblIdioma = new JLabel("Idioma del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblIdioma,gbc);
        
        lblCantidad = new JLabel("Cantidad:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblCantidad,gbc);
        
        lblPrecio = new JLabel("Precio del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblPrecio,gbc);
        
        lblAutor = new JLabel("Autor del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;  
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblAutor,gbc);
        
        lblEditorial = new JLabel("Editorial:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblEditorial,gbc);
        
        lblImagen = new JLabel("Imagen del libro:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblImagen,gbc);
        
        lblFecha = new JLabel("Fecha de publicación:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelDatos.add(lblImagen,gbc);
                
        
        add(panelDatos,BorderLayout.NORTH);
        add(panelBoton,BorderLayout.SOUTH);
    }
    
    
}
