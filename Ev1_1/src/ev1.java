import java.util.Scanner;
/** Matematicas para niños de primaria con una carrera de matemático
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ev1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		double y,z,resultado=0;
		int contador = 10;
		int aciertos = 0;
		int respuesta;
		System.out.print("Elige entre suma (1), resta (2) o producto (3)");
		x = teclado.nextInt();
			switch(x) {
			case 1:
				while(contador>0) {
					z = Math.random()*20;
					y = Math.random()*20;
					resultado = (int)z + (int)y;
					System.out.print((int)z + "+" + (int)y);
					respuesta = teclado.nextInt();
					if(respuesta==resultado) {
						aciertos++;
					}
					contador--;
				};break;
			case 2:
				while(contador>0) {
					z = Math.random()*20;
					y = Math.random()*20;
					resultado = (int)z - (int)y;
					System.out.print((int)z + "-" + (int)y);
					respuesta = teclado.nextInt();
					if(respuesta==resultado) {
						aciertos++;
					}
					contador--;
				};break;
			case 3:
				while(contador>0) {
					z = Math.random()*20;
					y = Math.random()*20;
					resultado = (int)z * (int)y;
					System.out.print((int)z + "*" + (int)y);
					respuesta = teclado.nextInt();
					if(respuesta==resultado) {
						aciertos++;
					}
					contador--;
				};break;
			default: System.out.print("Prueba otra vez");	
		}
			System.out.println("La nota final es: " + aciertos + "/10");
			teclado.close();
	}
}