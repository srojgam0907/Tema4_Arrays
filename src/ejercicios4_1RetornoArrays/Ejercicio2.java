package ejercicios4_1RetornoArrays;
import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array y devuelva otro 
		 *array con sus elementos invertidos.
		 */

		new Ejercicio2().show();
		
	}
	
	public void show() {
		int[] array= {4,2,8,9,3};
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(reverse(array)));
	}
	
	public int[] reverse(int[] array) { 
		int[] array2= new int [array.length];
		
		
		
		return array2;
	}

}
