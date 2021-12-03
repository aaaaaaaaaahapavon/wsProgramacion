import java.util.Scanner;
/** Lee una cadena de caracteres y muestra el número de mayusculas y minusculas que tiene
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class cadenas2 {

	public static void main(String[] args) {
		System.out.print("Introduce una oración de menos de 80 caracteres");
		Scanner teclado = new Scanner(System.in);
		String p = teclado.nextLine();
		int mayuscula = 0;
		int minuscula = 0;
		
		if (p.length()<=80) {
			for(int x=0;x<p.length();x++) {
			char caracter=p.charAt(x);
			if(caracter>='A' && caracter<='Z') mayuscula++;	
			else if (caracter>='a' && caracter<='z') minuscula++;	
			}
		}
		else {
			System.out.print("Introduce menos de 80 caracteres!!");
		}
		System.out.println("El número de mayusculas que has introducido es: " + mayuscula);
		System.out.println("El número de minusculas que has introducido es: " + minuscula);
		teclado.close();
	}
}


