package edu.Madalina;

import java.io.Serializable;
import java.util.Vector;

import pattern.Madalina.Container;
import pattern.Madalina.Iterator;



public class Zi_saptamana implements Serializable, Aplicatie


{

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


	public String f_tip()
	{
		int cont_cult=0, cont_div=0, cont_act=0;
		String gen="";
		for(Emisiune data: program.getEmisiuni())
    	{	
        	if (data.getGen_emisiune().equals("cultural"))
        		{ 
        		cont_cult++;
        		}
        	else if(data.getGen_emisiune().equals("divertisment"))
        	{
        		cont_div++;
        	}
        	else {
        		   cont_act++;
        	     }
        }
        if(cont_cult>cont_div && cont_cult>cont_act) 
        {
        	gen="cultural";
        }
        else if(cont_div>cont_cult && cont_div>cont_act)
        {
        	gen="divertisment";
        }else if(cont_act>cont_cult && cont_act>cont_div)
        {
        	gen="actiune";
        }

		 return gen;
		}

	
	public void tipul_postului()
	{

		System.out.println("----------Genul postului-----------\n");

		switch (id) 
        {
		
            case 1:

                System.out.println("Luni "+ f_tip());
               
                break;
            case 2:
                System.out.println("Marti "+ f_tip());

                break;
            case 3:
                System.out.println("Miercuri "+ f_tip());

                break;
            case 4:
                System.out.println("Joi "+ f_tip());

                break;
            case 5:
                System.out.println("Vineri "+ f_tip());

                break;
            case 6:
                System.out.println("Sambata "+ f_tip());

                break;
            case 7:
                System.out.println("Duminica "+ f_tip());
                break;
            default:
                System.out.println("Invalid");
                break;}

        }

	public float f_durata()

	{
		float durata_medie=0;
		for(Emisiune data: program.getEmisiuni())
    	{	
        	 durata_medie = durata_medie + data.getDurata();
                    	
    	}
        durata_medie = durata_medie/program.getNumar_emisiuni();

    	return durata_medie;
	}
	
	public void  durata_medie_emisiuni() {
		System.out.println("----------Durata medie a emisiunilor----------\n");
		switch (id) 
        {
            case 1:
                System.out.println("Luni: "+f_durata());
                                 
                break;
            case 2:
                System.out.println("Marti"+f_durata());
                               	
                break;
            case 3:
                System.out.println("Miercuri"+f_durata());
                
                break;
            case 4:
                System.out.println("Joi"+f_durata());
                
                break;
            case 5:
                System.out.println("Vineri"+f_durata());
                
                break;
            case 6:
                System.out.println("Sambata"+f_durata());
                               	
                break;
            case 7:
                System.out.println("Duminica"+f_durata());
                break;
            default:
                System.out.println("Invalid");
                break;
               }
               
	}
	
	

	public int f_numar_emisiuniL() 
	{
		int countL = 0;
		 for(Emisiune data: program.getEmisiuni())
     	{	
         	 if(data.getTip_emisiune().equals("Live"))
         	 {
         		 countL++;
         	 }
                     	
     	}
         return countL;
	}
	public int f_numar_emisiuniI() 
	{
		int countI = 0;
		 for(Emisiune data: program.getEmisiuni())
     	{	
         	 if(data.getTip_emisiune().equals("Inregistrata"))
         	{
         		 countI++;
         	 }
                     	
     	}
         return countI;
     	}

	
	
	public void numar_emisiuni_live_inregistrate() {
		
		switch (id) 
        {
            case 1:
                System.out.println("Luni\n");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 2:
                System.out.println("Marti");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 3:
                System.out.println("Miercuri");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 4:
                System.out.println("Joi");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 5:
                System.out.println("Vineri");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 6:
                System.out.println("Sambata");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    
                break;
            case 7:
                System.out.println("Duminica");
                System.out.println("-------Numarul de emisiuni live--------\n"+ f_numar_emisiuniL());   
                System.out.println("-------Numarul de emisiuni inregistrate--------\n"+ f_numar_emisiuniI());    

            default:
                System.out.println("Invalid");
                break;
        	}
	}
	



	public int f_public()

	{
		int arr[] = new int[100];
		int max=0, sol=0;
		for(Emisiune data: program.getEmisiuni())
    	{	
        	
        		 arr[data.getPublic_tinta()]++;
        		 if(arr[data.getPublic_tinta()]>max)
        		 {
        			 max=arr[data.getPublic_tinta()];
        			 sol=data.getPublic_tinta();
        		 }
        		 
    	}

        return sol;

	}
	
	public void public_tinta() 
	{

		System.out.println("----------Publicul tinta------------");
		switch (id) 
        {
            case 1:
                System.out.println("Luni: "+ f_public());
            
                break;
            case 2:
                System.out.println("Marti "+ f_public());               
 
                break;
            case 3:
                System.out.println("Miercuri "+ f_public());

                break;
            case 4:
                System.out.println("Joi "+ f_public());

                break;
            case 5:
                System.out.println("Vineri "+ f_public());

                break;
            case 6:
                System.out.println("Sambata "+ f_public());

                break;
            case 7:
                System.out.println("Duminica "+ f_public());
            default:
                System.out.println("Invalid");
                break;

        }
	}
}
		
	
	
	
	

