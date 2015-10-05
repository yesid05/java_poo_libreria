/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.libro;

import java.awt.GridLayout;
import java.awt.Image;
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
public class PanelLibroBoton extends JPanel implements ActionListener {

    private JButton btnAgregar;

    private JButton btnEditar;

    private JButton btnVer;

    private JButton btnEliminar;

    private JButton btnBuscar;

    public PanelLibroBoton() {
        setLayout(new GridLayout(1, 5, 5, 5));

        btnAgregar = new JButton("Agregar libro",
                new ImageIcon(getToolkit().getClass().getResource(Icons.BTN_AGREGAR)));
        btnAgregar.addActionListener(this);
        add(btnAgregar);

        btnEditar = new JButton("Editar Libro",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_edit_black_24dp_2x.png")));
        add(btnEditar);

        btnVer = new JButton("Mas información",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_info_black_24dp_2x.png")));
        add(btnVer);

        btnEliminar = new JButton("Eliminar Libro",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_delete_black_24dp_2x.png")));
        add(btnEliminar);

        btnBuscar = new JButton("Buscar Libro",
                new ImageIcon(getToolkit().getClass().getResource("/img/ic_find_in_page_black_24dp_2x.png")));
        add(btnBuscar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            PanelAgregarLibro a = new PanelAgregarLibro();
            a.pack();
            a.setModal(true);
            a.setLocationRelativeTo(this);
            a.setVisible(true);

        }
    }

}
