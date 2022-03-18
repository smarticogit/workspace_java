package br.com.danidev.aluraio.main;

import java.io.IOException;
import java.io.PrintWriter;

public class Escrita3 {

	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = new PrintStream("texto2.txt");
		PrintWriter ps = new PrintWriter("texto2.txt", "UTF-8");
		
		ps.println("Usando outra forma, agora com PrintWriter");
		ps.println();
		ps.println("Usamos PrintStrem e é mais simples!");
		
		ps.close();
	}

}
