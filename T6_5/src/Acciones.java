import java.util.Scanner;

public class Acciones {
	
	
	public static void menu() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Que quieres hacer: (1)A�adir disco, (2)Ver lista de discos, (3)Buscar disco");
	int t = teclado.nextInt();
	switch (t) {
		case 1 : a�adirDisco();break;
		case 2 : verLista();break;
		case 3 : buscarDisco();break;	
	}
	teclado.close();
	}
	
	public static void a�adirDisco() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos discos quieres a�adir: ");
		int i = teclado.nextInt();
		for(int x = 0; x<i; x++) {
			Disco.setNombre();
			ListaDisco.setListaDisco(null, x);
		}
		teclado.close();
	}
	
	
	public static void buscarDisco() {
		
	}
	
	
	public static void verLista() {                  
		
	}
}

