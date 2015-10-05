/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.editorial;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yesid caicedo
 */
public class PanelEditorialDatos extends JPanel{
    
    private JTable tablaEditorial;
    
    private DefaultTableModel tablaModelo;
    
    private JScrollPane scrollPane;
    
    public PanelEditorialDatos() {
        setLayout(new GridLayout(1,0));
        tablaModelo = new DefaultTableModel(null,new Object[]{"Nombre de la editorial"});
        tablaEditorial = new JTable(tablaModelo);
        tablaModelo = (DefaultTableModel)tablaEditorial.getModel();
        scrollPane = new JScrollPane(tablaEditorial);
        
        add(scrollPane);
    }
    
}
