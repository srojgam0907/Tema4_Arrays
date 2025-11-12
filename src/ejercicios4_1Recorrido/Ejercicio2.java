package ejercicios4_1Recorrido;
import java.util.*;

public class Ejercicio2 {

public static void main(String[] args) {
		/*Realiza un procedimiento que cree un array de enteros y le solicite un 
		 *booleano al usuario. Si el booleano es true, el procedimiento debe mostrar
		 *los elementos que ocupan las posiciones pares. Si el booleano es false, 
		 *el procedimiento debe mostrar los elementos que ocupan las posiciones impares.
		 */
		new Ejercicio2().show();

	}
	
	public void show() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int[] elements= {21, 45, 7, 3, 52, 61};
		boolean posicion;
		
		System.out.printf("Escribe \"true\" si quieres las posiciones pares o \"false\" si quieres las impares\n");
		posicion= kb.nextBoolean();
		
		for(int i=0; i<elements.length; i++) {
			
			if(posicion) {
				if(i%2==0) {
					System.out.printf("Posicion %d: %d\n", i, elements[i]);
					
				}
				
			}else {
				if(i%2!=0) {
					System.out.printf("Posicion %d: %d\n", i, elements[i]);
				}
				
			}
		}
		
	}

}
