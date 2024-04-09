package com.mfg.exgraf;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Vista extends JFrame{
	public BarChart_AWT panel1;
	public BarChart_AWT panel2;
	public BarChart_AWT panel3;
	public BarChart_AWT panel4;

	public Vista() {
		//Nuevo tipo de layout, es grid, divide en matrices la pantalla
		setLayout(new GridLayout (2,2));
		setSize(300,405);
		setLocation(250,250);
		//LLenando las gráficas
		ArrayList<Double> listaHerMain = new ArrayList<Double>();
		listaHerMain.add(3.6);
		listaHerMain.add(6.6);
		listaHerMain.add(7.8);
		listaHerMain.add(6.1);
	    panel1 = new BarChart_AWT("Título de la ventana",listaHerMain); 
	    panel2 = new BarChart_AWT("Título de la ventana",listaHerMain); 
	    panel3 = new BarChart_AWT("Título de la ventana",listaHerMain); 
	    panel4 = new BarChart_AWT("Título de la ventana",listaHerMain); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cuenta palabras");
		
		this.add(panel1.createDemoPanel());
	}

}