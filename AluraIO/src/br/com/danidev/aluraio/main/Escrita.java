package br.com.danidev.aluraio.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Escrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream saida = new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(saida);
		BufferedWriter buf = new BufferedWriter(osw);
		
		buf.write("Testando leitura de arquivo através do java!");
		buf.newLine();
		buf.write("Existe mais de uma forma de ler um arquivo.");
		
		buf.close();
	}

}
