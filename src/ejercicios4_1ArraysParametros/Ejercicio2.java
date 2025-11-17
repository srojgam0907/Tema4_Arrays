package ejercicios4_1ArraysParametros;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que reciba un array de enteros como parámetro. 
		 * Modifica en el procedimiento algún elemento del array. ¿se ha modificado 
		 * el array en el código donde se ha hecho la llamada al procedimiento? 
		 * Demuéstralo.
		 */
		
		new Ejercicio2().show();

	}
	
	public void show() {
		int[] numbers= {2, 5, 8};
		
		System.out.println("Array sin cambiar: ");
		numbers.toString();
		
		modificarArray(numbers);
		
		
	}
	
	public void modificarArray(int[] numbers) {
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] %2 != 0){
				numbers[i]++;
				
			}
		}
		
		System.out.println("Array cambiado: ");
		numbers.toString();
		
	}

}
