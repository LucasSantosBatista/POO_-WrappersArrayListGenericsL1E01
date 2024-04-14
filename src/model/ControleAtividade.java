/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class ControleAtividade implements Avaliacao<Atividade> {
	private List<Atividade> listaAtividades;

	public ControleAtividade() {
		setListaAtividades(new ArrayList<>());
	}

	@Override
	public void cadastrarAvaliacao(Atividade atividade) {
		getListaAtividades().add(atividade);
	}

	@Override
	public Atividade consultarAvaliacao(int posicao) {
		return getListaAtividades().get(posicao);
	}

	@Override
	public void limparListaAtividades() {
		getListaAtividades().clear();
	}

	/**
	 * @return the listaAtividades
	 */
	public List<Atividade> getListaAtividades() {
		return listaAtividades;
	}

	/**
	 * @param listaAtividades the listaAtividades to set
	 */
	public void setListaAtividades(List<Atividade> listaAtividades) {
		this.listaAtividades = listaAtividades;
	}
}
