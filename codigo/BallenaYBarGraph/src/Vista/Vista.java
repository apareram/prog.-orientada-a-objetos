package Vista;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.mfg.exgraf.BarChart_AWT;
import com.mfg.nu.aislada.JPanelDemo;

public class Vista extends JFrame{
	public BarChart_AWT panel1;
	public JPanelDemo panel2;
	public PanelRutas panel3;
	public PanelBotones panel4;

	public Vista() throws IOException {
		//Nuevo tipo de layout, es grid, divide en matrices la pantalla
		setLayout(new GridLayout (2,2));
		setSize(1000,700);
		setLocation(250,250);
		//LLenando las gráficas
		ArrayList<Double> listaHerMain = new ArrayList<Double>();
		listaHerMain.add(3.6);
		listaHerMain.add(6.6);
		listaHerMain.add(7.8);
		listaHerMain.add(6.1);
	    panel1 = new BarChart_AWT("Título de la ventana",listaHerMain); 
	    panel2 = new JPanelDemo(); 
	    panel3 = new PanelRutas();
	    panel4 = new PanelBotones();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cuenta palabras");
		
		this.add(panel3);
		this.add(panel1.createDemoPanel());
		this.add(panel4);
		this.add(panel2);
	}
	public PanelRutas getPanelRutas() {
        return panel3;  // Asume que panel3 es de tipo PanelRutas
    }

    public PanelBotones getPanelBotones() {
        return panel4;  // Asume que panel4 es de tipo PanelBotones
    }
}