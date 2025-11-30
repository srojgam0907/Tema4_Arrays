package ejercicios4_3ClaseArrays;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array bidimensional de enteros y 
		 *devuelva otro array bidimensional con los elementos copiados pero 
		 *con el doble de columnas. Los elementos nuevos se rellenan con ceros. 
		 *Utiliza copyOf de la clase Arrays.
		 */
		
		new Ejercicio1().show();
		
	}
	
	public void show() {
		int[][] array= {{1, 2, 3}, {4, 5, 6}};
		
		int[][] newArray= duplicateColumn(array);
		
		for(int[] fila : newArray) {
			System.out.println(Arrays.toString(fila));
		}
		
	}
	
	public int[][] duplicateColumn(int[][] array) {
		int filas = array.length;
	    int[][] array2 = new int[filas][];
	    int originalNumCol= 0;
	    int newNumCol= 0; 
		
	    for (int i= 0; i < filas; i++) {
            originalNumCol = array[i].length;
            newNumCol = originalNumCol * 2;
            array2[i] = Arrays.copyOf(array[i], newNumCol);
        }
		
		return array2;
	}

}
