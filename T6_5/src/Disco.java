import java.util.Scanner;
public class Disco {
	
		private static String [] disco;
		private static int indice;
		
	void disco(){
		
		Disco.disco = new String [100];
		Disco.indice = 0;
	}

	/**
	 * @return the disco
	 */
	public static String[] getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public static void setDisco(String[] disco) {
		Disco.disco = disco;
	}

	/**
	 * @return the indice
	 */
	public static int getIndice() {
		return indice;
	}

	/**
	 * @param indice the indice to set
	 */
	public static void setIndice(int indice) {
		Disco.indice = indice;
	}
	
	
	static public void añadirDisco() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos discos quieres añadir: ");
		int i = teclado.nextInt();
		for(int x = 0; x<i; x++) {
			System.out.println("Titulo del disco: ");
			disco [0] = teclado.toString();
			setIndice(+1);
		}
		teclado.close();
	}
	
	
	static public void verLista() {                  
		
	}
	
	
	static public void buscarDisco() {
		
	}
	
	
	static public void menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que quieres hacer: (1)Añadir disco, (2)Ver lista de discos, (3)Buscar disco");
		int t = teclado.nextInt();
		switch (t) {
			case 1 : añadirDisco();break;
			case 2 : verLista();break;
			case 3 : buscarDisco();break;	
		}
		teclado.close();
	}
}
