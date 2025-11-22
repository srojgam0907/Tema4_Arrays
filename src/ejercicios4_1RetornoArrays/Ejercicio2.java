package ejercicios4_1RetornoArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array y devuelva otro 
		 *array con sus elementos invertidos.
		 */

		new Ejercicio2().show();
		
	}
	
	public void show() {
		Scanner kb= new Scanner(System.in);
		int[] array;
		int length=0;
		
		length=enterLength(length);
		array= new int[length];
		enterValues(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(reverse(array)));
	}
	
	//Introduce la longitud del array
	public int enterLength(int length) {
		
		
		return length;
	}
	
	//Introduce los valores del array
	public void enterValues(int[] array) {
		
		
	}
	
	//Introduce los valores de array invirtidos en el array2
	public int[] reverse(int[] array) { 
		int[] array2= new int [array.length];
		
		
		
		return array2;
	}

}
