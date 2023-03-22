package topico3.listas;

import java.util.Scanner;

public class Lista1 {
	public void Lista1ex1(Scanner sc) {
		int num;
		
		System.out.println("Digite um número:");
		
		num = sc.nextInt();
		
		if(num >= 10) {
			System.out.println("Número maior ou igual que 10!");
		}
		else {
			System.out.println("Número menor ou igual que 10!");
		}
	}
	
	public void Lista1ex2(Scanner sc) {
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número:");
		
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número:");
		
		num2 = sc.nextInt();
		
		System.out.println("Soma: " + (num1 + num2));
	}
	
	public void Lista1ex7(Scanner sc) {
		int num;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		if(num >= 100 && num <= 200) {
			System.out.println("Número está entre 100 e 200!");
		}
		else {
			System.out.println("Número não está estre 100 e 200!");
		}
	}
	
	public void Lista1ex14(Scanner sc) {
		int a1, r, n, an;
		
		System.out.print("a1: ");
		a1 = sc.nextInt();
		
		System.out.print("r: ");
		r = sc.nextInt();
		
		System.out.print("n: ");
		n = sc.nextInt();
		
		an = a1 + (n - 1)*r;
		
		System.out.println("an = " + an);
	}
	
	public void Lista1ex17(Scanner sc) {
		double nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		System.out.print("Nota1: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Nota2: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Nota3: ");
		nota3 = sc.nextDouble();
		
		System.out.print("Peso1: ");
		peso1 = sc.nextDouble();
		
		System.out.print("Peso2: ");
		peso2 = sc.nextDouble();
		
		System.out.print("Peso3: ");
		peso3 = sc.nextDouble();
		
		media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3);
		
		System.out.println("Média: " + media);
	}
}
