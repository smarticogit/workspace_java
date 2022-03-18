package br.com.danidev.aluraio.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita2 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		bw.write("Testando leitura de arquivo através do java!");
		bw.newLine();
		bw.newLine();
		bw.write("Segunda linha de texto que sera escrita");
		
//		FileWriter fw = new FileWriter("texto2.txt");
//		fw.write("Testando leitura de arquivo através do java!");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Segunda linha de texto que sera escrita");

		bw.close();
	}

}
