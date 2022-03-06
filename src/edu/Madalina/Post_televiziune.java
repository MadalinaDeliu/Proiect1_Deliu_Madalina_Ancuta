package edu.Madalina;

public class Post_televiziune implements Aplicatie
{
	private String nume;
	private float frecventa;
	private String zile_revizie;
	private Program_post_televiziune program;
	
	public Post_televiziune()
	{
		nume = "";
		frecventa = 0;
		zile_revizie = "";
	}
	public void detalii_post()
	{
		program = new Program_post_televiziune();
		program.luni();
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
