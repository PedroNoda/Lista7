package lista07;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Informe o %d valor do vetor A: ", i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.printf("Informe o %d valor do vetor B: ", i);
			b[i] = sc.nextInt();
			
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Elementos vetor C: ");
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%d, ", c[i]);
		}
		
		
		sc.close();
	}
}	
