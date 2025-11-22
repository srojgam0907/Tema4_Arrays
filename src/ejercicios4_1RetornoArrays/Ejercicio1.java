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
		int position= 0;
		
		length= enterLength(length, kb);
		caracteres= new char [length+1];
		caracteres= enterCaracteres(caracteres, kb);
		caracter= enterCaracter(caracter, kb);
		position= enterPosition(position, kb);
		
		switchCaracteres(caracteres, caracter, position);
		
	}
	
	//Pedir la longitud del array 
	public int enterLength(int length, Scanner kb) { 
		do {
			System.out.println("Introduce la longitud de la lista, tiene que ser mayor a 1");
			length= kb.nextInt();
			
			if(length<=1) {
				System.out.println("ERROR");
			}
		
		} while(length<=1);
		
		return length; 
	}
	
	//Rellena el array caracteres hasta la longitud dicha por el usuario
	public char[] enterCaracteres(char[] caracteres, Scanner kb) { 
		char value=0;
		int i=0;
		
		for(i=0; i<=caracteres.length-2; i++) {
			System.out.println("Introduce un caracter");
			value= kb.next().charAt(0);		}
		
			caracteres[i]= value; 
		
		return caracteres;
	}
	
	public char enterCaracter(char caracter, Scanner kb) {
		System.out.println("");
		
		
		return 'a';
	}
	
	public int enterPosition(int position, Scanner kb) {
		
		
		
		return 0;
	}
	
	public void switchCaracteres(char[] caracteres, char caracter, int position) { 
		
		
		
	}
	
}
