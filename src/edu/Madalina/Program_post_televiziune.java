package edu.Madalina;
import java.io.Serializable;
import java.util.*;

import pattern.Madalina.MyObserver;
public class Program_post_televiziune implements Serializable
{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private int numar_emisiuni;
	private Vector<Emisiune> emisiuni = new Vector<Emisiune>();
	
	public Program_post_televiziune() {
		super();
		
	}
	public Program_post_televiziune(int id, int numar_emisiuni, Vector<Emisiune> emisiuni) {
		super();
		this.id=id;
		this.numar_emisiuni = numar_emisiuni;
		this.emisiuni = emisiuni;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void Update(Program_post_televiziune program) 
	{
		
		switch (id) 
        {
            case 1:
                System.out.println("Monday\n");
                program.getEmisiuni();
                break;
            case 2:
                System.out.println("Tuesday\n");
                program.getEmisiuni();
                break;
            case 3:
                System.out.println("Wednesday\n");
                program.getEmisiuni();
                break;
            case 4:
                System.out.println("Thursday\n");
                program.getEmisiuni();
                break;
            case 5:
                System.out.println("Friday\n");
                program.getEmisiuni();
                break;
            case 6:
                System.out.println("Saturday\n");
                program.getEmisiuni();
                break;
            case 7:
                System.out.println("Sunday\n");
                program.getEmisiuni();
                break;
            default:
                System.out.println("Invalid");
                break;
   }
	}
	
	
	
	public void program_zile()
	{
        switch (id) 
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
}