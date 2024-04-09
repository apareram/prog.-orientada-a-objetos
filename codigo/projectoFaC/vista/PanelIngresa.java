package projectoFaC.vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIngresa extends JPanel {
    public JButton boton;
    public JTextField txtField;
    public JLabel e1;
    public JLabel e2;

    public PanelIngresa() {

        this.setLayout(new GridLayout(4, 1));
        // agregando las labels
        e1 = new JLabel("De °C a °F", SwingConstants.CENTER);
        this.add(e1);
        e2 = new JLabel("Temperatura en Centígrados:", SwingConstants.CENTER);
        this.add(e2);
        // agregando una caja de texto
        txtField = new JTextField();
        this.add(txtField);
        // agregando un botón
        boton = new JButton("Convertir");
        this.add(boton);
    }
}