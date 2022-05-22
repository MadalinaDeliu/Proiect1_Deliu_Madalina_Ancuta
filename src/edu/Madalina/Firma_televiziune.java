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

import pattern.Madalina.Iterator;

 
public class Firma_televiziune implements Serializable
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numar_posturi;
	private Vector<Post_televiziune> posturi = new Vector<Post_televiziune>();
	private static Firma_televiziune single_instance=null;
  

        
    

	private Firma_televiziune()
	  {}
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
