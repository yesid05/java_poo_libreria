/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.libro;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yesid caicedo
 */
public class PanelLibroDatos extends JPanel{
    
    private static JTable tablaLibro;
    
    private static DefaultTableModel tablaModelo;
    
    private JScrollPane scrollPane;
    
    public PanelLibroDatos() {
        setLayout(new GridLayout(1,0));
        tablaModelo = new DefaultTableModel(null, new Object[]{"Nombre del Libro","Autor","Editorial","Disponible","Imagen","Fecha de publicacion","Idioma","Precio"});
        tablaLibro = new JTable(tablaModelo);
        tablaModelo = (DefaultTableModel)tablaLibro.getModel();
        scrollPane = new JScrollPane(tablaLibro);
        add(scrollPane);
    }
   
}
