/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.venta;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author yesid caicedo
 */
public class PanelDatosCompra extends JPanel{
    
    private JTable tablaCompra;
    
    private DefaultTableModel tablaModelo;
    
    private JScrollPane scrollPane;

    public PanelDatosCompra() {
        setLayout(new GridLayout(1,0));        
        tablaModelo = new DefaultTableModel(null, new Object[]{"Libro","Nombre del Cliente","Fecha","Cantidad","Total"});
        tablaCompra = new JTable(tablaModelo);
        tablaModelo = (DefaultTableModel)tablaCompra.getModel(); 
        scrollPane = new JScrollPane(tablaCompra);
        
        add(scrollPane);
        
    }
    public void llenarTabla(Libro unLibro,Cliente unCiente,Fecha unaFecha){
        tablaModelo.addRow(new Object[]{unLibro.darNombre(),unCiente.darNombre(),unaFecha.toString()});
    }
    
    public int darFilaSeleccionada(){
        return tablaCompra.getSelectedRow();
    }
    
}
