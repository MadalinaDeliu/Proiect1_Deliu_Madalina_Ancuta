package edu.Madalina;

import java.io.Serializable;
import java.util.Vector;
 
public class Firma_televiziune implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numar_posturi;
	private Vector<Post_televiziune> posturi = new Vector<Post_televiziune>();
  
  public Firma_televiziune()
  {
	  setNumar_posturi(0);
	  posturi = new Vector<Post_televiziune>(numar_posturi);
  }
  public Firma_televiziune(int numar_posturi, Vector<Post_televiziune> posturi)
{
	
	this.numar_posturi = numar_posturi;
	this.posturi = posturi;
}

public int getNumar_posturi() {
		return numar_posturi;
	}

	public void setNumar_posturi(int numar_posturi) {
		this.numar_posturi = numar_posturi;
	}
	public Vector<Post_televiziune> getPosturi() {
		return posturi;
	}
	public void setPosturi(Vector<Post_televiziune> posturi) {
		this.posturi = posturi;
	}
	@Override
	public String toString() {
		return "Firma_televiziune [numar_posturi=" + numar_posturi + ", posturi=" + posturi + "]";
	}


//public int gestiune()
//  {
//	Post_televiziune o = new Post_televiziune();
//	posturi.add(o);
//	o.detalii_post(); 
//	return posturi.get(0).getProgram().getEmisiuni().get(0).getDurata()+posturi.get(0).getProgram().getEmisiuni().get(0).getPublic_tinta();
//  }


}
