package ejercicios4_1ArraysParametros;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un varargs de enteros 
		 *y devuelva la multiplicación de todos los números.
		 */
		
		new Ejercicio1().show();

	}
	
	public void show() {
		System.out.println(add(2,2,2));
		
		
	}
	
	public int add(int... nums) {
		int multi=1;
		 
		for(int i=0; i< nums.length; i++) {
			multi*= nums[i]; 
			
		}
		
		return multi;
	}

}
