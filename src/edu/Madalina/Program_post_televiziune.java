package edu.Madalina;
//import java.util.Scanner;
import java.util.*;
public class Program_post_televiziune
{
	private int numar_emisiuni;
	private int zi_saptamana;

	public Program_post_televiziune()
	{
		numar_emisiuni=0;
		zi_saptamana = 1;
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
	public String toString() {
        return "\n PROGRAM\n-----------------\nNumar Emisiuni: "+this.numar_emisiuni+" \nZi Saptamana: " + this.zi_saptamana + "\n";
    }
	

	
}