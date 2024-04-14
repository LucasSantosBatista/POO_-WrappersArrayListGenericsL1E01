/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public interface Avaliacao<T> {
	void cadastrarAvaliacao(T atividade);

	T consultarAvaliacao(int posicao);

	void limparListaAtividades();
}
