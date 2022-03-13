package parser.Madalina;

import edu.Madalina.*;


import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class SaxParser extends DefaultHandler {
	
	private List<Post_televiziune> postList = null;
	private List<Emisiune> emisiuneList = null;
	private List<Program_post_televiziune> programList = null;
	
    private StringBuilder elementValue = null;
    
    private Post_televiziune post = null;
    private Emisiune emisiune = null;
    private Program_post_televiziune program = null;
    
    public List<Post_televiziune> getPostList()
    {
		return postList;
	}
    public List<Emisiune> getEmisiuneList()
    {
    	return emisiuneList;
	}
    public List<Program_post_televiziune> getProgramList() {
		return programList;
	}
    
    
    boolean bNumePost=false;
    boolean bFrecventa=false;
    boolean bZileRevizie=false;
    boolean bNumarEmisiuni=false;
    boolean bZiSaptamana=false;
    boolean bNumeEmisiune=false;
    boolean bGenEmisiune=false;
    boolean bPublicTinta=false;
    boolean bOraDifuzare=false;
    boolean bDurata=false;
    boolean bTipEmisiune=false;
    
    public void characters(char[] ch, int start, int length) throws SAXException {
       if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    public void startDocument() throws SAXException {
    	post = new Post_televiziune();
    }
    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException
    {
        
    	if (qName.equalsIgnoreCase("post_televiziune")) 
    	{
    		String id = attr.getValue("id");
    		post = new Post_televiziune();
    		post.setId(Integer.parseInt(id));
			// initialize list
			if (postList == null)
				postList = new ArrayList<>();
    	}
    	else if(qName.equalsIgnoreCase("emisiune"))
    	{
    		emisiune = new Emisiune();
			if (emisiuneList == null)
				emisiuneList = new ArrayList<>();
    	}else if(qName.equalsIgnoreCase("program_post_televiziune"))
    	{
    		program = new Program_post_televiziune();
			if (programList == null)
				programList = new ArrayList<>();
    	}else if (qName.equalsIgnoreCase("nume")) {
    		bNumePost = true;
		} else if (qName.equalsIgnoreCase("frecventa")) {
			bFrecventa = true;
		} else if (qName.equalsIgnoreCase("zile_revizie")) {
			bZileRevizie = true;
		} else if (qName.equalsIgnoreCase("numar_emisiuni")) {
			bNumarEmisiuni = true;
		}else if (qName.equalsIgnoreCase("zi_saptamana")) {
			bZiSaptamana = true;
		} else if (qName.equalsIgnoreCase("nume_emisiune")) {
			bNumeEmisiune = true;
		} else if (qName.equalsIgnoreCase("gen_emisiune")) {
			bGenEmisiune = true;
		} else if (qName.equalsIgnoreCase("public_tinta")) {
			bPublicTinta = true;
		} else if (qName.equalsIgnoreCase("ora_difuzare")) {
			bOraDifuzare = true;
		} else if (qName.equalsIgnoreCase("durata")) {
			bDurata = true;
		} else if (qName.equalsIgnoreCase("tip_emisiune")) {
			bTipEmisiune = true;
		}
    	elementValue = new StringBuilder();
    	
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
    	if (bNumePost) {
			post.setNume((elementValue.toString()));
			bNumePost = false;
		} else if (bFrecventa) {
			post.setFrecventa(Float.parseFloat(elementValue.toString()));
			bFrecventa = false;
		} else if (bZileRevizie) {
			post.setZile_revizie(elementValue.toString());
			bZileRevizie = false;
		} else if (bNumarEmisiuni) {
			program.setNumar_emisiuni(Integer.parseInt(elementValue.toString()));
			bNumarEmisiuni = false;
		}else if (bZiSaptamana) {
			program.setZi_saptamana(Integer.parseInt(elementValue.toString()));
			bZiSaptamana = false;
		}else if (bNumeEmisiune) {
			emisiune.setNume_emisiune(elementValue.toString());
			bNumeEmisiune = false;
		}else if (bGenEmisiune) {
			emisiune.setGen_emisiune(elementValue.toString());
			bGenEmisiune = false;
		}else if (bPublicTinta) {
			emisiune.setPublic_tinta(Integer.parseInt(elementValue.toString()));
			bPublicTinta = false;
		}else if (bOraDifuzare) {
			emisiune.setOra_difuzare(elementValue.toString());
			bOraDifuzare = false;
		}else if (bDurata) {
			emisiune.setDurata(Integer.parseInt(elementValue.toString()));
			bDurata = false;
		}else if (bTipEmisiune) {
			emisiune.setTip_emisiune(Boolean.parseBoolean(elementValue.toString()));
    	    bTipEmisiune = false;
    	}
    
    if (qName.equalsIgnoreCase("post_televiziune")) {
		postList.add(post);
	}
    if (qName.equalsIgnoreCase("program_post_televiziune")) {
		programList.add(program);
	}
    if (qName.equalsIgnoreCase("emisiune")) {
		emisiuneList.add(emisiune);
	}
        
    }
	


}
