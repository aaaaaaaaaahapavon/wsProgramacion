import java.util.Scanner;
/** Programa que hace cosas
 * 
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class examen2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dni, resto;
		boolean correcto = false;
		String letra;
		String letraDni = "";
		
		do {
		letra = "";
		System.out.println("Introduce letra dni: ");
		letraDni = teclado.nextLine();
		System.out.println("Introduce el dni: ");
		dni = teclado.nextInt();
		if(dni>0 && dni<100000000) {
			resto = dni%23;
			switch(resto) {
				case 0: letra = "T"; break;
				case 1: letra = "R"; break;
				case 2: letra = "W"; break;
				case 3: letra = "A"; break;
				case 4: letra = "G"; break;
				case 5: letra = "M"; break;
				case 6: letra = "Y"; break;
				case 7: letra = "F"; break;
				case 8: letra = "P"; break;
				case 9: letra = "D"; break;
				case 10: letra = "X"; break;
				case 11: letra = "B"; break;
				case 12: letra = "N"; break;
				case 13: letra = "J"; break;
				case 14: letra = "Z"; break;
				case 15: letra = "S"; break;
				case 16: letra = "Q"; break;
				case 17: letra = "V"; break;
				case 18: letra = "H"; break;
				case 19: letra = "L"; break;
				case 20: letra = "C"; break;
				case 21: letra = "K"; break;
				case 22: letra = "E"; break;
			}
			if(letraDni.equalsIgnoreCase(letra)) {
				correcto = true;
			System.out.println("El dni es correcto");
			}
			else System.out.println("El dni  no es correcto");
		}
		else System.out.println("Error");
		}while(correcto == false);
		teclado.close();
	}

}
