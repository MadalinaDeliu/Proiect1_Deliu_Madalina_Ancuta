package edu.Madalina;

import java.io.Serializable;
import java.util.Vector;

public class Post_televiziune implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nume;
	private float frecventa;
	private String zile_revizie;
	private Vector<Zi_saptamana> zile= new Vector<Zi_saptamana>();
	
	

	public Post_televiziune() {
		super();
		
	}
	
	
	public Post_televiziune(String nume, float frecventa, String zile_revizie, Vector<Zi_saptamana> zile) {
		super();
		this.nume = nume;
		this.frecventa = frecventa;
		this.zile_revizie = zile_revizie;
		this.zile = zile;
	}
	
	
	public String getNume() {
		return nume;
	}



	public void setNume(String nume) {
		this.nume = nume;
	}



	public float getFrecventa() {
		return frecventa;
	}



	public void setFrecventa(float frecventa) {
		this.frecventa = frecventa;
	}



	public String getZile_revizie() {
		return zile_revizie;
	}



	public void setZile_revizie(String zile_revizie) {
		this.zile_revizie = zile_revizie;
	}



	public Vector<Zi_saptamana> getZile() {
		return zile;
	}



	public void setZile(Vector<Zi_saptamana> zile) {
		this.zile = zile;

	}



	public void tipul_postului() {
		
	}
	public void durata_medie_emisiuni() {
		
	}
	public void numar_emisiuni_live_inregistrate() {
		
	}
	public void public_tinta() {
		
	}
	public void ora_preponderenta_gen_emisiune() {
		
	}

}
