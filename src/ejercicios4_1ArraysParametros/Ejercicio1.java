package ejercicios4_1ArraysParametros;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un varargs de enteros 
		 *y devuelva la multiplicación de todos los números.
		 */
		
		new Ejercicio1().show();

	}
	
	public void show() {
		System.out.println(add(2,2,2)); //Llama al metodo add con un varargs de numeros
		
		
	}
	
	public int add(int... nums) { //El metodo trata el vararg como un array normal
		int multi=1;
		 
		for(int i=0; i< nums.length; i++) {
			multi*= nums[i]; //Multiplica los numeros
			
		}
		
		return multi;
	}

}
