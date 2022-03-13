package edu.Madalina;

import parser.Madalina.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.MemoryHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;




public class Main {

	public static void main(String[] args) 
	{
	    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	    try 
	    {
	        SAXParser saxParser = saxParserFactory.newSAXParser();
	        SaxParser handler = new SaxParser();
	        saxParser.parse(new File("D:\\An2_sem2\\Laborator\\Informatica_Aplicata\\Proiect1_Deliu_Madalina_Ancuta\\Date.xml"), handler);
	        List<Post_televiziune> postList = handler.getPostList();
	        List<Emisiune> emisiuneList = handler.getEmisiuneList();
	        List<Program_post_televiziune> programList = handler.getProgramList();
	        
	        
	        for(Post_televiziune post : postList)
	            System.out.println(post);
	        for(Program_post_televiziune program : programList)
	            System.out.println(program);
	        for(Emisiune emisiune : emisiuneList)
	            System.out.println(emisiune);
	        
	    } 
	    catch (ParserConfigurationException | SAXException | IOException e) 
	        {
	        e.printStackTrace();
	        }
	 }

}
