package pattern.Madalina;

import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import edu.Madalina.Aplicatie;
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
			System.out.println("=============Situatie globala a postului: "+ data.getNume()+"============\n");
			data.situatie_globala_post();
     	
       }

	 }
}
