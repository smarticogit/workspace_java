package br.com.isidrocorp.acme.ui;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.isidrocorp.acme.repo.FuncionarioRepo;
import br.com.isidrocorp.acme.repo.RepositorioEmArquivo;
import br.com.isidrocorp.acme.repo.RepositorioEmMemoria;
import br.com.isidrocorp.acme.root.Funcionario;
import br.com.isidrocorp.exceptions.DadosInvalidosException;
import br.com.isidrocorp.exceptions.EstruturaDeFuncionarioInvalida;
import br.com.isidrocorp.exceptions.TipoFuncionarioInvalidoException;

public class FolhaDePagamento {
	public static void main(String[] args) {

		/* rotina para ler arquivos */
		ArrayList<Funcionario> lista;

		try {
			FuncionarioRepo repo = new RepositorioEmArquivo();
			FuncionarioRepo repo2 = new RepositorioEmMemoria();
						
			lista = repo.lerTudo();
			
			
			System.out.println("---->>>>  Teste 1 - Imprimindo por ordem alfabetica...");
			lista.stream().sorted(Comparator.comparing(f->f.getNome())).forEach(f->{
				System.out.println("|   |----------------------------------------------------|   |");
				System.out.printf("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario());
			});
			
			
			System.out.println("\n\n");
			System.out.println("---->>>>  Teste 2 - Imprimindo por ordem salarial...");
			lista.stream().sorted(Comparator.comparing(f->f.calcularSalario())).forEach(f->{
				System.out.println("|   |----------------------------------------------------|   |");
				System.out.printf("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario());
			});
			
			System.out.println("\n\n");
			System.out.println("---->>>>  Teste 3 - Imprimindo por ordem de numero...");
			lista.stream().sorted(Comparator.reverseOrder())
					      .forEach(f->{
					    	  System.out.println("|   |----------------------------------------------------|   |");
					    	  System.out.printf("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario());
			                });
			//repo.salvarTudo(lista);
			//repo2.salvarTudo(lista);
			
			
		} catch (DadosInvalidosException ex) {
			System.err.println("Dados do cadastro de funcionario Invalido");
		} catch (TipoFuncionarioInvalidoException ex) {
			System.out.println("Não tem regra para est tipo de funcionario");
		} catch (EstruturaDeFuncionarioInvalida ex) {
			System.err.println("Funcionario com estrutura de informação Inválida");
		} catch (Exception ex) {
			System.err.println("Erro desconhecido");
			ex.printStackTrace();
		}
	}
}
