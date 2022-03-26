package edu.Madalina;

import java.io.Serializable;

public class Post_televiziune implements Serializable
{
	@Override
	public String toString() {
		return "Post_televiziune [nume=" + nume + ", frecventa=" + frecventa + ", zile_revizie=" + zile_revizie
				+ ", program=" + program + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nume;
	private float frecventa;
	private String zile_revizie;
	private Program_post_televiziune program = new Program_post_televiziune();
	
	public Post_televiziune()
	{
		nume="";
		frecventa=0;
		zile_revizie="";
		program=null;
	}
	
	public Post_televiziune(String nume, float frecventa, String zile_revizie, Program_post_televiziune program)
	{
		this.nume = nume;
		this.frecventa = frecventa;
		this.zile_revizie = zile_revizie;
		this.program = program;
	}
	public void detalii_post()
	{
		program = new Program_post_televiziune();
//		program.program_zile();
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
	
	public  Program_post_televiziune getProgram() {
		return program;
	}
	public void setProgram(Program_post_televiziune program) {
		this.program = program;
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
