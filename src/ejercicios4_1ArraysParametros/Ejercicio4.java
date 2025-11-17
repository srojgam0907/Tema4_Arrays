package ejercicios4_1ArraysParametros;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que reciba un array de enteros y un número. 
		 * El procedimiento tendrá que mostrar: 
		 * 		-En qué posiciones del array aparece dicho número.
		 * 		-Cuántas veces aparece dicho número en total en el array. 
		 */

		new Ejercicio4().show();
		
	}

	public void show() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int[] numbers;
		int num, length, value;
		
		System.out.println("¿cuántos números tiene el array?");
		length= kb.nextInt();
		
		numbers= new int [length];
		
		for(int i=0; i<length; i++) { //El usuario rellena el array
			System.out.printf("Introduce un numeros para la posición %d\n", i+1);
			value= kb.nextInt();
			numbers[i]= value;
			
		}
		
		System.out.println("¿Qué número quieres buscar?");
		num= kb.nextInt();
		
		buscarNumero(numbers, num);
		
	}
	
	public void buscarNumero(int[] numbers, int num) {
		int contador=0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == num) {//Si el elemento de la posicion i es igual que num
				contador++; 
				
				if(contador==1) {
					System.out.printf("Ese valor está en las posiciones %d", i);
					
				}else {
					System.out.printf(", %d", i);
					
				}
			}
		}
		
		if (contador==0) { //Si no se encuentra el numero
			System.out.println("Ese numero no aparece"); 
			
		}else {
			System.out.printf("\nEl numero %d aparece %d veces", num, contador);
			
		}	
	}
}










