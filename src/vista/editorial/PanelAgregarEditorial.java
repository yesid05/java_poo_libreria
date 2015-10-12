/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.editorial;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Icons;

/**
 *
 * @author yesid caicedo
 */
public class PanelAgregarEditorial extends JDialog{
    
    private JLabel lblNombre;
    
    private JTextField txtNombre;
    
    private JButton btnAgregar;
    
    private JButton btnCancelar;

    public PanelAgregarEditorial() {
        
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Agregar editorial");
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        lblNombre = new JLabel("Nombre:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(lblNombre,gbc);
        
        txtNombre = new JTextField(15);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(txtNombre,gbc);
        
        btnAgregar = new JButton("Guardar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_GUARDAR)));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.NONE;
        add(btnAgregar,gbc);
        
        btnCancelar = new JButton("Cancelar", 
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_CANCELAR)));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.NONE;
        add(btnCancelar,gbc);
        
    }
    
    
    
}
