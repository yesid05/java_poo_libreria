/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.autor;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Icons;

/**
 *
 * @author yesid caicedo
 */
public class PanelAutorBoton extends JPanel {
    
    private JButton btnAgregar;
    
    private JButton btnEditar;
    
    private JButton btnInformacion;
    
    private JButton btnConsultar;
    
    private JButton btnEliminar;
    
    public PanelAutorBoton() {
        
        setLayout(new GridLayout(1, 5, 5, 5));
        
        btnAgregar = new JButton("Agregar autor",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_AGREGAR)));
        add(btnAgregar);
        
        btnEditar = new JButton("Editar autor",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_EDITAR)));
        add(btnEditar);
        
        btnInformacion = new JButton("Más información",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_INFORMACION)));
        add(btnInformacion);
        
        btnEliminar = new JButton("Eliminar autor",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_ELIMINAR)));
        add(btnEliminar);
        
        btnConsultar = new JButton("Buscar autor",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_BUSCAR)));
        add(btnConsultar);        
        
    }
    
}
