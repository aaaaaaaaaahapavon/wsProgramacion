import java.util.Scanner;
/** lee una oraci�n y una palabra y muestra la posici�n de la palabra dentro de la oraci�n, si no est� muestra 0
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class cadenas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una oraci�n: ");
		String p = teclado.nextLine();
		System.out.print("Introduce una palabra: ");
		String s = teclado.nextLine();
	
		System.out.print("La posicion de tu palabra es: " + (p.indexOf(s)+1/**como empieza en 0 se suma 1*/)/**busca la 
		palabra en la oraci�n*/ );
		
		
		teclado.close();
	}
}
