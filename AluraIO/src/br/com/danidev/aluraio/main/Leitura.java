package br.com.danidev.aluraio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Leitura {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(entrada, "UTF-8");
		BufferedReader buf = new BufferedReader(isr);
		
		String linha = buf.readLine();
		
		while(linha!= null) {
			System.out.println(linha);		
			linha = buf.readLine();
		}
		
		buf.close();
	}

}
