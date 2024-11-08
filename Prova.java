package ProvaENEM;

public class Prova {
	private String nomeProva;
	private Aluno[] provasAlunos = new Aluno[10];
	private int quantidadeAluno = 0; // indexador do vetor provaAlunos
	private char[] gabarito = new char[10];
	
	public Prova (String nome, char[] gab) {
		this.nomeProva = nome;
		this.gabarito = gab;
	}

	public char[] getGabarito() {
		return gabarito;
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
	
	public String[] mostraAlunos() {
		Aluno al;
		String[] alunosCadastrados = new String[10];
		for (int i=0; i < quantidadeAluno; i++  ) {
			al = this.provasAlunos[i];
			alunosCadastrados[i] = al.getNome();
//			System.out.println(alunosCadastrados[i]);
		}
		return alunosCadastrados;
	}
	
	public int[] mostraNotas() {
		Aluno al;
		int[] alunosNotasCadastrados = new int[10];
		for (int i=0; i < quantidadeAluno; i++  ) {
			al = this.provasAlunos[i];
			alunosNotasCadastrados[i] = al.getNota();
//			System.out.println(al.getNota());
		}
		return alunosNotasCadastrados;
	}
	
	public void calculaNotas() {
		Aluno al;
		for (int i=0; i < quantidadeAluno; i++  ) {// varrer o array de alunos
			al = this.provasAlunos[i];
			int notaAluno =0;
			for (int j=0; j < quantidadeAluno; j++  ) { // varrer as notas de cada aluno
				if (al.getRespostas(j)== gabarito[j]) { // checa a questão
					notaAluno++;
				}
			}
			al.setNota(notaAluno);
		}
		
	}
}
