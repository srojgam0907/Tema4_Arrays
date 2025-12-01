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
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		double[] array= enterValues(kb);
		double num= enterNumber(kb);
		
	}
	
	public double[] enterValues(Scanner kb) {
		int length= 0;
		double[] array;
		double value= 0.0;
		
		do {
			System.out.println("Introduce una longitud, mayor o igual 2");
			length= kb.nextInt();
			
			if(length < 2) {
				System.out.println("ERROR numero fuera de rango"); 
			}
			
		} while(length < 2); //La longitud del array no puede ser < 2 
		
		array= new double [length]; //Inicializa la longitud del array
		 
		for(int i=0; i< array.length; i++) { //Rellena los valores del array
			System.out.printf("Introduce un valor decimal para la posicion %d\n", i+1);
			value= kb.nextDouble();
			
			array[i]= value;
		}
		
		return array;
	}
	
	public double enterNumber(Scanner kb) {
		double num= 0;
		
		System.out.printf("Introduce el numero decimal que quieras buscar");
		num= kb.nextDouble();
		
		return num; 
	}

}
