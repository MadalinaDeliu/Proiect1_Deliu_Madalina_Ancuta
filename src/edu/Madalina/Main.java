package edu.Madalina;
import parser.Madalina.*;
import pattern.Madalina.Singleton;

import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

//import org.apache.log4j.Level;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class Main {
	public static void main(String[] args)
    {
		Citire_scriere c_s = new Citire_scriere();
		Singleton singleton = Singleton.getInstance(c_s.read_json());
		System.out.println(singleton.getFirma());
        System.out.println(singleton.getFirma().getPosturi().get(0).getFrecventa());
        final Logger logger = Logger.getLogger("Logger");
        PropertyConfigurator.configure("log4j.properties");
        logger.log(Level.SEVERE, "Log4j error");
        logger.log(Level.WARNING, "Log4j warning");
        logger.log(Level.INFO, "Log4j Info");
        
    }

}
