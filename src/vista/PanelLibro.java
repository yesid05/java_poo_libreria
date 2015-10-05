/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author yesid caicedo
 */
public class PanelLibro extends JPanel{
    private JTable tablaLibros;
    
    private DefaultTableModel  tablaModelo;
    
    private  JScrollPane scrollPane;
    
    public PanelLibro() {       
        setLayout(new FlowLayout());        
        tablaModelo = new DefaultTableModel(null, new Object[]{"Nombre","Editorial","Autor","Precio","Disponible"});
        tablaLibros = new JTable(tablaModelo);
        tablaModelo =(DefaultTableModel)tablaLibros.getModel();
        scrollPane = new JScrollPane(tablaLibros);
        add(scrollPane);        
    }
    
    public void llenarTabla(Libro unLibro,Autor unAutor,Editorial unaEditorial){
        tablaModelo.addRow(new Object[]{unLibro.darNombre(),unaEditorial.darNombre(),unAutor.darNombre(),unLibro.darPrecio(),unLibro.darPrecio()});
    }
    
    public int darFilaSeleccionada(){
        return tablaLibros.getSelectedRow();
    }
    
}
