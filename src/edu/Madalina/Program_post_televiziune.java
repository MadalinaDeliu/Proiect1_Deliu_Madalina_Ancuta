package edu.Madalina;

public class Program_post_televiziune implements Zi_saptamana
{
	private int numar_emisiuni;
	private Emisiune[] emisiuni = new Emisiune[1];
	
	
	public void luni()
	{
		for(int i=0; i<1; i++)
		{
			emisiuni[i]=new Emisiune();
			emisiuni[i].date_emisiune();
		}
	}
	public void marti()
	{
	 
	}
	public void miercuri()
	{
	 
	}
	public void joi()
	{
	 
	}
	public void vineri()
	{
	 
	}
	public void sambata()
	{
	 
	}
	public void duminica()
	{
	 
	}
}
