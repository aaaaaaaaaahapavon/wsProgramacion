import java.util.Scanner;
/** Programa que hace cosas
 *  MAMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class examen1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fila = 1, n,contador, espacios;
		String cadena;
		
		System.out.println("Introduzca un n�mero: ");
		n = teclado.nextInt();
		
		contador = n;
		while(contador>0) {
			cadena = "";
			espacios = n - fila;
			while(espacios>0) {
				cadena+= " ";
				espacios--;
			}
			while(cadena.length()<n) {
				cadena+= "*";
		}
			fila++;
			contador--;
			System.out.println(cadena);
		}
		teclado.close();
	}

}


