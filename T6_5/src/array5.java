import java.util.Scanner;
/**
 * @author �ngel Pav�n
 *
 */
public class array5 {

		
	public static void main(String[] args) {
		int t;
		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("Que quieres hacer: (1)A�adir disco, (2)Ver lista de discos, (3)Buscar disco, (0)Terminar el "
		+ "programa");
		t = teclado.nextInt();
			switch (t) {
				case 0 : System.out.println("Finalizando programa");break;
				case 1 : a�adirDisco();break;
				case 2 : verLista();break;
				case 3 : buscarDisco();break;
				default : System.out.println("Error");
			}
		}while(t!=0);
		teclado.close();
	}

	static public void a�adirDisco() {
		int index = Album.getIndice();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos discos quieres a�adir: ");
		int i = teclado.nextInt();
		for(int x = 0; x<i; x++) {
			System.out.println("Titulo disco: ");
			Disco.setNombre(teclado.next());
			Album.A�adirDiscoAlbum();
			System.out.println("Libro en la posici�n " + (Album.getIndice()+1) + " del album: " + Album.getDiscoAlbum(Album.getIndice()));
			index++;
			Album.setIndice(index);
		}
		teclado.close();
	}


	public static void buscarDisco() {
	
	}


	public static void verLista() {                  	
	}
}