package ProvaENEM;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] lista1 = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'E', 'A', 'A'};
		char[] lista2 = {'B', 'B', 'B', 'B', 'E', 'B', 'E', 'B', 'B', 'B'};
		char[] lista3 = {'C', 'C', 'C', 'E', 'E', 'B', 'C', 'B', 'B', 'B'};
		char[] lista4 = {'D', 'E', 'B', 'B', 'B', 'B', 'B', 'D', 'E', 'B'};
		char[] lista5 = {'E', 'A', 'B', 'B', 'B', 'B', 'D', 'E', 'B', 'B'};
		char[] lista6 = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'E', 'A'};
		char[] lista7 = {'C', 'B', 'B', 'C', 'B', 'A', 'B', 'B', 'B', 'E'};
		char[] lista8 = {'E', 'C', 'C', 'A', 'E', 'B', 'A', 'B', 'B', 'B'};
		char[] lista9 = {'E', 'E', 'B', 'B', 'B', 'B', 'B', 'A', 'B', 'B'};
		char[] lista10 = {'E', 'A', 'B', 'B', 'B', 'B', 'D', 'E', 'A', 'B'};
		
		char[] gabaritoBNDES = {'E', 'A', 'B', 'B', 'B', 'B', 'D', 'E', 'B', 'B'};
		
		// criar objetos aluno
		Aluno al1 = new Aluno("Bob", lista1 );
		Aluno al2 = new Aluno("Carlos", lista2 );
		Aluno al3 = new Aluno("Fabio", lista3 );
		Aluno al4 = new Aluno("Felipe", lista4 );
		Aluno al5 = new Aluno("Pedro", lista5 );
		Aluno al6 = new Aluno("Gustavo", lista6 );
		Aluno al7 = new Aluno("Renan", lista7 );
		Aluno al8 = new Aluno("Laura", lista8 );
		Aluno al9 = new Aluno("Yasmin", lista9 );
		Aluno al10 = new Aluno("Pablo", lista10 );
		
		// criar a prova
		Prova p1 = new Prova("BNDES", gabaritoBNDES);
		
		// carregar alunos na prova
		p1.setProvaAluno(al1);
		p1.setProvaAluno(al2);
		p1.setProvaAluno(al3);
		p1.setProvaAluno(al4);
		p1.setProvaAluno(al5);
		p1.setProvaAluno(al6);
		p1.setProvaAluno(al7);
		p1.setProvaAluno(al8);
		p1.setProvaAluno(al9);
		p1.setProvaAluno(al10);
		
		System.out.println("Nome da Prova: " + p1.getNomeProva());
		p1.calculaNotas();
		String[] listaAlunos = p1.mostraAlunos();
		int[] listaNotas = p1.mostraNotas();
		
		for (int i=0; i < listaAlunos.length; i++  ) {
			System.out.print(' ' + listaAlunos[i] + '-');
			System.out.print(' ' + listaNotas[i] + ',');			
		}
		
		System.out.println();
		
//		Aluno al;
//		
//		for (int i=0; i < 5; i++) {
//			al = p1.getProvasAlunos(i);
//			
//			System.out.println();
//			System.out.println(al.getNome());
//			for (int j=0; j < 10; j++) {
//				System.out.print(' '+ String.valueOf(al.getNota(j)) + ',');
//			}
//		}

	}

}
