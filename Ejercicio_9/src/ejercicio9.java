import java.util.Scanner;

/**Lee un n�mero introducido por teclado e indica si es perfecto o no.
/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		int suma = 0;
		
		System.out.print("Ingresa n�mero: ");
		n= teclado.nextInt();
		i=1;
		while(i<n) {
				if(n%i == 0) {
					suma += i;
				}
				i++;
		}
		if (suma==n) {
			System.out.print("Es perfecto");
		}
		else {
			System.out.print("No es perfecto");
		teclado.close();
	}
	}
}
