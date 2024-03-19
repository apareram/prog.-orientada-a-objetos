package projectoFaC.vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIngresa extends JPanel{
    public PanelIngresa (){
        this.setLayout(new GridLayout(4,1));
        // agregando las labels
        JLabel e1 = new JLabel("De °C a °F", SwingConstants.CENTER);
        this.add(e1);
        JLabel e2 = new JLabel("Temperatura en Centígrados:", SwingConstants.CENTER);
        this.add(e2);
        // agregando una caja de texto
        JTextField txtField = new JTextField();
        this.add(txtField);
        // agregando un botón
        JButton boton = new JButton("Convertir"); 
        this.add(boton);
    }
}
