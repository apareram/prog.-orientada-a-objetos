package projectoFaC.vista;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Vista extends JFrame{
    public PanelIngresa panelIng;
    public PanelResultado panelRes;

    public Vista (){
        // layout
        setLayout(new GridLayout(2,1));
        setTitle("Convertidor de Temperatura");
        setSize(300, 375);
        setLocation(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelIng =  new PanelIngresa();
        this.add(panelIng);
        panelRes =  new PanelResultado();
        this.add(panelRes);
    }
}