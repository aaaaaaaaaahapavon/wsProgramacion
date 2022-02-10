import java.util.Scanner;
public class Disco {
	
	private static String nombre;
	
	public Disco() {
		Scanner teclado = new Scanner(System.in);
		Disco.nombre = teclado.toString();
		teclado.close();
	}
	
	public void setNombre(String nombre) {
		Disco.nombre = nombre;
	}
	
	public static String getNombre() {
		return nombre;
	}
}
