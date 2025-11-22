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
		position= enterPosition(position, length, kb);
		
		System.out.println(Arrays.toString(caracteres)); //Sin añadir el caracter nuevo
		
		switchCaracteres(caracteres, caracter, position, length);
		
		System.out.printf("\nCon el cambio\n%s%n",Arrays.toString(caracteres)); //Con el caracter nuevo añadido
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
		
		System.out.println("Usted insertará caracteres en la lista");
		
		for(i=0; i<=caracteres.length-2; i++) {
			System.out.println("Introduce un caracter");
			value= kb.next().charAt(0);	
			
			caracteres[i]= value; 
		}

		return caracteres;
	}
	
	//Pedir el caracter que se introducirá en el array
	public char enterCaracter(char caracter, Scanner kb) {
		System.out.println("Elige un caracter que se introducirá en el array");
		caracter= kb.next().charAt(0);
		
		return caracter; 
	}
	
	//Pedir la posicion para el caracter teniendo en cuenta la longitud dicha por el usuario
	public int enterPosition(int position, int length, Scanner kb) {
		do{
			System.out.println("¿En qué posición quieres introducir ese caracter?");
			position= kb.nextInt();
			
			if(position > length || position < 0) { 
				System.out.printf("Posicion fuera de rango. Tiene que ser menor a %d y mayor a 0", length);
			}
			
		}while(position > length || position < 0);
		
		
		return position; 
	}
	
	//Cambia el orden de los caracteres incluyendo el caracter nuevo en la posicion pedida
	public void switchCaracteres(char[] caracteres, char caracter, int position, int length) { 
		
		for(int i=caracteres.length-1; i>position-1; i--) {
			
				caracteres[i]= caracteres[i-1];
				
		} 
		
		caracteres[position-1]=caracter; 
	}
	
}
