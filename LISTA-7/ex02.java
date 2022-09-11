package lista07;


public class ex02 {
	public static void main(String[] args) {
		int vetor[] = new int[100];
		int i = 0, j=0;
		
		
		while(i < 100) {
			if (j % 7 != 0) {
				vetor[i] = j;
				i++;
			} 
			j++;
		}
		
		for (int j2 = 0; j2 < vetor.length; j2++) {
			System.out.printf("%d, ", vetor[j2]);
		}
	
	}
}
