package ejercicios4_1RetornoArrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Crea una función que reciba como parámetro un array 
		 *unidimensional de números enteros y  devuelva el 
		 *array ordenado de menor a mayor utilizando el método 
		 *de la burbuja.
		 */
		
		new Ejercicio3().show();

	}
	
	public void show() {
		int[] array;
		
		enterValues(array);
		
		System.out.println();
		arrayOrder(array);
		
		
		
	}

}
