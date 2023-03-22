package topico3.listas;

import java.util.Scanner;

public class Lista2 {
	public void Lista2ex1(Scanner sc) {
		int[] vetor = new int[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Número " + (i+1) + ":");
			vetor[i] = sc.nextInt();
		}
		
		for(i = 0; i < 5; i++) {
			if(vetor[i] > 0) {
				System.out.println("Número " + (i+1) + ": Positivo");
			}
			else if(vetor[i] < 0) {
				System.out.println("Número " + (i+1) + ": Negativo");
			}
			else {
				System.out.println("Número " + (i+1) + ": Zero");
			}
		}
	}
	
	public void Lista2ex2(Scanner sc) {
		float[] vetor = new float[5];
		int i;
		float media;
		
		media = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.print((i+1) + ": ");
			vetor[i] = sc.nextFloat();
			
			media += vetor[i];
		}
		
		media /= 5;
		
		System.out.println("Valores maiores ou igual a média(" + media + "):");
		
		for(i = 0; i < 5; i++) {
			if(vetor[i] >= media) {
				System.out.println(vetor[i]);
			}
		}
	}
	
	public void Lista2ex3(Scanner sc) {
		int[] vetor = new int[5];
		int[] dobro = new int[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vetor[i] = sc.nextInt();
			
			dobro[i] = vetor[i] * 2;
		}
		
		System.out.println("Dobro do vetor:");
		
		for(i = 0; i < 5; i++) {
			System.out.println(dobro[i]);
		}
	}
	
	public void Lista2ex4(Scanner sc) {
		int[] vetor = new int[5];
		int i, n;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Vetor[" + (i) + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for(i = 0; i < 5; i++) {
			if(vetor[i] < n) {
				System.out.println(i);
			}
		}
	}
	
	public void Lista2ex5(Scanner sc) {
		int[] vetor = new int[5];
		int i, n, contador=0;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Vetor[" + (i) + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for(i = 0; i < 5; i++) {
			if(vetor[i] == n) {
				contador++;
			}
		}
		
		System.out.println("O número " + n + " apareceu " + contador + " vezes!");
	}
	
	public void Lista2ex6(Scanner sc) {
		float[] notas = new float[5];
		float[] pesos = new float[5];
		float media=0, divisor = 0;
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Nota " + (i+1) + ":");
			notas[i] = sc.nextFloat();
		}
		
		for(i = 0; i < 5; i++) {
			System.out.print("Peso " + (i+1) + ":");
			pesos[i] = sc.nextFloat();
		}
		
		for(i = 0; i < 5; i++) {
			media += pesos[i] * notas[i];
			divisor += pesos[i];
		}
		
		media = media / divisor;
		
		System.out.println("A média do aluno foi: " + media);
	}
	
	public void Lista2ex9(Scanner sc) {
		int[] vetora = new int[5];
		int[] vetorb = new int[5];
		int[] vetorc = new int[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Vetor A[" + i + "]: ");
			vetora[i] = sc.nextInt();
		}

		for(i = 0; i < 5; i++) {
			System.out.print("Vetor B[" + i + "]: ");
			vetorb[i] = sc.nextInt();
		}
		
		for(i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				vetorc[i] = vetora[i];
			}
			else {
				vetorc[i] = vetorb[i];
			}
		}
		
		for(i = 0; i < 5; i++) {
			System.out.println("Vetor C[" + i + "]: " + vetorc[i]);
		}
	}
	
	public void Lista2ex12(Scanner sc) {
		int[] vetor = new int[12];
		int i, mudou=0, result=1;
		
		for(i = 0; i < 12; i++) {
			System.out.print("Vetor [" + i + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		for(i = 0; i < 12; i++) {
			if(vetor[i] > 0) {
				result *= vetor[i];
				mudou = 1;
			}
		}
		
		if(mudou == 1) {
			System.out.println("Multiplicação de todos números maiores que 0: " + result);
		}
		else {
			System.out.println("Nenhum número maior que 0.");
		}
	}
	
	public void Lista2ex14(Scanner sc) {
		int[] vetor = new int[5];
		int i, maior, aux, indice;
		
		for(i = 0; i < 5; i++) {
			System.out.print("Vetor [" + i + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		maior = vetor[0];
		indice = 0;
		
		for(i = 1; i < 5; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				indice = i;
			}
		}
		
		aux = vetor[4];
		vetor[4] = vetor[indice];
		vetor[indice] = aux;
		
		System.out.println("Novo vetor:");
		
		for(i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	public void Lista2ex15(Scanner sc) {
		int[] vetor = new int[5];
		int i=0, mudou;
		
		System.out.print("Vetor [" + i + "]: ");
		vetor[i] = sc.nextInt();
		
		for(i = 1; i < 5; i++) {
			mudou = 0;
			
			while(mudou == 0) {
				System.out.print("Vetor [" + i + "]: ");
				vetor[i] = sc.nextInt();
				
				if(vetor[i] > vetor[i-1]) {
					mudou = 1;
				}
			}
		}
		
		System.out.println("Vetor:");
		
		for(i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
	}
}
