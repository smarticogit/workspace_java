package br.com.isidrocorp.acme.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.com.isidrocorp.acme.factory.FabricaDeFuncionario;
import br.com.isidrocorp.acme.root.Funcionario;

public class RepositorioEmArquivo implements FuncionarioRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {
		try {
			ArrayList<Funcionario> lista;
			lista = new ArrayList<Funcionario>();
			FileReader arquivo = new FileReader(new File("./dados.txt"));
			String linha = "";
			BufferedReader br = new BufferedReader(arquivo);
			
			do {
				linha = br.readLine();
				if (linha != null) {
					//System.out.println(linha);
					// uma vez lida a linha, adiciono na lista o objeto a partir do arquivo CSV
					lista.add(FabricaDeFuncionario.createFromCSV(linha));
				}
			} while (linha != null);
			return lista;
		}
		
		catch(IOException ex) {
			System.err.println("Erro a ler arquivo");
			ex.printStackTrace();
			return null;
		}
		catch(RuntimeException ex) {
			throw ex;
		}
	}

}
