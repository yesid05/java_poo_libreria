/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.editorial;

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
public class PanelEditorialBoton extends JPanel implements ActionListener{
    
    private JButton btnAgregar;
    
    private JButton btnEditar;
    
    private JButton btnInformacion;
    
    private JButton btnEliminar;
    
    private JButton btnBuscar;

    public PanelEditorialBoton() {
        setLayout(new GridLayout(1,5,5,5));
        
        btnAgregar=new JButton("Agregar editorial",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_AGREGAR)));
        btnAgregar.addActionListener(this);
        add(btnAgregar);
        
        btnEditar = new JButton("Editar informacion",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_EDITAR)));
        btnEditar.addActionListener(this);
        add(btnEditar);
        
        btnInformacion = new JButton("Más información", 
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_INFORMACION)));
        btnInformacion.addActionListener(this);
        add(btnInformacion);
        
        btnEliminar = new JButton("Eliminar editorial",
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_ELIMINAR)));
        add(btnEliminar);              
        
        btnBuscar = new JButton("Buscar editorial", 
        new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_BUSCAR)));
        add(btnBuscar);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnAgregar) {
            PanelAgregarEditorial panelAgregarEditorial = new PanelAgregarEditorial();
            panelAgregarEditorial.pack();
            panelAgregarEditorial.setResizable(false);
            panelAgregarEditorial.setLocationRelativeTo(this);
            panelAgregarEditorial.setModal(true);
            panelAgregarEditorial.setVisible(true);
        }
        if(e.getSource() == btnEditar){
            PanelEditarEditorial panelEditarEditorial = new PanelEditarEditorial();
            panelEditarEditorial.pack();
            panelEditarEditorial.setResizable(false);
            panelEditarEditorial.setLocationRelativeTo(null);
            panelEditarEditorial.setModal(true);
            panelEditarEditorial.setVisible(true);
        }
        if(e.getSource() == btnInformacion){
            PanelInformacionEditorial panelInformacionEditorial= new PanelInformacionEditorial();
            panelInformacionEditorial.pack();
            panelInformacionEditorial.setResizable(false);
            panelInformacionEditorial.setLocationRelativeTo(null);
            panelInformacionEditorial.setModal(true);
            panelInformacionEditorial.setVisible(true);
        }
    }
    
    
}
