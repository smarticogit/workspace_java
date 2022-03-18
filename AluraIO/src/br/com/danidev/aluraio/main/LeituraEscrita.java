package br.com.danidev.aluraio.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class LeituraEscrita {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in; // new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(entrada);
		BufferedReader buf = new BufferedReader(isr);
		
		OutputStream saida = new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(saida);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = buf.readLine();
		
		while(linha!= null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			System.out.println(linha);		
			linha = buf.readLine();
		}
		
		buf.close();
		bw.close();
	}
}
