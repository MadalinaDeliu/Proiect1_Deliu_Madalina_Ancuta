package edu.Madalina;

import java.io.Serializable;
import java.util.Vector;

import pattern.Madalina.Container;
import pattern.Madalina.Iterator;

public class Post_televiziune implements Serializable, Container, Durata_medie
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
		zile.setSize(7);
	}
	
	
	public Post_televiziune(String nume, float frecventa, String zile_revizie, Vector<Zi_saptamana> zile) {
		super();
		this.nume = nume;
		this.frecventa = frecventa;
		this.zile_revizie = zile_revizie;
		this.zile = zile;
	}
	

	@Override
	public Iterator getIterator() {
		return new ZiIterator();
	}
	private class ZiIterator implements Iterator {

	      int index;
	      
	      @Override
	      public boolean hasNext() {
	
	         if(index < zile.size()){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {

	         if(this.hasNext()){
	            return zile.get(index++);
	         }
	         return null;
	     }		
	
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

	public float f_durata() {
		float durata_medie=0;
		for(Zi_saptamana data2: zile)
		{
			durata_medie=(durata_medie+data2.f_durata())/7;
		}
		return durata_medie;
	}
	
	
	public void situatie_globala_post() {

		int nr_emisiuni_live=0, nr_em_inreg=0;
		int x=0;
		String gen="";

		for(Zi_saptamana data2: zile)
		{
			nr_emisiuni_live= nr_emisiuni_live + data2.f_numar_emisiuniL();
			nr_em_inreg= nr_em_inreg + data2.f_numar_emisiuniI();
			
			x=data2.f_public();
			
			gen=data2.f_tip();
		}
		System.out.println("------Durata medie a emisiunilor---------\n"+f_durata());
		System.out.println("------Numarul de emisiuni live---------\n"+nr_emisiuni_live);
		System.out.println("------Numarul de emisiuni inregistrate---------\n"+nr_em_inreg);
		System.out.println("------Publicul tinta---------\n"+x);
		System.out.println("------Genul postului---------\n"+gen);
		}

}
