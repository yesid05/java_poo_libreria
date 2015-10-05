/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.editorial;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Icons;

/**
 *
 * @author yesid caicedo
 */
public class PanelEditorialBoton extends JPanel{
    
    private JButton btnAgregar;
    
    private JButton btnEditar;
    
    private JButton btnInformacion;
    
    private JButton btnEliminar;
    
    private JButton btnBuscar;

    public PanelEditorialBoton() {
        setLayout(new GridLayout(1,5,5,5));
        
        btnAgregar=new JButton("Agregar editorial",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_AGREGAR)));
        add(btnAgregar);
        
        btnEditar = new JButton("Editar informacion",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_EDITAR)));
        add(btnEditar);
        
        btnInformacion = new JButton("Más información", 
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_INFORMACION)));
        add(btnInformacion);
        
        btnEliminar = new JButton("Eliminar editorial",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_ELIMINAR)));
        add(btnEliminar);              
        
        btnBuscar = new JButton("Buscar editorial", 
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_BUSCAR)));
        add(btnBuscar);
        
    }
    
    
}
