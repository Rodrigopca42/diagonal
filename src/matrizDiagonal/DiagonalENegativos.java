package matrizDiagonal;

import java.util.Scanner;

public class DiagonalENegativos {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int n = tec.nextInt();
		
		int[][] num = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				num [i][j] = tec.nextInt();
			}
		}
		
		tec.close();
		
		System.out.print("Diagonal Principal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(num [i][i]+ " ");
		}
		
		System.out.println();
		int cont = 0;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(num[i][j] < 0) {
					cont++;
				}
			}
		}
		 System.out.println("Quantidade de Negativos = "+ cont);
		
	}

}
