package edu.Madalina;

import java.io.Serializable;
import java.util.Vector;

import pattern.Madalina.Container;
import pattern.Madalina.Iterator;



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

	public void tipul_postului()
	{
		int cont_cult=0, cont_div=0, cont_act=0;
		String gen="";
		switch (id) 
        {
            case 1:
                System.out.println("Luni");
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
       		 System.out.println("In aceasta zi, genul preponderent este: " + gen);
                
                break;
            case 2:
                System.out.println("Marti");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            case 3:
                System.out.println("Miercuri");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            case 4:
                System.out.println("Joi");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            case 5:
                System.out.println("Vineri");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            case 6:
                System.out.println("Sambata");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            case 7:
                System.out.println("Duminica");
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
       		 System.out.println("In acesta zi genul preponderent este: "+gen);
                break;
            default:
                System.out.println("Invalid");
                break;
        	}
		
	}
	
	public void  durata_medie_emisiuni() {
		float durata_medie=0;
		switch (id) 
        {
            case 1:
                System.out.println("Luni");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
            	System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	 
                break;
            case 2:
                System.out.println("Marti");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            case 3:
                System.out.println("Miercuri");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            case 4:
                System.out.println("Joi");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            case 5:
                System.out.println("Vineri");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            case 6:
                System.out.println("Sambata");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();
                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            case 7:
                System.out.println("Duminica");

                for(Emisiune data: program.getEmisiuni())
            	{	
                	 durata_medie = durata_medie + data.getDurata();

                            	
            	}
                durata_medie = durata_medie/program.getNumar_emisiuni();
                System.out.println("Durata medie a emisiunilor: "+ durata_medie +" in ziua "+id);	
                break;
            default:
                System.out.println("Invalid");
                break;
        	}
	}
	
	public void numar_emisiuni_live_inregistrate() {
		int countL = 0, countI = 0;
		switch (id) 
        {
            case 1:
                System.out.println("Luni");
              
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	 
                break;
            case 2:
                System.out.println("Marti");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	
                break;
            case 3:
                System.out.println("Miercuri");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	
                break;
            case 4:
                System.out.println("Joi");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	
                break;
            case 5:
                System.out.println("Vineri");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);		
                break;
            case 6:
                System.out.println("Sambata");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	
                break;
            case 7:
                System.out.println("Duminica");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	 if(data.getTip_emisiune()=="Live")
                	 {
                		 countL++;
                	 }
                	 else
                	 {
                		 countI++;
                	 }
                            	
            	}
                System.out.println("Numarul de emisiuni Live : "+ countL +" in ziua "+id);	
            	System.out.println("Numarul de emisiuni Inregistrate: "+ countI +" in ziua "+id);	
                break;
            default:
                System.out.println("Invalid");
                break;
        	}
	}
	
	public void public_tinta() 
	{
		int arr[] = new int[100];
		int max=0, sol=0;
		switch (id) 
        {
            case 1:
                System.out.println("Luni");
               
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 2:
                System.out.println("Marti");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 3:
                System.out.println("Miercuri");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 4:
                System.out.println("Joi");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 5:
                System.out.println("Vineri");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 6:
                System.out.println("Sambata");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            case 7:
                System.out.println("Duminica");
                for(Emisiune data: program.getEmisiuni())
            	{	
                	
                		 arr[data.getPublic_tinta()]++;
                		 if(arr[data.getPublic_tinta()]>max)
                		 {
                			 max=arr[data.getPublic_tinta()];
                			 sol=data.getPublic_tinta();
                		 }
                		 
            	}
                System.out.println("Publicul tinta este de: "+ sol + " de ani");
                break;
            default:
                System.out.println("Invalid");
                break;
        	}
	}
	public void ora_preponderenta_gen_emisiune() {
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
