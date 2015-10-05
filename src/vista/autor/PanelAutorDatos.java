/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.autor;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yesid caicedo
 */
public class PanelAutorDatos extends JPanel{
    private JTable tablaAutor;
    
    private DefaultTableModel tablaModelo;
    
    private JScrollPane scrollPane;

    public PanelAutorDatos() {
        setLayout(new GridLayout(1, 0,5,5));
        tablaModelo = new DefaultTableModel(null, new Object[]{"Nombre","Apellido(s)","Nacionalidad"});
        tablaAutor = new JTable(tablaModelo);
        tablaModelo = (DefaultTableModel)tablaAutor.getModel();
        scrollPane =new JScrollPane(tablaAutor);
        add(scrollPane);
    }
    
    
    
}
