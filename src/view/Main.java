/**
 * 
 */
package view;

import model.Atividade;
import model.ControleAtividade;
import model.ControleProva;
import model.Prova;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {
		// Testando a classe de controle para as provas
		ControleProva controleProva = new ControleProva();
		controleProva.cadastrarAvaliacao(new Prova(20, 0.0)); // Simulando uma prova com 20 questões
		controleProva.cadastrarAvaliacao(new Prova(30, 0.0)); // Simulando uma prova com 30 questões

		System.out.println("Avaliações (Provas):");
		for (int i = 0; i < controleProva.getListaProvas().size(); i++) {
			System.out.println("Prova " + (i + 1) + ": " + controleProva.consultarAvaliacao(i));
		}
		controleProva.limparListaAtividades();

		// Testando a classe de controle para as atividades
		ControleAtividade controleAtividade = new ControleAtividade();
		controleAtividade.cadastrarAvaliacao(new Atividade("Assunto 1", 5)); // Simulando uma atividade
		controleAtividade.cadastrarAvaliacao(new Atividade("Assunto 2", 8)); // Simulando outra atividade

		System.out.println("\nAvaliações (Atividades):");
		for (int i = 0; i < controleAtividade.getListaAtividades().size(); i++) {
			System.out.println("Atividade " + (i + 1) + ": " + controleAtividade.consultarAvaliacao(i));
		}
		controleAtividade.limparListaAtividades();
	}
}