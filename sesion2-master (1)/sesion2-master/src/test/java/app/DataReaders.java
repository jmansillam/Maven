package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReaders {
	
	public static List<String[]> getCsv(String filename)
	{
		String path = getPath("data\\"+filename);
		List<String[]> data = new ArrayList<String[]>();
		String row;
		try 
		{
			// abrimos y leemos el archivo que viene por parametro
			BufferedReader br = new BufferedReader(new FileReader(path));
			// leemos la data hasta que no sea null o vacio
			// separamos la data por la coma y usando split
			// colocamos linea por linea en array temporal y lo guardamos en la lista
			while((row = br.readLine()) !=null) 
			{
				String[] line = row.split(",");
				data.add(line);
 			}
			br.close();
			
		}catch(IOException e) 
		{
			System.out.println("ERROR: " + e.getMessage());
		}
		return data;
	}
	
	public static String getPath(String filename) 
	{
		File currDir = new File("");
	    String path = currDir.getAbsolutePath() + "\\src\\test\\java\\" + filename;
		return path;
	}
	
	/// sirve solo para imprimir los valores del archivo
	public static void readCsv(String filename) 
	{
		
		String path = getPath("data\\"+filename);
		System.out.println(path);
		List<String[]> records = getCsv(path);
		for(String[] record: records) 
		{
			for(String field: record) 
			{
				System.out.println(field);
			}
		}
		
	}
	

}
