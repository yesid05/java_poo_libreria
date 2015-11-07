/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.autor;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Icons;

/**
 *
 * @author Yesid
 */
public class PanelEditarAutor extends JDialog{
    
    private JLabel lblNombre;
    
    private JLabel lblApellido;
    
    private JLabel lblNacionalidad;
    
    private JTextField txtNombre;
    
    private JTextField txtApellido;
    
    private JComboBox jcbNacionalidad;
    
    private JButton btnGuardar;
    
    private JButton btnCancelar;

    public PanelEditarAutor() {
        setTitle("Editar Autor");
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        GridBagConstraints gbc = new GridBagConstraints();
        lblNombre = new JLabel("Nombre:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets =  new Insets(5, 5, 5, 5);
        add(lblNombre,gbc);
        
        gbc = new GridBagConstraints();
        lblApellido = new JLabel("Apellido(s):");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(lblApellido,gbc);
        
        gbc = new GridBagConstraints();
        lblNacionalidad = new JLabel("Nacionalidad:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(lblNacionalidad,gbc);
        
        gbc = new GridBagConstraints();
        txtNombre = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(txtNombre,gbc);
        
        gbc = new GridBagConstraints();
        txtApellido = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(txtApellido,gbc);
        
        gbc = new GridBagConstraints();
        jcbNacionalidad = new JComboBox();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(jcbNacionalidad,gbc);
        
        gbc = new GridBagConstraints();
        btnGuardar = new JButton("Guardar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_GUARDAR)));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(btnGuardar,gbc);
        
        gbc = new GridBagConstraints();
        btnCancelar = new JButton("Cancelar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_CANCELAR)));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(btnCancelar,gbc);
    }
    
     
    
}
