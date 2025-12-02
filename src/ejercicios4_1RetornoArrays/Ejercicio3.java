package ejercicios4_1RetornoArrays;
import java.util.Arrays;
import java.util.Scanner;

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
		int[] array= enterValues();
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(arrayOrder(array)));
		
	}
	
	public int[] enterValues() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int[] array;
		int value=0;
		int length=0;
		
		System.out.println("¿De qué longitud es el array?");
		length= kb.nextInt();
		
		array= new int [length]; //Inicializa la longitud del array
		
		for(int i=0; i< array.length; i++) { //Rellena los valores del array
			System.out.printf("Introduce un valor para la posicion %d\n", i+1);
			value= kb.nextInt();
			
			array[i]= value;
		}
		
		return array;
	}
	
	public int[] arrayOrder(int [] array) {
		int aux= 0;
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1-i; j++) { //Para evitar comparaciones innecesarias
				if(array[j] > array[j+1]) { //Lo ordena de menor a mayor con el método burbuja
					aux= array[j+1];
					array[j+1]= array[j];
					array[j]= aux;
				}
			}
			System.out.printf("Cambio %d: %s\n", i+1, Arrays.toString(array));
		}
		
		return array;
		
	}
}
