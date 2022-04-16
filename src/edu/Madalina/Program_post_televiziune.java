package edu.Madalina;
import java.io.Serializable;
import java.util.*;

import pattern.Madalina.Container;
import pattern.Madalina.Iterator;

public class Program_post_televiziune implements Serializable
{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int numar_emisiuni;
	private Vector<Emisiune> emisiuni = new Vector<Emisiune>();
	
	public Program_post_televiziune() {
		super();
		
	}
	public Program_post_televiziune(int numar_emisiuni, Vector<Emisiune> emisiuni) {
		super();
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

	

	
}