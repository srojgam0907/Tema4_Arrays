package ejercicios4_1RetornoArrays;

import java.util.Arrays;
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
		float[] array= {1.9f, 2.9f, 3.4f, 5.1f, 6.2f, 7.0f, 8.2f, 9.4f, 10.7f, 12.6f, 15.2f};
		float num= enterNumber(kb);
		
		System.out.printf("%d", buscarDecimal(array, num, 0));
		
	}
	
	public float enterNumber(Scanner kb) {
		float num= 0;
		
		System.out.printf("Introduce el numero decimal que quieras buscar\n");
		num= kb.nextFloat();
		
		return num; 
	}
	
	public int buscarDecimal(float[] array, float num, int counter) {
		int result;
		
		if(array.length/2==0) {
			return -1;
			
		} else if(num >= array[array.length/2]) {
			if(num == array[array.length/2]) {
				result= array.length/2;
				return result+=counter;
				
			} else {
				result = array.length / 2; 
				counter+=Math.ceil(result)+1;
				return buscarDecimal(Arrays.copyOfRange(array, (array.length/2)+1, array.length), num, counter);
			}
			
		} else {
			return buscarDecimal(Arrays.copyOfRange(array, 0, (array.length/2)), num, counter);
		}
		
	}

}











