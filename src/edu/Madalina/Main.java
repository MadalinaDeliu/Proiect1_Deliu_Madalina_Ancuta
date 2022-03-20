package edu.Madalina;
import parser.Madalina.*;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class Main {
	public static void main(String[] args)
    {
		Citire_scriere c_s = new Citire_scriere();
        c_s.read_json();
        c_s.write_json();
    }

}
