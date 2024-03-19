package projectoFaC.vista;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Vista extends JFrame{
    public Vista (){
        // layout
        setLayout(new GridLayout(2,1));
        setTitle("Convertidor de Temperatura");
        setSize(300, 375);
        setLocation(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelIngresa panel1 =  new PanelIngresa();
        this.add(panel1);
        PanelResultado panel2 =  new PanelResultado();
        this.add(panel2);
    }
}