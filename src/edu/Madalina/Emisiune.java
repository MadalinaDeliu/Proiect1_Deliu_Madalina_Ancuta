package edu.Madalina;


import genuri.Madalina.*;

public class Emisiune<T>
{
	private String nume;
	private String gen_emisiune;
	private int public_tinta;
	private String ora_difuzare;
	private int durata;
	private boolean tip_emisiune; 
 
	public Emisiune()
	{
		nume="";
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
	public void date_emisiune()
	{
		nume="Romanii au talent";
		gen_emisiune="Cultural";
		public_tinta = 40;
		ora_difuzare = "20:30";
		durata = 3;
		tip_emisiune = false;
		System.out.println(nume);
		System.out.println("Genul emisiunii: " + gen_emisiune);
		System.out.println("Publicul tinta al emisiunii: " + public_tinta);
		System.out.println("Ora de difuzare a emisiunii: " + ora_difuzare);
		System.out.println("Durata emisiunii: " + durata);
		//System.out.println(tip_emisiune);
		tip_emisiune();
	}
 
}
