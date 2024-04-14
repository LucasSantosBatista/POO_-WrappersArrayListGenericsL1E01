/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class ControleProva implements Avaliacao<Prova> {
	private List<Prova> listaProvas;

	public ControleProva() {
		setListaProvas(new ArrayList<>());
	}

	@Override
	public void cadastrarAvaliacao(Prova prova) {
		Random random = new Random();
		double notaAleatoria = random.nextDouble() * 10; // Gerar nota aleatória entre 0.0 e 10.0
		prova.setMediaNotas(notaAleatoria);
		getListaProvas().add(prova);
	}

	@Override
	public Prova consultarAvaliacao(int posicao) {
		return getListaProvas().get(posicao);
	}

	@Override
	public void limparListaAtividades() {
		getListaProvas().clear();
	}

	/**
	 * @return the listaProvas
	 */
	public List<Prova> getListaProvas() {
		return listaProvas;
	}

	/**
	 * @param listaProvas the listaProvas to set
	 */
	public void setListaProvas(List<Prova> listaProvas) {
		this.listaProvas = listaProvas;
	}
}