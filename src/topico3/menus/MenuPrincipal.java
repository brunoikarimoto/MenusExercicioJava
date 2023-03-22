package topico3.menus;

import java.util.Scanner;
import topico3.menus.MenuListas;

public class MenuPrincipal {
	public void mostraMenuPrincipal() {
		int user=-1;
		MenuListas a = new MenuListas();
		
		Scanner sc = new Scanner(System.in);
		
		while(user != 0) {
			System.out.println("Escolha uma lista:");
			System.out.println("1 - Lista 1;");
			System.out.println("2 - Lista 2;");
			System.out.println("0 - Sair.");
			
			user = sc.nextInt();
			
			switch(user) {
				case 1:
					a.mostraMenuLista1(sc);
					break;
				case 2:
					a.mostraMenuLista2(sc);
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida.");
			}
		}
		
		sc.close();
	}
}
