/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.editorial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Icons;

/**
 *
 * @author Yesid
 */
public class PanelInformacionEditorial extends JDialog{
    
    private static final int r = 0;
    
    private static final int g = 71;
    
    private static final int b = 178;

    private JLabel lblNombre;
    
    private JLabel txtNombre;
    
    private JButton btnAceptar;
    
    public PanelInformacionEditorial() {
        setTitle("Más información");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel panelSuperior = new JPanel(new GridBagLayout());
        JPanel panelInferior = new JPanel(new GridBagLayout());
        
        lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(new Color(r, g, b));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelSuperior.add(lblNombre,gbc);
        
        txtNombre = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelSuperior.add(txtNombre,gbc);
        
        btnAceptar = new JButton("Aceptar",
            new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_OK)));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelInferior.add(btnAceptar,gbc);
        
        add(panelSuperior,BorderLayout.NORTH);
        add(panelInferior,BorderLayout.SOUTH);    
                
        
        
    }
    
    
    
}
