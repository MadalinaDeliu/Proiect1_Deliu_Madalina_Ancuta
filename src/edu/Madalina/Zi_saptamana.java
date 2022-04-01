package edu.Madalina;

import java.io.Serializable;

import pattern.Madalina.MyObserver;

public class Zi_saptamana implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Program_post_televiziune program = new Program_post_televiziune();
	
	public Zi_saptamana() {
		super();
	}
	
	public Zi_saptamana(Program_post_televiziune program) {
		super();
		this.program = program;
	}

    

	public Program_post_televiziune getProgram() {
		return program;
	}

	public void setProgram(Program_post_televiziune program) {
		this.program = program;
	}

	

}
