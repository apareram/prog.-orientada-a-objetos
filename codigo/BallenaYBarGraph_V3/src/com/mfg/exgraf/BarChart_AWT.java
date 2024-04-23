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
   
	public static ArrayList<Integer> palabrasCunt = new ArrayList<Integer>(); 
	public static ArrayList<String> palabrasAbuscar = new ArrayList<String>(); 
	
   public BarChart_AWT( String applicationTitle, ArrayList<Integer> palabrasCunt, ArrayList<String> palabrasAbuscar) {
      super( applicationTitle );        
      this.palabrasCunt = palabrasCunt;
      this.palabrasAbuscar = palabrasAbuscar;
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
      
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
      
      for (int i = 0; i < palabrasAbuscar.size(); i++) {
          dataset.addValue(palabrasCunt.get(i), numPalabras, palabrasAbuscar.get(i));
      }
  
      return dataset; 
   }
   
}