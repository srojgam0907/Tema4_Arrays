package ejercicios4_1RetornoArrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza una función que reciba un array de caracteres, un carácter y 
		 *una posición. La función tiene que insertar el carácter en la posición 
		 *indicada, desplazando el resto de caracteres una posición. El array debe 
		 *tener la última posición libre para no perder información. No utilizar 
		 *un array auxiliar, sino que el desplazamiento se tiene que hacer sobre el 
		 *mismo array. La función tiene que devolver el array con el carácter insertado.
		 */
		
		new Ejercicio1().show();

	}
	
	public void show() {
		char[] caracteres;
		char caracter = 0; 
		int length = 0;
		
		caracter= enterCaracter(caracter);
		length= enterLength(length);
		caracteres= new char [length];
		caracteres= enterCaracteres(caracteres);
		
		switchCaracteres(caracteres, caracter);
		
	}
	
	public char enterCaracter(char caracter) {
		
		
		
		return 'a';
	}
	
	public int enterLength(int length) {
		
		
		
		return 0;
	}

	public char[] enterCaracteres(char[] caracteres) {
		
		
		
		return caracteres;
	}
	
	public void switchCaracteres(char[] caracteres, char caracter) {
		
		
		
	}
}
