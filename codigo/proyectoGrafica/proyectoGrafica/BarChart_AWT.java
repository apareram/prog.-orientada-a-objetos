package proyectoGrafica.proyectoGrafica;

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
   
   public static JPanel createDemoPanel() {
   
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
         
      final String speed = "Speed";        
      final String millage = "Millage";        
      final String userrating = "User Rating";        
      final String safety = "safety";        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( listaHer.get(0)  , numPalabras , speed );        
      dataset.addValue( listaHer.get(1)  , numPalabras , userrating );        
      dataset.addValue( listaHer.get(2)  , numPalabras , millage ); 
      dataset.addValue( listaHer.get(3)  , numPalabras , safety );   
     

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
	   
	   ArrayList<Double> listaHerMain = new ArrayList<Double>();
	   listaHerMain.add(3.6);
	   listaHerMain.add(6.6);
	   listaHerMain.add(7.8);
	   listaHerMain.add(6.1);
	   
      BarChart_AWT chart = new BarChart_AWT("Título de la ventana",listaHerMain);        ;
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   } 
}