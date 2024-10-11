package br.senac.rj;

import java.util.Scanner;

public class RodadasCores {
	
	final private int VERMELHO = 100;
	final private int VERDE = 10;
	final private int AZUL = 1;
	
	private int corR = 0; 

	public RodadasCores (boolean R, boolean G, boolean B) {
		if (R) {
			corR = corR + VERMELHO;
		}
		if (G) {
			corR = corR + VERDE;
		}
		if (B) {
			corR = corR + AZUL;
		}
			
	}
	
	public void CorResultante() {
		switch (corR) {
		case 0:
			System.out.println("Cor escolhida foi PRETO");
			return;
		case 1:
			System.out.println("Cor escolhida foi AZUL");
			return;
		case 10:
			System.out.println("Cor escolhida foi VERDE");
			return;
		case 11:
			System.out.println("Cor escolhida foi CYAN");
			return;
		case 100:
			System.out.println("Cor escolhida foi VERMELHO");
			return;
		case 101:
			System.out.println("Cor escolhida foi MAGENTA");
			return;
		case 110:
			System.out.println("Cor escolhida foi AMARELO");
			return;
		case 111:
			System.out.println("Cor escolhida foi BRANCO");
			return;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Deseja usar VERMELHO (S/N)? ");
        boolean opR = sc.nextLine().toUpperCase().equals("S");
        
        System.out.print("Deseja usar VERDE (S/N)? ");
        boolean opG = sc.nextLine().toUpperCase().equals("S");
        
        System.out.print("Deseja usar AZUL (S/N)? ");
        boolean opB = sc.nextLine().toUpperCase().equals("S");
        
		RodadasCores rd = new RodadasCores(opR, opG, opB);
		rd.CorResultante();
	}

}
