/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Prova {
	private int numeroQuestoes;
	private double mediaNotas;

	public Prova(int numeroQuestoes, double mediaNotas) {
		this.numeroQuestoes = numeroQuestoes;
		this.mediaNotas = mediaNotas;
	}

	// Getters e setters
	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}

	public void setNumeroQuestoes(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}

	public double getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	@Override
	public String toString() {
		return "Prova [numeroQuestoes=" + numeroQuestoes + ", mediaNotas=" + mediaNotas + "]";
	}
}