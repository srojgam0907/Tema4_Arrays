package ejercicios4_1ArraysParametros;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realiza una función recursiva que reciba un array 
		 *de enteros y devuelva un booleano para indicar  
		 *si el array es capicúa.
		 */
		
		new Ejercicio6().show();

	} 

	public void show() {
		int[] numCapicuo= {8,2,5,5,2,8};
		int[] numNoCapicuo= {8,3,5,9,4,8};
		boolean capicuo= false;
		
		capicuo= esCapicuo(numCapicuo);
		
	}
	
	public boolean esCapicuo(int[] numCapicuo) {
		
		for(int i=0; i<numCapicuo.length/2; i++) {
			if(numCapicuo[i]!=numCapicuo[numCapicuo.length-i-1]) {
				return false;
				
			} else {
				return true; 
				
			}
			
		}
		
		
		return true;
	}
}






