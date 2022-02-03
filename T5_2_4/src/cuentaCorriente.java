//Crear una clase llamada CuentaCorriente, cuyos atributos serán: 
	//titular (string)
	//saldo (float)
	//codigo (int)

//Dicha clase realizará las siguientes operaciones:
	//Ingresar Dinero, actualizando el saldo
	//Puedo Sacar (boolean)
	//Retirar Dinero

//Autor: Inés Cristóbal Ascaso
//Fecha: 20/01/22


import java.util.Scanner;

public class cuentaCorriente {

	private static String titular;
	private static float saldo;
	private static String codigo;
	private static boolean corrector;
	


	public static void main(String[] args) {

		introducirDatos();
		
		menuOpciones();

		//ingresarDinero();

		/**if (PuedoSacar()) {

			RetirarDinero();

		} else {

			System.out.println("Error, no hay saldo suficiente, pulse return");
		}
		*/
	}
	public cuentaCorriente() {

		cuentaCorriente.setTitular("");
		cuentaCorriente.setSaldo(0);
		cuentaCorriente.setCodigo("");
		cuentaCorriente.corrector = false;
	}



	public static String getTitular() {

		return titular;
	}

	public static void setTitular(String titular) {

		cuentaCorriente.titular = titular;
	}

	public static float getSaldo() {

		return saldo;
	}

	public static void setSaldo(float saldo) {

		cuentaCorriente.saldo = saldo;
	}

	public static String getCodigo() {

		return codigo;
	}

	public static void setCodigo(String codigo) {

		cuentaCorriente.codigo = codigo;
	}
	
	static public void menuOpciones() {

		int opciones;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige que hacer: (1)Ingresar dinero (2)Retirar dinero");
		opciones = Integer.parseInt(teclado.nextLine());

	   
	    switch(opciones) {
	    	case 1 : ingresarDinero();
	    	break;
	    	case 2 : retirarDinero();
	    	break;
	    	default: System.out.println("ERROR");
	    }
	    teclado.close();
	}

	static public void cCodigo() {
		
		int i;
		
		for(i  = 0; i < codigo.length(); i++){
			if((codigo.charAt(i) >= 'a' && codigo.charAt(i) <= 'z') ||
			   (codigo.charAt(i) >= 'A' && codigo.charAt(i) <= 'Z')) {
				
				System.out.println("ERROR");
				corrector = false;
				}
			else { corrector = true;
			}
		}
	}
	static public void introducirDatos() {

		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce el nombre del titular: ");
		setTitular(teclado.nextLine());

		System.out.println("Introduce el saldo inicial: ");
		setSaldo(teclado.nextFloat());

		do {

			System.out.println("Introduce el código del titular: ");
			setCodigo(teclado.nextLine());
			cCodigo();
			if(codigo.length() != 8) {
				System.out.println("ERROR");
			}
		} while (codigo.length() != 8 || corrector == false);	
		teclado.close();
	}
	
	static public void ingresarDinero() {

		int ingreso;

		Scanner teclado = new Scanner (System.in);

			System.out.println("Introduce la cantidad de dinero que quiere ingresar: ");
			ingreso = teclado.nextInt();
		

			if (ingreso >= 0) {

				saldo += ingreso;
				System.out.println("El saldo del titular tras ingresar dinero es: " + saldo);

			} else {

				System.out.println("El ingreso debe ser superior a 0 €");
			}
			teclado.close();
		}
	static public void retirarDinero() {
		System.out.println("a");
	}
}
