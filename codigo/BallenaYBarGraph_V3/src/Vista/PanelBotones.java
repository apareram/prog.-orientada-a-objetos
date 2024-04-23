package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotones extends JPanel{

	public JButton botonGrafica;
	public JButton botonNuve;
	
	public PanelBotones() {
		
		this.setLayout(null);
		
		botonGrafica = new JButton("Grafica");
		botonGrafica.setBounds(0, 170, 230, 30);
		this.add(botonGrafica);
		
		botonNuve = new JButton("Nube");
		botonNuve.setBounds(250, 170, 230, 30);
		this.add(botonNuve);
	}
}
