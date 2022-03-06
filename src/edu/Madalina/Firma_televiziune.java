package edu.Madalina;

public class Firma_televiziune
{
  private int numar_posturi;
  //private Post_televiziune[] posturi=new Post_televiziune[1];
  private Post_televiziune posturi=new Post_televiziune();
  public void gestiune()
  {
	  //for(int i=0; i<1; i++)
	 // {
	  //posturi[i].detalii_post();
		posturi.detalii_post(); 
	 // }
  }
}
