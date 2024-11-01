package ProvaENEM;

public class Aluno {
	private String nome;
	private char[] notas = new char[10];
	
	public Aluno(String nomeAluno, char[] notasAluno) {
		this.nome =nomeAluno;
		this.notas = notasAluno;
	}

	public String getNome() {
		return nome;
	}

	public char getNota(int i) {
		return notas[i];
	}
}
