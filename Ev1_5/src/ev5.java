import java.util.Scanner;
/** Máquina tragaperras, genera números aleatorios y los relaciona con un simbolo hasta 3 simbolos. Si dichos simbolos 
 * corresponden a un premio, se sumará el premio al saldo. El saldo inicial es 10.
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ev5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double s;
		char simbolo = 0;
		String confirmacion,afirmacion, secuencia;
		afirmacion="Si";
		int saldo=10;
		//premios
		String premio1 = "$$$";
		String premio2 = "$@@";
		String premio3 = "$##";
		String premio4 = "@@@";
		String premio5 = "@##";
		String premio6 = "@$$";
		
		do {
			//Elección del jugador para inciar el programa Si, inicia, cualquier otra cosa termina.
			System.out.println("¿Quieres jugar? Si/No");
			System.out.println("Tu saldo: " + saldo);
			confirmacion = teclado.nextLine();
			secuencia ="";
			do {
				//genera los números y los relaciona con simbolos para formar una cadena de 3 simbolos
				saldo--;
				s=Math.random()*10;
				switch((int)s) {
					case 1: simbolo='$';break;
					case 2: simbolo='$';break;
					case 3: simbolo='$';break;
					case 4: simbolo='@';break;
					case 5: simbolo='@';break;
					case 6: simbolo='@';break;
					case 7: simbolo='#';break;
					case 8: simbolo='%';break;
					case 9: simbolo='>';break;
					case 10: simbolo='<';break;
				}
				secuencia+=	simbolo;
			}while(secuencia.length()<3);
			//comprueba si la secuencia coincide con un premio y suma el premio al saldo.
			if(secuencia.equalsIgnoreCase(premio1)) {
				saldo+=50;
				System.out.println("WIN! +50");
			}
			else if(secuencia.equalsIgnoreCase(premio2)) {
				saldo+=25;
				System.out.println("WIN! +25");
			}
			else if(secuencia.equalsIgnoreCase(premio3)) {
				saldo+=15;
				System.out.println("WIN! +15");
			}
			else if(secuencia.equalsIgnoreCase(premio4)) {
				saldo+=10;
				System.out.println("WIN! +10");
			}
			else if(secuencia.equalsIgnoreCase(premio5)) {
				saldo+=5;
				System.out.println("WIN! +5");
			}
			else if(secuencia.equalsIgnoreCase(premio6)) {
				saldo+=3;
				System.out.println("WIN! +3");
			}
			else { saldo++;
				System.out.println("Lose...");
			}
			System.out.println(secuencia);
		}
		while(confirmacion.equalsIgnoreCase(afirmacion) && saldo>0);
		teclado.close();
	}

}
