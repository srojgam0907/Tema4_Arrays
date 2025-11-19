package ejercicios4_1ArraysParametros;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que reciba un array de números 
		 *comprendidos entre 0 y 9 y muestre un histograma
		 */
		
		new Ejercicio5().show();

	}
	
	public void show() {
		int[] numbers = new int[] {6, 4, 4, 1, 9, 7, 5, 6, 4, 2, 3, 9, 5, 6, 4};
		
		histograma(numbers);
	}
	
	public void histograma(int[] nums) { //Cambiar nombre a numbers 
		int max=0;
		int[] count= new int[10];
		
		for(int n : nums) {  
			if(n >=0 && n <=9) {
				count[n]++;
			}
		}
		
		for(int f : count) {
			if(f > max) {
				max= f;
			}
		}
		
		for(int nivel= max; nivel>0; nivel--) {
			for(int i=0; i<count.length; i++) {
				if(count[i] >= nivel) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<10; i++) {
			
		}
		
	}

}










