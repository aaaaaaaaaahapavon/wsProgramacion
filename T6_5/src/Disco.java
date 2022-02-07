import java.util.Scanner;

public class Disco {
	
		static String nombre;
		
	public void disco(){
		
		Disco.nombre = "";
	}

	public static void setNombre(){
			System.out.println("Titulo del disco: ");
			Scanner teclado = new Scanner(System.in);
			Disco.nombre = teclado.nextLine();
			teclado.close();
	}
	public String getNombre() {
			
		return nombre;
	}
}
	
	
	

