import java.util.Scanner;
public class Gestion {
	Scanner teclado = new Scanner (System.in);
		public void añadirAlumno(String nombre, int edad, String nCurso, int num_asignaturas, int nota) {
			
				System.out.println("Nombre Alumno: ");
				nombre = teclado.next();
				
				System.out.println("Edad Alumno: ");
				edad = teclado.nextInt();
				
				System.out.println("Nombre Curso Alumno: ");
				nCurso = teclado.next();
				
				System.out.println("Numero Asignaturas Alumno: ");
				num_asignaturas = teclado.nextInt();
				
				System.out.println("Nota Alumno: ");
				nota = teclado.nextInt();		
				
	
		}
		public void devolverMasAlto() {
			
		}
		
		public void visualListaValores() {
			
		}
}
