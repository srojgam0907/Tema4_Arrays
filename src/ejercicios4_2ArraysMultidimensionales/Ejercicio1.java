package ejercicios4_2ArraysMultidimensionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Un array bidimensional llamado matriz y de dimensiones NxN 
		 *(N filas y N columnas) se dice que es simétrico si sus elementos 
		 *satisfacen la siguiente condición:
		 *
		 *matriz [ i ] [ j ] = matriz [ j ] [ i ] para todo i, j, es decir, 
		 *si se obtiene el mismo array al cambiar las filas por las columnas. 
		 *
		 *Realiza una función que reciba un array bidimensional y devuelva un 
		 *booleano indicando si es simétrico.
		 */

		new Ejercicio1().show();

	}
	
	public void show() {
		int[][] matriz= {{1,2,3,4},{2,5,6,7},{3,6,8,9},{4,7,9,10}}; 
		boolean simetrico;
		
		simetrico= symmetrical(matriz);
		
		if(simetrico) {
			System.out.println("La matriz es simétrica");
			
		} else {
			System.out.println("La matriz no es simétrica");
			
		}
	}
	
	public int[][] enterLength(int[][] matriz) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int row=0, col=0; //Filas y columnas
		
		do {
			System.out.println("¿Cuántas filas tiene la matriz?");
			row= kb.nextInt();
			
			System.out.println("¿Cuántas columnas tiene la matriz");
			col= kb.nextInt();
			
			if(row != col) {
				System.out.println("ERROR. Filas y columnas tienen que ser iguales");
			}
			
		} while(row != col);
		
		matriz= new int[row][col];
		
		return matriz;
		
	}
	
	public boolean symmetrical(int [][] matriz) {
		boolean simetrico=false; 
		
		
		
		return simetrico;
	}

}
