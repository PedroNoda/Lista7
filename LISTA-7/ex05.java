package lista07;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas = 0, k = 0;

		System.out.println("Informe um valor: ");
		linhas = sc.nextInt();
		int num = linhas;
		int vetor[] = new int[num + 1];
		vetor[0] = 1;

		for (int i = 0; i <= num; i++) {
			System.out.println();
			linhas = 0;
			for (int j = 0; j <= i; j++) {
				k = linhas + vetor[j];
				linhas = vetor[j];
				vetor[j] = k;
				System.out.print(vetor[j] + ", ");
			}
		}
		sc.close();
	}
}
