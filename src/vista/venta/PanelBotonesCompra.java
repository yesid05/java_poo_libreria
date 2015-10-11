/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.venta;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author yesid caicedo
 */
public class PanelBotonesCompra extends JPanel{
    private JButton btnCompra;

    public PanelBotonesCompra() {
        setLayout(new GridLayout(1,0));
        btnCompra =new JButton("compra");
        add(btnCompra);
    }
    
    
}
