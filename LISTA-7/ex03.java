package lista07;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[6];
		int impares = 0, somaPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 != 0) {
				impares++;
			}
		}

		System.out.printf("Numeros pares digitados: ");
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] % 2 == 0) {
				System.out.printf("%d, ", vetor[j]);
				somaPares += vetor[j];
			}
		}
		
		System.out.println(" ");
		System.out.println("Soma dos numeros pares: " + somaPares);
		
		System.out.printf("Numeros Impares digitados: ");
		for (int k = 0; k < vetor.length; k++) {
			if (vetor[k] % 2 != 0) {
				System.out.printf("%d, ", vetor[k]);
			}
		}
		
		System.out.println(" ");
		System.out.println("Quantidade de Impares digitados: " + impares);

		sc.close();
	}
}
