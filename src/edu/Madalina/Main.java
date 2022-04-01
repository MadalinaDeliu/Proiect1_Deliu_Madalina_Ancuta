package edu.Madalina;
import parser.Madalina.*;
import pattern.Madalina.Singleton;

import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class Main {
	public static void main(String[] args)
    {
		Firma_televiziune firma = Firma_televiziune.getInstance();
		firma.read_json();
    }
}
