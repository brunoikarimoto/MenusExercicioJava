package topico3.menus;

import java.util.Scanner;
import topico3.listas.*;

public class MenuListas {
	public void mostraMenuLista1(Scanner sc) {
		int user=-1;
		Lista1 a = new Lista1();
		
		while(user != 0) {
			System.out.println("Escolha um exercício:");
			System.out.println("1 - Exercício 1;");
			System.out.println("2 - Exercício 2;");
			System.out.println("3 - Exercício 7;");
			System.out.println("4 - Exercício 14;");
			System.out.println("5 - Exercício 17;");
			System.out.println("0 - Sair.");
			
			user = sc.nextInt();
			
			switch(user) {
				case 1:
					a.Lista1ex1(sc);
					break;
				case 2:
					a.Lista1ex2(sc);
					break;
				case 3:
					a.Lista1ex7(sc);
					break;
				case 4:
					a.Lista1ex14(sc);
					break;
				case 5:
					a.Lista1ex17(sc);
					break;
				default:
					System.out.println("Opção inválida.");
			}
		}
	}
	
	public void mostraMenuLista2(Scanner sc) {
		int user=-1;
		Lista2 a = new Lista2();
		
		while(user != 0) {
			System.out.println("Escolha um exercício:");
			System.out.println("1 - Exercício 1;");
			System.out.println("2 - Exercício 2;");
			System.out.println("3 - Exercício 3;");
			System.out.println("4 - Exercício 4;");
			System.out.println("5 - Exercício 5;");
			System.out.println("6 - Exercício 6;");
			System.out.println("7 - Exercício 9;");
			System.out.println("8 - Exercício 12;");
			System.out.println("9 - Exercício 14;");
			System.out.println("10 - Exercício 15;");
			System.out.println("0 - Sair.");
			
			user = sc.nextInt();
			
			switch(user) {
				case 1:
					a.Lista2ex1(sc);
					break;
				case 2:
					a.Lista2ex12(sc);
					break;
				case 3:
					a.Lista2ex3(sc);
					break;
				case 4:
					a.Lista2ex4(sc);
					break;
				case 5:
					a.Lista2ex5(sc);
					break;
				case 6:
					a.Lista2ex6(sc);
					break;
				case 7:
					a.Lista2ex9(sc);
					break;
				case 8:
					a.Lista2ex12(sc);
					break;
				case 9:
					a.Lista2ex14(sc);
					break;
				case 10:
					a.Lista2ex15(sc);
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida.");
			}
		}
	}
}
