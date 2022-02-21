import java.util.Scanner;
/**
 * 
 */

/**
 * @author alu
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int indice = 0;
			int indexKeeper = 0;
			String nombre = null;
			int edad = 0;
			String nCurso = null;
			int num_asignaturas = 0;
			int nota = 0;
			int terminar = 1;
			Gestion gestion = new Gestion();
			Alumno alumno = new Alumno(nombre, edad, nCurso, num_asignaturas, nota);
			do {
				System.out.println("¿Cuantos alumnos quieres añadir?");
				indice = teclado.nextInt();
				indexKeeper += indice;
				Object [] Alumno = new Object [indexKeeper];
				for(int controlador = 0; controlador<Alumno.length; controlador++) { 
					gestion.añadirAlumno(nombre, edad, nCurso, num_asignaturas, nota);
					Alumno [controlador] = alumno.getTodo();
					
					System.out.println(Alumno [controlador]);
				}
				System.out.println("¿Quieres continuar? Si (1) - No (0)");
				terminar = teclado.nextInt();
			}while(terminar != 0);
			teclado .close();
	}

}
