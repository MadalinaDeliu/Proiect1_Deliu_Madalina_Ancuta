package pattern.Madalina;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import edu.Madalina.Emisiune;
import edu.Madalina.Firma_televiziune;
import edu.Madalina.Post_televiziune;
import edu.Madalina.Zi_saptamana;

public class Facade 
{
	public void startAplicatie() 
	{
		Firma_televiziune firma =  Firma_televiziune.getInstance();
        try {
        	JsonReader reader = new JsonReader(new FileReader("Date.json"));
            GsonBuilder builder =  new GsonBuilder();
            Gson gson = builder.create();
            firma = gson.fromJson(reader, Firma_televiziune.class); 
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    
        
		for(Post_televiziune data: firma.getPosturi())
        {
			float durata_medie_post=0;
        	for(Zi_saptamana data2 : data.getZile())
        	{
        		
        		System.out.println("-----------------Durata medie emisiuni----------------------");
        		data2.durata_medie_emisiuni();
        		System.out.println("-----------------Numarul de emisiuni Live sau Inregistrate----------------------");
        		data2.numar_emisiuni_live_inregistrate();
        		System.out.println("---------------------Public tinta-------------------");
        		data2.public_tinta();
        		System.out.println("---------------------Genul programului-------------------");
        		data2.tipul_postului();
        		
        	}
        }

	 }
}
