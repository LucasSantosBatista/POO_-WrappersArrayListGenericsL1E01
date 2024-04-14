/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Atividade {
	private String assunto;
	private int paginasDissertacao;

	public Atividade(String assunto, int paginasDissertacao) {
		this.assunto = assunto;
		this.paginasDissertacao = paginasDissertacao;
	}

	// Getters e setters
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getPaginasDissertacao() {
		return paginasDissertacao;
	}

	public void setPaginasDissertacao(int paginasDissertacao) {
		this.paginasDissertacao = paginasDissertacao;
	}

	@Override
	public String toString() {
		return "Atividade [assunto=" + assunto + ", paginasDissertacao=" + paginasDissertacao + "]";
	}
}
