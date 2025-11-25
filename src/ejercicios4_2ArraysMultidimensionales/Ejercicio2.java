package ejercicios4_2ArraysMultidimensionales;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array de tres dimensiones 
		 *de números decimales y devuelva cuál es el elemento mayor. 
		 */
		
		new Ejercicio2().show();

	}
	
	public void show() {
		int numMayor=0;
		double [][][] matriz= { // matriz [2]capas [2]filas [3]columnas 
			{ //capa 0
				{3.14, 7.82, 0.56},
				{9.01, 4.77, 8.62}
			},
				
			{ //capa 1
				{6.53, 2.48, 11.09},
				{5.21, 13.37, 1.44} 
			}
		};
		
		numMayor= highElement(matriz);
		
		System.out.printf("En esa matriz el numero más grande es %d", numMayor);
		
	}
	
	public int highElement(double[][][] matriz) { 
		int mayor=0;
		
		
		
		return mayor;
	}

}
