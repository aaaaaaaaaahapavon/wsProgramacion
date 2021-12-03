import java.util.Scanner;

/**Ya bueno, quien tiene hambre.
/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int figura;
		int h, b, l;
		float areatriangulo;
		int areacuadrado, arearectangulo;
		
		System.out.println("Elige entre una de las siguientes opciones: ");
		System.out.println("Triángulo (Introduzca 1)");
		System.out.println("Cuadrado (Introduzca 2)");
		System.out.println("Rectángulo (Introduzca 3)");
		
		figura = teclado.nextInt();

		switch (figura) {
			case 1:
				System.out.println("Introduce altura del triángulo: ");
				h = teclado.nextInt();
				System.out.println("Introduce longitud de la base: ");
				b = teclado.nextInt();
				areatriangulo = (float)(b*h)/2;
				System.out.print("El área de un triángulo es: " + areatriangulo);
				break;
			case 2:
				System.out.println("Introduce longitud del lado: ");
				l = teclado.nextInt();
				areacuadrado = l*l;
				System.out.print("El área del cuadrado es:  " + areacuadrado);
				break;
			case 3:
				System.out.println("Introduce altura del rectángulo: ");
				h = teclado.nextInt();
				System.out.println("Introduce longitud de la base: ");
				b = teclado.nextInt();
				arearectangulo = b*h;
				System.out.print("El área del rectángulo es: "  + arearectangulo);
				break;
			default:
				System.out.println("Error en los datos introducidos");
		}
		teclado.close();
	}
}
