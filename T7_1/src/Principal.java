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
		Empleado empleado = new Empleado();
		Jefe jefe = new Jefe();
		String nombre = "";
		Float sueldo = (float) 0;
		String titulo = "";
		String nomDep = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos empleados quieres introducir:");
		int n = teclado.nextInt();
		for(int i = 0; i<n; n++) {
			empleado.setTodo(nomDep, i);
			empleado.impTodo();
			
		}

	}

}
