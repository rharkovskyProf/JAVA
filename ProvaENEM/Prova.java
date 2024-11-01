package ProvaENEM;

public class Prova {
	private String nomeProva;
	private Aluno[] provasAlunos = new Aluno[10];
	private int quantidadeAluno = 0;
	
	public Prova (String nome) {
		this.nomeProva = nome;
		
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public Aluno getProvasAlunos(int i) {
		return provasAlunos[i];
	}

	public void setProvaAluno(Aluno provasAluno) {
		this.provasAlunos[quantidadeAluno] = provasAluno;
		quantidadeAluno++;
	}
}
