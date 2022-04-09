package edu.Madalina;

import java.io.Serializable;


import pattern.Madalina.Container;
import pattern.Madalina.Iterator;
import pattern.Madalina.MyObserver;

public class Zi_saptamana implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Program_post_televiziune program = new Program_post_televiziune();
	
	public Zi_saptamana() {
		super();
	}
	
	public Zi_saptamana(int id, Program_post_televiziune program) {
		super();
		this.id=id;
		this.program = program;
	}

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Program_post_televiziune getProgram() {
		return program;
	}

	public void setProgram(Program_post_televiziune program) {
		this.program = program;
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
