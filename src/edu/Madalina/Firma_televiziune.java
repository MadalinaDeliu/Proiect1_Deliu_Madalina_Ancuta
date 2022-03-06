package edu.Madalina;

public class Firma_televiziune
{
  private int numar_posturi;
  private Post_televiziune[] posturi=new Post_televiziune[1];
  public void gestiune()
  {
	  for(int i=0; i<1; i++)
	 {
	  posturi[i] = new Post_televiziune();
	  posturi[i].detalii_post();
	
	 }
  }
}
