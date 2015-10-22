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
import javax.swing.JTextField;
import modelo.Icons;

/**
 *
 * @author Yesid
 */
public class PanelEditarEditorial extends JDialog{
    
    private JLabel lblNombre;
    
    private JTextField txtNombre;
    
    private JButton btnGuardar;
    
    private JButton btnCancelar;

    public PanelEditarEditorial() {
        setLayout(new GridBagLayout());
        setTitle("Editar");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
        
        btnGuardar = new JButton("Guardar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_GUARDAR)));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(btnGuardar,gbc);
        
        btnCancelar = new JButton("Cancelar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_CANCELAR)));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(btnCancelar,gbc);
        
    }
    
    
}
