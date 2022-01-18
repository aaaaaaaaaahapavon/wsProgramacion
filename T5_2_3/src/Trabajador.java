import java.util.Scanner;

public class Trabajador {
	
	private static String nombre;
	//private static int actual;
	private static int id;
	private static int titulacion;
	private static int antigüedad;
	private static char eC;
	private static char turno;
	
	public Trabajador() {
		
		Trabajador.nombre = "Zacarias";
		//Trabajador.actual = 0;
		Trabajador.id = 1;
		Trabajador.titulacion = 4;
		Trabajador.antigüedad = 4;
		Trabajador.eC = 'C';
		Trabajador.turno = 'D';
		
		/**int numero = actual++;
		
		if (actual <= 100) id = actual;
		else System.out.println("No se pueden crear más trabajadores!");*/
	}
	
	
	
	
	/**
	 * @return the nombre
	 */
	public static String getNombre() {
		return nombre;
	}




	/**
	 * @param nombre the nombre to set
	 */
	public static void setNombre(String nombre) {
		Trabajador.nombre = nombre;
	}




	/**
	 * @return the actual
	 */
	/**public static int getActual() {
		return actual;
	}


*/

	/**
	 * @param actual the actual to set
	 */
/**	public static void setActual(int actual) {
		Trabajador.actual = actual;
	}

*/

	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Trabajador.id = id;
	}




	/**
	 * @return the titulacion
	 */
	public static int getTitulacion() {
		return titulacion;
	}




	/**
	 * @param titulacion the titulacion to set
	 */
	public static void setTitulacion(int titulacion) {
		Trabajador.titulacion = titulacion;
	}




	/**
	 * @return the antigüedad
	 */
	public static int getAntigüedad() {
		return antigüedad;
	}




	/**
	 * @param antigüedad the antigüedad to set
	 */
	public static void setAntigüedad(int antigüedad) {
		Trabajador.antigüedad = antigüedad;
	}




	/**
	 * @return the eC
	 */
	public static char geteC() {
		return eC;
	}




	/**
	 * @param eC the eC to set
	 */
	public static void seteC(char eC) {
		Trabajador.eC = eC;
	}




	/**
	 * @return the turno
	 */
	public static char getTurno() {
		return turno;
	}




	/**
	 * @param turno the turno to set
	 */
	public static void setTurno(char turno) {
		Trabajador.turno = turno;
	}


	static public void modificarDatos() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce nombre: ");
		setNombre(teclado.nextLine());
		System.out.println("Introduce titulación(0-4): ");
		setTitulacion(teclado.nextInt());
		System.out.println("Introduce antigüedad: ");
		setAntigüedad(teclado.nextInt());
		System.out.println("Introduce estado civil: ");
		seteC(teclado.next().charAt(0));
		System.out.println("Introduce turno: ");
		setTurno(teclado.next().charAt(0));
		teclado.close();
		
	}
	
	static public void verDatos() {
		// TODO Auto-generated method stub
		
	}

	static public void calcularNomina() {
		
	}
	
	static public void menuOpciones() {
	
		int opciones;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige que hacer: (1)Ver datos (2)Modificar datos (3)Calcular nomina");
	    opciones = teclado.nextInt();
	    
	    if(opciones == 1 || opciones == 2 || opciones == 3) {
	    	switch(opciones) {
	    		case 1 : verDatos();
	    		case 2 : modificarDatos();
	    		case 3 : calcularNomina();
	    	}
	    }
	    else System.out.println("Error");

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
