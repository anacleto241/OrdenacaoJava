package ordenacaojava;

import java.io.Serializable;
import java.time.LocalDate;

public class Candidato implements Comparable<Candidato>, Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
        private Integer pontuacao;
	private LocalDate dataAniversario;
	

	public Candidato(int id, String nome, LocalDate dataAniversario, int pontuacao) {
		this.id = id;
		this.nome = nome;
		this.dataAniversario = dataAniversario;
		this.pontuacao = pontuacao;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate aniversario) {
        this.dataAniversario = aniversario;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

	 @Override
    public int compareTo(Candidato outroCandidato) {
        int comparePontuacao = outroCandidato.pontuacao.compareTo(this.pontuacao);
        if (comparePontuacao == 0) {
            return this.dataAniversario.compareTo(outroCandidato.getDataAniversario());
        }
        return comparePontuacao;
    }

        @Override
	public String toString() {
		return "id: " + this.getId() + " Name: " + this.getNome() + " Birth Data: " + this.getDataAniversario() + 
                        " Pontuacao: " + this.getPontuacao();
	}
}