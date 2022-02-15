/**Programa que rellena un vector con nombres de empleados y los muestra
 * 
 */

/**
 * @author alu
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		String [] listaEmpleado = new String[50];
		
		for(int i = 0; i<50; i++) {
			Empleado empleado = new Empleado();
			empleado.setNombre();
			listaEmpleado [i] = Empleado.getNombre();
			System.out.println(listaEmpleado[i]);
		}
	}

}


