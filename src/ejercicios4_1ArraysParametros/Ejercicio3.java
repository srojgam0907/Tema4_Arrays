package ejercicios4_1ArraysParametros;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array de enteros 
		 * y devuelva la suma de todos los elementos.
		 */
		
		new Ejercicio3().show();
	
	}
	
	public void show() {
		int[] numbers= {2,2,2};
		System.out.println(sumar(numbers)); //Llama al metodo sumar con un array de enteros
		
	}
	
	public int sumar(int[] nums) { 
		int sum=0;
		 
		for(int i=0; i< nums.length; i++) {
			sum+= nums[i]; //Suma los numeros 
			
		}
		
		return sum;
	}

}
