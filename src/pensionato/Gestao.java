package pensionato;

import java.util.Scanner;

public class Gestao {

	public static void main(String[] args) {
		
		int N_QUARTOS = 10;
		
		Scanner sc = new Scanner(System.in);
		Quarto[] quartos = new Quarto[N_QUARTOS];
		
		System.out.print("Entre com o numero de estudanetes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Entre com nome, email e quarto de escolha do estudante " + (i+1) + ": ");
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int q_escolha = sc.nextInt();
			sc.nextLine();
			quartos[q_escolha] = new Quarto(nome, email, q_escolha);
		}
		
		for(Quarto q : quartos) {
			if(q!=null) {
			System.out.println(q);
			}
		}
		
		sc.close();
	}
	
}
