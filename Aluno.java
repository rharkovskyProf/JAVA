package ProvaENEM;

public class Aluno {
	private String nome;
	private char[] respostas = new char[10];
	private int nota=0;
	
	public Aluno(String nomeAluno, char[] notasAluno) {
		this.nome =nomeAluno;
		this.respostas = notasAluno;
	}

	public String getNome() {
		return nome;
	}

	public char getRespostas(int i) {
		return respostas[i];
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
