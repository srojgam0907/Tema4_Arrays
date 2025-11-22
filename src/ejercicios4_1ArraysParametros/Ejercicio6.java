package ejercicios4_1ArraysParametros;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realiza una función recursiva que reciba un array 
		 *de enteros y devuelva un booleano para indicar  
		 *si el array es capicúo.
		 */
		
		new Ejercicio6().show();

	} 

	public void show() {
		int[] numCapicuo= {8,2,5,5,2,8};
		//int[] numNoCapicuo= {8,3,5,9,4,8};
		boolean capicuo= false;
		
		capicuo= esCapicuo(numCapicuo);
		
		if(capicuo) {
			System.out.println("El numero es capicuo");
			
		} else {
			System.out.println("El numero no es capicuo");
			
		}
		
	}
	
	public boolean esCapicuo(int[] num) { 
		
		
		
		
	}
	
	
	/* ITERATIVO
	for(int i=0; i<num.length/2; i++) {
		
		if(num[i] != num[num.length-1-i]) {
			return false; 
			
		} 
		
	}
	
	return true;
	*/
}






