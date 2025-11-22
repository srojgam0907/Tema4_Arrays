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
		Scanner kb= new Scanner(System.in);
		char[] caracteres;
		char caracter = 0; 
		int length = 0;
		
		length= enterLength(length, kb);
		caracteres= new char [length];
		caracteres= enterCaracteres(caracteres, kb);
		caracter= enterCaracter(caracter, kb);
		
		switchCaracteres(caracteres, caracter);
		
	}
	
	public int enterLength(int length, Scanner kb) {
		
		
		
		return 0;
	}
	
	public char[] enterCaracteres(char[] caracteres, Scanner kb) {
		
		
		
		return caracteres;
	}
	
	public char enterCaracter(char caracter, Scanner kb) {
		System.out.println("");
		
		
		return 'a';
	}
	
	public void switchCaracteres(char[] caracteres, char caracter) {
		
		
		
	}
	
}
