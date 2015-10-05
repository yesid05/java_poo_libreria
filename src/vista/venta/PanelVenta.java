/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.venta;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author yesid caicedo
 */
public class PanelVenta extends JPanel {

    private PanelDatosLibro panelDatosLibro;

    private PanelBotonesLibro panelBotonesLibro;

    private PanelBotonesCompra panelBotonesCompra;

    private PanelDatosCompra panelDatosCompra;

    public PanelVenta() {
        setLayout(new GridLayout(2, 1));
        GridBagConstraints gbc = new GridBagConstraints();

        panelDatosLibro = new PanelDatosLibro();
        JPanel panelSuperior = new JPanel(new GridBagLayout());
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Libros"));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 10;
        gbc.weighty = 10;
        gbc.gridheight = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets =new Insets(5, 5, 5, 5);
        panelSuperior.add(panelDatosLibro,gbc);
        
        panelBotonesLibro = new PanelBotonesLibro();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;        
        gbc.gridwidth = GridBagConstraints.REMAINDER;        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets =new Insets(5, 5, 5, 5);
        panelSuperior.add(panelBotonesLibro,gbc);
        add(panelSuperior);
        
        JPanel panelInferior = new JPanel(new GridBagLayout());
        panelInferior.setBorder(BorderFactory.createTitledBorder("Compras"));
        panelDatosCompra = new PanelDatosCompra();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 10;
        gbc.weighty = 10;
        gbc.gridheight = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets =new Insets(5, 5, 5, 5);
        panelInferior.add(panelDatosCompra,gbc);
        
        panelBotonesCompra = new PanelBotonesCompra();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill =GridBagConstraints.BOTH;
        gbc.insets =new Insets(5, 5, 5, 5);
        panelInferior.add(panelBotonesCompra,gbc);
        add(panelInferior);
    }

}
