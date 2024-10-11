package br.senac.rj;

public class Senhas {
	
	private String senha;
	private String digitos = "0123456789";
	
	public  Senhas (String pw) {
		this.senha = pw;
	}
	
	private boolean ehDigito(char a) {
		for (int i=0; i< digitos.length(); i++) {
			if (a == digitos.charAt(i))
				return true;
		}	
		return false;
	}
	
	private boolean comecaDigito() {
		
//		for (int i=0; i< digitos.length(); i++) {
//			if (this.senha.charAt(0) == digitos.charAt(i))
//				return true;
//		}
//		return false;
		
		return ehDigito(senha.charAt(0));
	}
	
	private boolean tamanhoValido() {
//		if ((this.senha.length() >= 6) && (this.senha.length() <= 8))
//			return true;
//		return false;
		
		return ((this.senha.length() >= 6) && (this.senha.length() <= 8));
	}
	
	private boolean peloMenos1num() {
		
		for (int i=1; i< this.senha.length(); i++) {
//			for (int j=0; j< digitos.length(); j++)
//			if (this.senha.charAt(i) == digitos.charAt(j))
//				return true;
			
			if (ehDigito(senha.charAt(i)))
				return true;
		}
		return false;		
	}

	public static void main(String[] args) {
		
		String passwd = "robert11";
		Senhas pw = new Senhas(passwd);
		
		if (!pw.comecaDigito() && pw.tamanhoValido() && pw.peloMenos1num())
				System.out.println("Senha Válida " + passwd);
		else
			System.out.println("Senha Invalida: " + passwd);
	}

}
