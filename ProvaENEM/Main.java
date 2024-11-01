package ProvaENEM;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] lista1 = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] lista2 = {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'};
		char[] lista3 = {'C', 'C', 'C', 'c', 'c', 'B', 'C', 'B', 'B', 'B'};
		char[] lista4 = {'D', 'E', 'B', 'B', 'B', 'B', 'B', 'D', 'B', 'B'};
		char[] lista5 = {'E', 'A', 'B', 'B', 'B', 'B', 'D', 'E', 'B', 'B'};
		
		Aluno al1 = new Aluno("Bob", lista1 );
		Aluno al2 = new Aluno("Carlos", lista2 );
		Aluno al3 = new Aluno("Fabio", lista3 );
		Aluno al4 = new Aluno("Felipe", lista4 );
		Aluno al5 = new Aluno("Pedro", lista5 );
		
		Prova p1 = new Prova("BNDES");
		p1.setProvaAluno(al1);
		p1.setProvaAluno(al2);
		p1.setProvaAluno(al3);
		p1.setProvaAluno(al4);
		p1.setProvaAluno(al5);
		
		
		System.out.println(p1.getNomeProva());
		Aluno al;
		
		for (int i=0; i < 5; i++) {
			al = p1.getProvasAlunos(i);
			
			System.out.println();
			System.out.println(al.getNome());
			for (int j=0; j < 10; j++) {
				System.out.print(' '+ String.valueOf(al.getNota(j)) + ',');
			}
		}

	}

}
