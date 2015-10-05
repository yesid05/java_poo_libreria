/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.venta;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Icons;

/**
 *
 * @author yesid caicedo
 */
public class PanelBotonesLibro extends JPanel implements ActionListener {
    
    private JButton btnVender;
    
    private JButton btnVer;
    
    public PanelBotonesLibro() {
        setLayout(new GridLayout(1, 2, 5, 5));
        btnVender = new JButton("Vender",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_AGREGAR_COMPRA)));
        btnVender.addActionListener(this);
        add(btnVender);
        
        btnVer = new JButton("Ver",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_INFORMACION)));
        btnVer.addActionListener(this);
        add(btnVer);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
