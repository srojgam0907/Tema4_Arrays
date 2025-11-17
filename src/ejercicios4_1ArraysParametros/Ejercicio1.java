package ejercicios4_1ArraysParametros;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un varargs de enteros 
		 *y devuelva la multiplicación de todos los números.
		 */
		
		new Ejercicio1().show();

	}
	
	public void show() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int length, value;
		int [] numbers;
		
		System.out.println("¿Cuántos números quieres multiplicar?");
		length= kb.nextInt();
		
		numbers= new int [length];
		
		for(int i=0; i< length; i++) { //Le pide numeros al usuario
			System.out.printf("Introduce un numero para la posición %d\n", i+1);
			value= kb.nextInt();
			numbers[i]= value;
			
		}
		
		System.out.println("El resultado es: " + add(numbers)); //Llama al metodo add con un varargs de numeros
	}
	
	public int add(int... nums) { //El metodo trata el vararg como un array normal
		int multi=1;
		 
		for(int i=0; i< nums.length; i++) {
			multi*= nums[i]; //Multiplica los numeros 
			
		}
		
		return multi;
	}

}
