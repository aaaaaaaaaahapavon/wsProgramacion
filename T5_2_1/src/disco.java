import java.util.Scanner;
/**
 * 
 */

/**
 * @author Ángel Pavón Fraile e Inés Cristóbal Ascaso
 *
 */
public class disco {
// Atributos de clase
	private static String titulo;
	private static int num_canciones;
	private static int precio;
	private static int dia_compra;
	private static int mes_compra;
	private static int año_compra;
	
	
	
//Constructor	
	
	
	public disco(){
		
		disco.titulo = "";
		disco.num_canciones = 0;
		disco.precio = 0;
		disco.dia_compra = 0;
		disco.mes_compra = 0;
		disco.año_compra = 0;
		
	}
	
	
	
//	Establecer titulo
	
	public void setTitulo(String nuevoTitulo) {
		
		disco.titulo = nuevoTitulo;
		
	}
	
	
// Obtener titulo
	
	public static String getTitulo() {
		
		return titulo;
	}

	
//	Establecer num canciones
	
	public void setNum_canciones(int nuevoNum) {
		
		disco.num_canciones = nuevoNum;
		
	}
	
	
// Obtener num_canciones
	
	public static int getNum_canciones() {
		
		return num_canciones;
	}

	


	/**
	 * @return the precio
	 */
	public static int getPrecio() {
		return precio;
	}



	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		disco.precio = precio;
	}



	/**
	 * @return the dia_compra
	 */
	public static int getDia_compra() {
		return dia_compra;
	}



	/**
	 * @param dia_compra the dia_compra to set
	 */
	public void setDia_compra(int dia_compra) {
		disco.dia_compra = dia_compra;
	}



	/**
	 * @return the mes_compra
	 */
	public static int getMes_compra() {
		return mes_compra;
	}



	/**
	 * @param mes_compra the mes_compra to set
	 */
	public void setMes_compra(int mes_compra) {
		disco.mes_compra = mes_compra;
	}



	/**
	 * @return the año_compra
	 */
	public static int getAño_compra() {
		return año_compra;
	}



	/**
	 * @param año_compra the año_compra to set
	 */
	public void setAño_compra(int año_compra) {
		disco.año_compra = año_compra;
	}



	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce el titulo del disco: ");
		titulo = teclado.nextLine();
		System.out.print("Introduce el número de canciones: ");
		num_canciones = teclado.nextInt();
		System.out.print("Introduce el precio: ");
		precio = teclado.nextInt();
		System.out.print("Introduce el día de la compra: ");
		dia_compra = teclado.nextInt();
		System.out.print("Introduce el mes de la compra: ");
		mes_compra = teclado.nextInt();
		System.out.print("Introduce el año de la compra: ");
		año_compra = teclado.nextInt();
		
		System.out.println("El título de la canción es: " +	getTitulo());
		System.out.println("El número de canciones es: " +	getNum_canciones());
		System.out.println("El precio del disco es: " +	getPrecio());
		System.out.println("La fecha de compra es: " +	getDia_compra() + "/" + getMes_compra() + "/" + getAño_compra());
		
		teclado.close();
	}
	
	

}
