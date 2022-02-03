import java.util.Scanner;

public class Trabajador {
	
	private static String nombre = "Zacarias";
	//private static int actual;
	private static int id = 1;
	private static int titulacion = 4;
	private static int antig�edad = 4;
	private static char eC = 'C';
	private static char turno = 'D';
	
	public Trabajador() {
		

		Trabajador.setId(0);
		Trabajador.setNombre("");
		Trabajador.seteC((char) 0);
		Trabajador.setTurno((char) 0);
		Trabajador.setTitulacion(0);
		Trabajador.setAntig�edad(0);
		
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
	 * @return the antig�edad
	 */
	public static int getAntig�edad() {
		return antig�edad;
	}




	/**
	 * @param antig�edad the antig�edad to set
	 */
	public static void setAntig�edad(int antig�edad) {
		Trabajador.antig�edad = antig�edad;
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
		
		do{
			
			System.out.println("Introduce titulaci�n(0-4): ");
		    setTitulacion(teclado.nextInt());
		
		}while(titulacion<0 && titulacion>4);
		
		System.out.println("Introduce antig�edad: ");
		setAntig�edad(teclado.nextInt());
		
		do{
			
			System.out.println("Introduce estado civil: ");
			seteC(teclado.next().charAt(0));
			
		}while(eC != 'S'&& eC != 'C');
		
		do{
			
			System.out.println("Introduce turno: ");
			setTurno(teclado.next().charAt(0));
			
		}while(turno != 'D'&& turno != 'N');
		
		teclado.close();
		
	}
	
	static public void verDatos() {
		
	   System.out.println(getNombre());
	   System.out.println(getId());
	   System.out.println(getTitulacion());
	   System.out.println(getAntig�edad());
	   System.out.println(geteC());
	   System.out.println(getTurno());
	   
	}

	static public void calcularNomina() {
		
		int salario_base = 450;
		int extra_noche = 100;
		int plus_titulo = 0;
		int plus_tiempo = 75;
		double retencion = 0;
		double total = 0;

		if ( turno == 'N' ) {
			salario_base += extra_noche;
		}

		plus_tiempo = plus_tiempo*antig�edad;
		salario_base += plus_tiempo;

		switch ( titulacion ) {
		case 0:
			plus_titulo += 250;
			break;
		case 1:
			plus_titulo += 500;
			break;
		case 2:
			plus_titulo += 1000;
			break;
		case 3:
			plus_titulo += 1250;
			break;
		case 4:
			plus_titulo += 1500;
			break;
		default:
			// System.out.println("\n ERROR: Entrada erronea de parametros");
		}

		salario_base += plus_titulo;


		if ( eC == 'C' ) {
			retencion = (double)(salario_base*0.10);
		} else {
			retencion = (double)(salario_base*0.12);
		}

		total = (double)salario_base;
		total = total - retencion;

		System.out.println("\n Calculando nomina ...");
		System.out.println("\n Nomina: " +total);
	}
	
	static public void menuOpciones() {
	
		int opciones;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige que hacer: (1)Ver datos (2)Modificar datos (3)Calcular nomina");
	    opciones = teclado.nextInt();
	   
	    switch(opciones) {
	    	case 1 : verDatos();
	    	break;
	    	case 2 : modificarDatos();
	    	break;
	    	case 3 : calcularNomina();
	    	default: System.out.println("ERROR");
	    }
	    teclado.close();
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuOpciones();
	}

}
