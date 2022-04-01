package edu.Madalina;

import parser.Madalina.*;

import java.io.FileReader;
import java.io.Serializable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import pattern.Madalina.Singleton;
 
public class Firma_televiziune implements Serializable
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numar_posturi;
	private Vector<Post_televiziune> posturi = new Vector<Post_televiziune>();
	private static Firma_televiziune single_instance=null;
  
	public void read_json()
    {
		Firma_televiziune firma =  Firma_televiziune.getInstance();
        try {
        	JsonReader reader = new JsonReader(new FileReader("Date.json"));
            GsonBuilder builder =  new GsonBuilder();
            Gson gson = builder.create();
            firma = gson.fromJson(reader, Firma_televiziune.class); 
            System.out.println("\nNumarul de posturi furnizate de firma de televiziune: \n" + firma.getNumar_posturi());
            for(Post_televiziune data: firma.posturi)
            {
            	System.out.println("\nNume post de televiziune: "+data.getNume());	
            	System.out.println("Frecventa post de televiziune: "+data.getFrecventa());	
            	System.out.println("Zilele de revizie ale postului de eleviziune: "+data.getZile_revizie());	
            	for(Zi_saptamana data2: data.getZile())
            	{
            	System.out.println("\nProgramul postului de televiziune in ziua "+ data2.getProgram().getId());	
            	System.out.println("\nNumarul de emisiuni "+ data2.getProgram().getNumar_emisiuni()+"\n---------------------");
            	for(Emisiune data3: data2.getProgram().getEmisiuni())
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
	private Firma_televiziune()
	  {
		//read_json();
	  }
	public static Firma_televiziune getInstance() {
        if (single_instance == null) {
        	final Logger logger = Logger.getLogger("Logger");
        	logger.log(Level.INFO, "S-a creat o instanta a firmei de televiziune!");
        	single_instance = new Firma_televiziune();
        }
        return single_instance;
    }
 
	 public Firma_televiziune(int numar_posturi, Vector<Post_televiziune> posturi) {
			super();
			this.numar_posturi = numar_posturi;
			this.posturi = posturi;
		}


	 public int getNumar_posturi() {
		 return numar_posturi;
	 }

	public void setNumar_posturi(int numar_posturi) {
		this.numar_posturi = numar_posturi;
	}
	public Vector<Post_televiziune> getPosturi() {
		return posturi;
	}
	public void setPosturi(Vector<Post_televiziune> posturi) {
		this.posturi = posturi;
	}

}
