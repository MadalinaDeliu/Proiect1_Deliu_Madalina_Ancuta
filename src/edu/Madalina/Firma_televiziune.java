package edu.Madalina;

import java.util.Vector;
 
public class Firma_televiziune
{
  private int numar_posturi;
  private Vector<Post_televiziune> posturi;
  
  public Firma_televiziune()
  {
	  numar_posturi=0;
	  posturi = new Vector<Post_televiziune>(numar_posturi);
  }

public void gestiune()
  {
	  Post_televiziune o = new Post_televiziune();
	  posturi.add(o);
	  o.detalii_post();  
  }
}
