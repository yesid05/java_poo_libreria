/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Icons;
import vista.autor.PanelAutorBoton;
import vista.autor.PanelAutorDatos;
import vista.editorial.PanelEditorialBoton;
import vista.editorial.PanelEditorialDatos;
import vista.libro.PanelLibroBoton;
import vista.libro.PanelLibroDatos;
import vista.venta.PanelVenta;

/**
 *
 * @author yesid caicedo
 */
public class InterfazLibreria extends JFrame {

    private JTabbedPane panelPestanas;

    private PanelVenta panelVentas;
    
    private PanelLibroDatos panelLibroDatos;
    
    private PanelLibroBoton panelLibroBoton;
    
    private PanelEditorialDatos panelEditorialDatos;
    
    private PanelEditorialBoton panelEditorialBoton;
    
    private PanelAutorDatos panelAutorDatos;
    
    private PanelAutorBoton panelAutorBoton;

    public InterfazLibreria() {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        setSize(700, 700);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getToolkit().getImage(getClass().getResource("/img/icono.png")));
        setLocationRelativeTo(null);
        
        panelVentas = new PanelVenta(); 
        
        /*=======================================
        *Gestion de libros
        =======================================*/
        panelLibroDatos = new PanelLibroDatos();
        panelLibroBoton = new PanelLibroBoton();
        JPanel panelLibro = new JPanel(new GridBagLayout());
        panelLibro.setBorder(BorderFactory.createTitledBorder("Gestion información de los libros"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 10;
        gbc.weighty = 10;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelLibro.add(panelLibroDatos,gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy= 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelLibro.add(panelLibroBoton,gbc);
        /*=======================================
        =======================================*/
        
        /*=======================================
        * Gestion de editoriales
        =======================================*/
        panelEditorialDatos = new PanelEditorialDatos();
        JPanel panelEditorial = new JPanel(new GridBagLayout());
        panelEditorial.setBorder(BorderFactory.createTitledBorder("Gestionar información de las editoriales"));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 10;
        gbc.weighty = 10;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelEditorial.add(panelEditorialDatos,gbc);
        
        panelEditorialBoton = new PanelEditorialBoton();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelEditorial.add(panelEditorialBoton,gbc);
        /*=======================================
        =======================================*/
        
        /*=======================================
        *Gestion de autor
        =======================================*/
        panelAutorDatos = new PanelAutorDatos();
        JPanel panelAutor =new JPanel(new GridBagLayout());
        panelAutor.setBorder(BorderFactory.createTitledBorder("Gestionar información de los autores"));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 10;
        gbc.weighty = 10;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelAutor.add(panelAutorDatos,gbc);
        
        panelAutorBoton = new PanelAutorBoton();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelAutor.add(panelAutorBoton,gbc);
        
        panelPestanas = new JTabbedPane();
        panelPestanas.addTab("Compras",
                new ImageIcon(getToolkit().getImage(getClass().getResource(Icons.TAB_COMPRA))),
                panelVentas,null); 
        panelPestanas.addTab("Libros",
                new ImageIcon(getToolkit().getImage(getClass().getResource(Icons.TAB_LIBRO))), 
                panelLibro,null);
        panelPestanas.addTab("Editorial",
                new ImageIcon(getToolkit().getImage(getClass().getResource(Icons.TAB_EDITORIAL))),
                panelEditorial,null);
        panelPestanas.addTab("Autor", 
                new ImageIcon(getToolkit().getImage(getClass().getResource(Icons.TAB_AUTOR))), 
                panelAutor, null);
        
        add(panelPestanas, BorderLayout.CENTER);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazLibreria win = new InterfazLibreria();
        win.setVisible(true);
//        Scanner teclado = new Scanner(System.in);
//        Libro l = new Libro();
//        l.cambiarNombre("libro");
//        l.cambiarCantidad(3);
//        l.cambiarPrecio(1000);
////        boolean vender = l.vender(2);
//        if (l.darCantidad() < 2) {
//            System.out.println("Libros insuficientes para vender continuar");
//            String val = teclado.next();
//            if (val.equalsIgnoreCase("si")) {
//                if (l.vender(2)) {
//                    System.out.println("vendido libros vendidos: " + l.darLibrosVendidos() + " Cantidad en bodega: " + l.darCantidad());
//                } else {
//                    System.out.println("no se pudo vender");
//                }
//            } else {
//                System.out.println("no vendido");
//            }
//        }
//
//        if (l.vender(3)) {
//            System.out.println("vendido " + l.darLibrosVendidos() + " " + l.darCantidad() + " " + l.darPrecio());
//        }

    }

}
