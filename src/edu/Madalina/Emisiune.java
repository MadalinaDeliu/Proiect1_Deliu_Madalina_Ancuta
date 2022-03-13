package edu.Madalina;


//import genuri.Madalina.*;

public class Emisiune//<T>
{
	private String nume_emisiune;
	private String gen_emisiune;
	private int public_tinta;
	private String ora_difuzare;
	private int durata;
	private boolean tip_emisiune;
	
	
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
	public boolean isTip_emisiune() {
		return tip_emisiune;
	}
	public void setTip_emisiune(boolean tip_emisiune) {
		this.tip_emisiune = tip_emisiune;
	} 
	public Emisiune()
	{
		nume_emisiune="";
		//Emisiune<Cultural> gen_emisiune = new Emisiune<Cultural>();
		gen_emisiune="";
		public_tinta = 0;
		ora_difuzare = "";
		durata = 0;
		tip_emisiune = false;
	}
	public void tip_emisiune() 
	{
		if(tip_emisiune == false) 
		{
			System.out.println("Emisiunea este Inregistrata");
		}
		else
		{
			System.out.println("Emisiunea este Live");
		}
	}
	public String toString() {
        return " EMISIUNE\n------------\nNume Emisiune: "+this.nume_emisiune +" \nGen Emisiune: " + this.gen_emisiune +
        		"\nPublic tintra: "+ this.public_tinta + "\nOra difuzare: "+ this.ora_difuzare
        		+ "\nDurata: "+ this.durata + "\nTip Emisiune: "+ this.durata;
    }
	
}
