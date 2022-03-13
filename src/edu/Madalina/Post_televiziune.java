package edu.Madalina;

public class Post_televiziune
{
	private int id;
	private String nume;
	private float frecventa;
	private String zile_revizie;
	private Program_post_televiziune program = new Program_post_televiziune();
	
	public Post_televiziune()
	{
		setNume("");
		setFrecventa(0);
		setZile_revizie("");
		program=null;
	}
	public void detalii_post()
	{
		program = new Program_post_televiziune();
//		program.program_zile();
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
	
	public int setId(int parseInt) {
		return id;
		
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
	public String toString() {
        return " \n POST\n--------------\nId="+this.id +" \nNume: " + this.nume +" \nFrecventa: "+ this.frecventa 
        		+ " \nZile revizie: "+ this.zile_revizie;
    }
}
