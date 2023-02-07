package com.app.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Fileconcepts{

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\AFRATH\\Exceldata for codes\\test.txt");
		
		//FileWriter fw=new FileWriter(f);
		//fw.write("Jainul AFrath");
		//fw.flush();
		
		FileReader fr=new FileReader(f);
		int  i ;
		
		//while((i=fr.read())!=-1){
		//System.out.print((char)i);

		
		//fr.close();
		
		BufferedReader br=new BufferedReader(fr);
		String readLine = br.readLine();
		while (readLine!=null) {
			System.out.println(readLine);
		}
		
		
		
		
		
	}
}
