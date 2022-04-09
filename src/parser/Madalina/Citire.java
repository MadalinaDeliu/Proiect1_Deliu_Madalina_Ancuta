package parser.Madalina;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import edu.Madalina.Emisiune;
import edu.Madalina.Firma_televiziune;
import edu.Madalina.Post_televiziune;
import edu.Madalina.Zi_saptamana;
import pattern.Madalina.Iterator;



public class Citire{
public void read()
    {
		Firma_televiziune firma =  Firma_televiziune.getInstance();
        try {
        	JsonReader reader = new JsonReader(new FileReader("Date.json"));
            GsonBuilder builder =  new GsonBuilder();
            Gson gson = builder.create();
            firma = gson.fromJson(reader, Firma_televiziune.class); 
            System.out.println("\nNumarul de posturi furnizate de firma de televiziune: \n" + firma.getNumar_posturi());
            for(Post_televiziune data: firma.getPosturi())
            {
            	System.out.println("\nNume post de televiziune: "+data.getNume());	
            	System.out.println("Frecventa post de televiziune: "+data.getFrecventa());	
            	System.out.println("Zilele de revizie ale postului de televiziune: "+data.getZile_revizie());	
            	for(Iterator iter = data.getIterator(); iter.hasNext();)
            	{
            	Zi_saptamana zi = (Zi_saptamana)iter.next();
            	System.out.println("\nProgramul postului de televiziune in ziua "+ zi.getId());
            	System.out.println("\nNumarul de emisiuni "+ zi.getProgram().getNumar_emisiuni()+"\n---------------------");
            	for(Emisiune data3: zi.getProgram().getEmisiuni())
            	{
            			
            		System.out.println("Numele emisiunii: "+ data3.getNume_emisiune());	
                	System.out.println("Genul emisiunii: "+data3.gen_emisiune());	
                	System.out.println("Publicul tinta al emisiunii: "+data3.getPublic_tinta());	
                	System.out.println("Ora de difuzare a emisiunii: "+data3.getOra_difuzare());	
                	System.out.println("Durata emisiunii: "+data3.getDurata());	
                	System.out.println("Tipul emisiunii: "+data3.getTip_emisiune());	
                	
            	}
            	}
            	
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    
    }
}