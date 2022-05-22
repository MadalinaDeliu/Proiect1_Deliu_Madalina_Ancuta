package edu.Madalina;

import java.io.Serializable;


import genEmisiune.Madalina.*;

public class Emisiune extends AbstractFactory implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nume_emisiune;
	private String gen_emisiune;
	private int public_tinta;
	private String ora_difuzare;
	private int durata;
	private String tip_emisiune;
	
	public Emisiune()
	{
		nume_emisiune="";
		gen_emisiune="";
		public_tinta = 0;
		ora_difuzare = "";
		durata = 0;
		setTip_emisiune("Live");
	}
	
	public Emisiune(String nume_emisiune, String gen_emisiune, int public_tinta, String ora_difuzare, int durata,
			String tip_emisiune) {
		
		this.nume_emisiune = nume_emisiune;
		this.gen_emisiune = gen_emisiune;
		this.public_tinta = public_tinta;
		this.ora_difuzare = ora_difuzare;
		this.durata = durata;
		this.tip_emisiune = tip_emisiune;
	}
	
	public String getNume_emisiune() {
		return nume_emisiune;
	}
	public void setNume_emisiune(String nume) {
		this.nume_emisiune = nume;
	}

	public String getGen_emisiune() {
		return gen_emisiune;
	}
	public void setGen_emisiune(String gen_emisiune) {
		this.gen_emisiune = gen_emisiune;
	}
	public int getPublic_tinta() {
		return public_tinta;
	}
	public void setPublic_tinta(int public_tinta) {
		this.public_tinta = public_tinta;
	}
	public String getOra_difuzare() {
		return ora_difuzare;
	}
	public void setOra_difuzare(String ora_difuzare) {
		this.ora_difuzare = ora_difuzare;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public String getTip_emisiune() {
		return tip_emisiune;
	}
	public void setTip_emisiune(String tip_emisiune) {
		this.tip_emisiune = tip_emisiune;
	}


	@Override
	public GenEmisiune gen_emisiune()
	{    
		String genEmisiune = gen_emisiune;
		
		      if(genEmisiune.equalsIgnoreCase("Divertisment"))
		      {
		          return new Divertisment(); 
		      }else if(genEmisiune.equalsIgnoreCase("Cultural"))
		      {
		          return new Cultural(); 
		      }
		      else if(genEmisiune.equalsIgnoreCase("Actiune"))
		      {
		          return new Actiune(); 
		      }
		return null;
	}
	
}
