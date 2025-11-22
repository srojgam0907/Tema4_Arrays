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
		
		length=enterLength(length, kb);
		array= new int[length];
		enterValues(array, kb);
		
		System.out.printf("Array 1: %s%n\n", Arrays.toString(array));
		
		System.out.printf("Array invertido: %s%n\n", Arrays.toString(reverse(array)));
	}
	
	//Introduce la longitud del array
	public int enterLength(int length, Scanner kb) {
		
		do {
			System.out.println("Introduce una longitud, mayor o igual 2");
			length= kb.nextInt();
			
			if(length < 2) {
				System.out.println("ERROR numero fuera de rango"); 
			}
			
		} while(length < 2);
		
		return length;
	}
	
	//Introduce los valores del array
	public void enterValues(int[] array, Scanner kb) {
		int value=0;
		
		for(int i=0; i<array.length-1; i++) {
			System.out.printf("Introduce un numero para la posición %d", i+1);
			value= kb.nextInt();
			
			array[i]=value;
			
		}
	} 
	
	//Introduce los valores de array invirtidos en el array2
	public int[] reverse(int[] array) { 
		int[] array2= new int [array.length];
		
		
		
		return array2;
	}

}
