import java.util.Scanner;

/**Lee un n�mero por teclado y muestra todos los primos desde el n�mero hasta 0.
/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		
		System.out.print("Ingresa n�mero: ");
		n= teclado.nextInt();
		while(n>0) {
			i=2;
			while(n%i != 0) {
					i++;
			}
			if (i==n) 
				System.out.print(n + " ");
		n--;
		}
		teclado.close();
	}
}