package com.micro.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Procesar {

	public static void main(String[] args) {
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		String path = "C:\\Users\\Omar\\Desktop\\ciudades.txt";
		
		File file = new File(path);
		
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				//System.out.println(scanner.nextLine());
				String linea = scanner.nextLine();
				
				StringTokenizer atributo = new StringTokenizer(linea, "|");
				Ciudad ciudad = new Ciudad();
				
				while (atributo.hasMoreElements()) {
					ciudad.setClave(atributo.nextElement().toString());
					ciudad.setDescripcion(atributo.nextElement().toString());
					
					}
				ciudades.add(ciudad);
				
			}
			scanner.close();
			ciudades.forEach(
					c->System.out.println(c)
					);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
