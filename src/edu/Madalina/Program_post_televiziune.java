package edu.Madalina;
import java.io.Serializable;
import java.util.*;
public class Program_post_televiziune implements Serializable
{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numar_emisiuni;
	private int zi_saptamana;
	private Vector<Emisiune> emisiuni = new Vector<Emisiune>();

	public Program_post_televiziune()
	{
		numar_emisiuni=0;
		zi_saptamana = 1;
		setEmisiuni(new Vector<Emisiune>(numar_emisiuni));
	}
	
	public Program_post_televiziune(int numar_emisiuni, int zi_saptamana, Vector<Emisiune> emisiuni) {
		
		this.numar_emisiuni = numar_emisiuni;
		this.zi_saptamana = zi_saptamana;
		this.emisiuni = emisiuni;
	}
	

	public void program_zile()
	{
		//Scanner scanner = null;
		//int weekday = scanner.nextInt();

        switch (zi_saptamana) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
   }
        

  }
	public int getZi_saptamana() {
		return zi_saptamana;
	}

	public void setZi_saptamana(int zi_saptamana) {
		this.zi_saptamana = zi_saptamana;
	}
	public int getNumar_emisiuni() {
		return numar_emisiuni;
	}

	public void setNumar_emisiuni(int numar_emisiuni) {
		this.numar_emisiuni = numar_emisiuni;
	}

	public Vector<Emisiune> getEmisiuni() {
		return emisiuni;
	}

	public void setEmisiuni(Vector<Emisiune> emisiuni) {
		this.emisiuni = emisiuni;
	}	
	@Override
	public String toString() {
		return "Program_post_televiziune [numar_emisiuni=" + numar_emisiuni + ", zi_saptamana=" + zi_saptamana
				+ ", emisiuni=" + emisiuni + "]";
	}

}