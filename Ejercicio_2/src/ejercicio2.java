import java.util.Scanner;

/**Lee un n�mero entre 1 y 10, calcula y muestra la tabla de multiplicar de ese n�mero.
 * 
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, resultado;
		int contador = 1;
		int i = 1;
		
		System.out.print("Introduzca n�mero: ");
		n = teclado.nextInt();
		if(n >= 1 && n <= 10){
			System.out.println("TABLA DE MULTIPLICAR DE " + n);
			while(contador<=10) {
			resultado= n * i;
			System.out.println(n + " * " + i + " = " + resultado);
			i++;
			contador++;
		}
		}
		teclado.close();

	}

}
