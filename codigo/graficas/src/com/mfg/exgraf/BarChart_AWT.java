package com.mfg.exgraf;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarChart_AWT extends ApplicationFrame {
   
	public static ArrayList<Double> listaHer = new ArrayList<Double>(); 
	
   public BarChart_AWT( String applicationTitle, ArrayList<Double> lista  ) {
      super( applicationTitle );        
      this.listaHer = lista;
      JPanel content = createDemoPanel();
      content.setPreferredSize(new java.awt.Dimension(700, 700));
      getContentPane().add(content);  
      
   }
   
   public JPanel createDemoPanel() {
   
	   JFreeChart barChart = ChartFactory.createBarChart(
			   "Título de Gráfica",           
		         "Palabras",            
		         "Número",            
		         createDataset(),          
		         PlotOrientation.VERTICAL,           
		         true, true, false);
		         
		      ChartPanel chartPanel = new ChartPanel( barChart );        
		      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );   
		      return chartPanel;
		      
   }
   
   
   
   private static CategoryDataset createDataset( ) {
      final String numPalabras = "Numero Palabras";        
      ArrayList<String> pruebas = new ArrayList<String>();
      final String speed = "Speed";    
      final String millage = "Millage";     
      final String userrating = "User Rating";        
      final String safety = "safety";
      pruebas.add(speed);
      pruebas.add(millage);
      pruebas.add(userrating);
      pruebas.add(safety);        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( listaHer.get(0)  , numPalabras , pruebas.get(0) );        
      dataset.addValue( listaHer.get(1)  , numPalabras , pruebas.get(1) );        
      dataset.addValue( listaHer.get(2)  , numPalabras , pruebas.get(2)  ); 
      dataset.addValue( listaHer.get(3)  , numPalabras , pruebas.get(3)  );   
     

      return dataset; 
   }
   
}