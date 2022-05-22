package gui.Madalina;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities;
import java.awt.Color; 

public class Grafic_Antena1 extends ApplicationFrame {
   
   public Grafic_Antena1( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Ore",            
         "Varsta publicului tinta",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setBackground(Color.WHITE);
      chartPanel.setPreferredSize(new java.awt.Dimension( 760 , 467 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
       
	  final String antena1 = "Antena1"; 
           
      final String ora1 = "08:00";        
      final String ora2 = "12:00";        
      final String ora3 = "14:00";        
      final String ora4 = "15:00";   
      final String ora5 = "17:00";        
      final String ora6 = "18:00";        
      final String ora7 = "19:00";
      final String ora8 = "20:30";
      final String ora9 = "00:00";   
      final String ora10 = "02:30";
      final String ora11 = "04:00";
      final String ora12 = "05:00";
      final String ora13 = "06:00";

      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 43 , antena1 , ora1 );        
      dataset.addValue( 58 , antena1 , ora2 );        
      dataset.addValue( 46 , antena1 , ora3 ); 
      dataset.addValue( 24 , antena1 , ora4 );   
      dataset.addValue( 50 , antena1 , ora5 );        
      dataset.addValue( 63 , antena1 , ora6 );        
      dataset.addValue( 57 , antena1 , ora7 ); 
      dataset.addValue( 25 , antena1 , ora8 );  
      dataset.addValue( 28 , antena1 , ora9 );        
      dataset.addValue( 29 , antena1 , ora10 );        
      dataset.addValue( 19 , antena1 , ora11 ); 
      dataset.addValue( 30 , antena1 , ora12 );   
      dataset.addValue( 29 , antena1 , ora13 );        
   

      return dataset; 
   }
   
   
}