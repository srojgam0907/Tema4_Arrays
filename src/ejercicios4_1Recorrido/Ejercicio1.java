package ejercicios4_1Recorrido;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que cree un array de enteros y muestre por cada 
		 *posición si el elemento que contiene es par o impar. 
		 */
		new Ejercicio1().show();

	}
	
	public void show() {
		int[] elements= {5, 8, 6, 7, 1};
		
		for (int i=0; i< elements.length; i++) { //recorre el array hasta el final
			
			if(elements[i] %2 == 0) { //comprueba si el elemento en esa posicion es par
				System.out.printf("El elemento de la posición %d es par\n", i);
				
			}else {
				System.out.printf("El elemento de la posición %d es impar\n", i);

			}
		}
	}

}
