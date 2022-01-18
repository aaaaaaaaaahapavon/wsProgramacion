import java.util.Scanner;

public class Empleado {

	private static String nombreEmpleado;
	private static int numeroEmpleado;

	public Empleado() {
		
			Empleado.nombreEmpleado = "";
			Empleado.numeroEmpleado = 0;
	}

		public static String getNombreEmpleado() {
		return nombreEmpleado;
	}

		public static void setNombreEmpleado(String nombreEmpleado) {
		Empleado.nombreEmpleado = nombreEmpleado;
	}

	public static int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public static void setNumeroEmpleado(int numeroEmpleado) {
		Empleado.numeroEmpleado = numeroEmpleado;
	}

	public static void leerDatos() {
		Scanner teclado = new Scanner(System.in); 
			System.out.println("\n Introduce el nombre del empleado: ");
			setNombreEmpleado(teclado.nextLine());
			System.out.println("\n Introduce el numero del empleado: ");
			setNumeroEmpleado(teclado.nextInt());
			
		teclado.close();
	}

	public static void verDatos() {
		System.out.println("Nombre del empleado: " +getNombreEmpleado());
		System.out.println("Numero del empleado: " +getNumeroEmpleado());
	}
	
	public static void main(String[] args) {
		leerDatos();
		verDatos();
	}

}
