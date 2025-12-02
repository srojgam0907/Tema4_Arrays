package ejercicios4_1RetornoArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Realiza una función recursiva que reciba un array 
		 *y devuelva otro array con sus elementos invertidos. 
		 */
		
		new Ejercicio4().show();

	}
	
	public void show() {
		int[] array= enterValues();
		int[] array2= new int [array.length];
		int index= 0;
		
		System.out.printf("Array 1: %s%n\n", Arrays.toString(array));
		
		System.out.printf("Array invertido: %s%n\n", Arrays.toString(reverse(array, array2, index)));
	}
	
	public int[] enterValues() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int length= 0;
		int[] array;
		int value= 0;
		
		do {
			System.out.println("Introduce una longitud, mayor o igual 2");
			length= kb.nextInt();
			
			if(length < 2) {
				System.out.println("ERROR numero fuera de rango"); 
			}
			
		} while(length < 2); //La longitud del array no puede ser < 2 
		
		array= new int [length]; //Inicializa la longitud del array
		 
		for(int i=0; i< array.length; i++) { //Rellena los valores del array
			System.out.printf("Introduce un valor para la posicion %d\n", i+1);
			value= kb.nextInt();
			
			array[i]= value;
		}
		
		return array;
	}
	
	public int[] reverse(int[] array, int[] array2, int index) { //funcion recursiva
		
		if(array.length == index) { //caso base
			return array2;
		}
		
		//Se copia el elemento
		System.arraycopy(array, index, array2, array.length-1-index, 1);
		
		reverse(array, array2, index+1); //caso recursivo
		
		return array2;
	}
	
	/*public int[] reverse(int[] a) {
		
		int[] arrayAux;
		int[] reversedArray = new int[a.length];
			// Casos base:
		 	// - Array par: array vacío
		 	// - Array impar: array con un 1 elemento
		 
		if(a.length==0 || a.length==1) {
			return a;
		} else {//Caso recursivo
			reversedArray[0]=a[a.length-1];
			reversedArray[reversedArray.length-1]=a[0];
			arrayAux = Arrays.copyOfRange(a, 1, a.length-1);
			arrayAux = reverse(arrayAux);
			System.arraycopy(arrayAux, 0, reversedArray, 1, arrayAux.length);
			return reversedArray;
		}
		
	}*/
	

}
