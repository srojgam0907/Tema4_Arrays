package ejercicios4_1RetornoArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realiza una función recursiva que reciba un array de números 
		 *decimales ordenados y un número decimal y busque el número 
		 *decimal en el array. Si lo encuentra devuelve la posición, 
		 *si no lo encuentra, devuelve un -1.
		 */
		
		new Ejercicio5().show();

	}
	
	public void show() {
		int[] array= enterValues();
		
		
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

}
