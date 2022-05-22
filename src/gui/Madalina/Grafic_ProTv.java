package gui.Madalina;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class Grafic_ProTv extends ApplicationFrame {
   
   public Grafic_ProTv( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Ore",            
         "Varsta publicului tinta",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );   
      chartPanel.setPreferredSize(new java.awt.Dimension( 760 , 467 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String protv = "ProTv";        
            
      final String ora1 = "07:00";        
      final String ora2 = "10:00";        
      final String ora3 = "13:00";        
      final String ora4 = "14:00";   
      final String ora5 = "15:00";        
      final String ora6 = "17:00";        
      final String ora7 = "18:00";
      final String ora8 = "19:00";
      final String ora9 = "20:30";   
      final String ora10 = "23:00";
      final String ora11 = "00:00";
      final String ora12 = "02:00";
      final String ora13 = "03:00";
      final String ora14 = "05:00";
      final String ora15 = "06:00";
      
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 60 , protv , ora1 );        
      dataset.addValue( 45 , protv , ora2 );        
      dataset.addValue( 30 , protv , ora3 ); 
      dataset.addValue( 37 , protv , ora4 );   
      dataset.addValue( 50 , protv , ora5 );        
      dataset.addValue( 37 , protv , ora6 );        
      dataset.addValue( 43 , protv , ora7 ); 
      dataset.addValue( 68 , protv , ora8 );  
      dataset.addValue( 52 , protv , ora9 );        
      dataset.addValue( 26 , protv , ora10 );        
      dataset.addValue( 29 , protv , ora11 ); 
      dataset.addValue( 19 , protv , ora12 );   
      dataset.addValue( 21 , protv , ora13 );        
      dataset.addValue( 48 , protv , ora14 );        
      dataset.addValue( 62 , protv , ora15 ); 

      
               

      return dataset; 
   }
   

}