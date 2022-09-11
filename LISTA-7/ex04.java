package lista07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10]; 
		int c[] = new int[20];

		for (int i = 0; i < a.length; i++) {
			System.out.println("(A)Informe um valor : ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("(B)Informe um valor : ");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			c[i] = a[i];

		}
		for (int i = 10; i < 20; i++) {
			c[i] = b[i-10];
		}
		
		Set<Integer> set = new HashSet<>();
		for(int x: c) {
		    set.add(x);
		}
		System.out.println(set);
		sc.close();
	}
}
