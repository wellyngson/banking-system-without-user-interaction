package main;
import contaBanco.ContaBanco;

public class Main {
	
	public static void main(String[] args) {
				
//		CRIAÇÃO DOS OBJETOS CC(Conta Corrente) E CP(Conta Poupança)
		ContaBanco person01 = new ContaBanco("Conta Corrente");
		ContaBanco person02 = new ContaBanco("Conta Poupança");
				
//		EXECUTANDO OS MÉTODOS PARA O PRIMEIRO USUÁRIO
		person01.openAccount();
		System.out.println(person01);
		person01.deposit(10000);
		person01.withDraw(100);
		person01.month();
		person01.closeAccount();
		
//		EXECUTANDO OS MÉTODOS PARA O SEGUNDO USUÁRIO
		person02.openAccount();
		System.out.println(person02);
		person02.deposit(1000);
		person02.withDraw(100);
		person02.month();
		person02.closeAccount();

	}
}