package gui.Madalina;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class Grafic_KanalD extends ApplicationFrame {
   public Grafic_KanalD( String applicationTitle , String chartTitle ) {
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
      final String kanald = "KanalD";        
         
          
      final String ora1 = "07:00";        
      final String ora2 = "08:00";        
      final String ora3 = "10:00";        
      final String ora4 = "12:00";   
      final String ora5 = "13:00";        
      final String ora6 = "15:00";        
      final String ora7 = "16:00";
      final String ora8 = "18:00";
      final String ora9 = "19:00";   
      final String ora10 = "20:00";
      final String ora11 = "23:00";
      final String ora12 = "00:00";
      final String ora13 = "03:00";
      final String ora14 = "05:00";
      final String ora15 = "06:00";
      
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 60 , kanald , ora1 );        
      dataset.addValue( 68 , kanald , ora2 );        
      dataset.addValue( 40 , kanald , ora3 ); 
      dataset.addValue( 52 , kanald , ora4 );   
      dataset.addValue( 31 , kanald , ora5 );        
      dataset.addValue( 43 , kanald , ora6 );        
      dataset.addValue( 26 , kanald , ora7 ); 
      dataset.addValue( 72 , kanald , ora8 );  
      dataset.addValue( 47 , kanald , ora9 );        
      dataset.addValue( 45 , kanald , ora10 );        
      dataset.addValue( 48 , kanald , ora11 ); 
      dataset.addValue( 34 , kanald , ora12 );   
      dataset.addValue( 29 , kanald , ora13 );        
      dataset.addValue( 51 , kanald , ora14 );        
      dataset.addValue( 62 , kanald , ora15 ); 

      
               

      return dataset; 
   }
   

}