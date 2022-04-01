//package parser.Madalina;
//import edu.Madalina.*;
//
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Writer;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Vector;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.stream.JsonReader;
//
//public class Citire_scriere {
//	public void read_json()
//    {
//		Firma_televiziune firma =  Firma_televiziune.getInstance();
//        try {
//        	JsonReader reader = new JsonReader(new FileReader("Date.json"));
//            GsonBuilder builder =  new GsonBuilder();
//            Gson gson = builder.create();
//            firma = gson.fromJson(reader, Firma_televiziune.class);
//            
//            System.out.println("\nNumarul de posturi furnizate de firma de televiziune: \n" + firma.getNumar_posturi());
//            for(int i=0; i<firma.getNumar_posturi(); i++)
//            {
//            	System.out.println("\n----------Postul "+(i+1)+"---------");
//            	System.out.println("\nNume post de televiziune: "+firma.getPosturi().get(i).getNume());	
//            	System.out.println("Frecventa post de televiziune: "+firma.getPosturi().get(i).getFrecventa());	
//            	System.out.println("Zilele de revizie ale postului de eleviziune: "+firma.getPosturi().get(i).getZile_revizie());	
//            	for(int k=0; k<7; k++)
//            	{
//            	System.out.println("\nProgramul postului de televiziune in ziua "+ firma.getPosturi().get(i).getZile().get(k).getId());	
//            	for(int j=0; j<firma.getPosturi().get(i).getZile().get(k).getProgram().getNumar_emisiuni(); j++)
//            	{
//            		System.out.println("\n----------Emisiunea "+(j+1)+"---------");
//            		System.out.println("Numele emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getNume_emisiune());	
//                	System.out.println("Genul emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getGen_emisiune());	
//                	System.out.println("Publicul tinta al emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getPublic_tinta());	
//                	System.out.println("Ora de difuzare a emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getOra_difuzare());	
//                	System.out.println("Durata emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getDurata());	
//                	System.out.println("Tipul emisiunii: "+firma.getPosturi().get(i).getZile().get(k).getProgram().getEmisiuni().get(j).getTip_emisiune());	
//                	
//            	}
//            	}
//            }
//        }
//        catch(Exception ex){
//            ex.printStackTrace();
//        }
//        
//    
//    }
//}
//	
//
//
