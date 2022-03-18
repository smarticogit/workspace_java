package br.com.danidev.aluraio.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//Criando arquivo bin...
		
//		String nome = "Daniel Silveira";
//		ObjectOutputStream dados = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		dados.writeObject(nome);
//		dados.close();
		
		// Lendo arquivo criado...
		// Ao criar arquivo com um objeto, devemos implementar a classe Serializable;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
	}
}
