import java.util.Scanner;
public class Gestion {
	Scanner teclado = new Scanner (System.in);
		public void añadirAlumno(String nombre, int edad, String nCurso, int num_asignaturas, int nota) {
				Alumno alumno = new Alumno(nombre, edad, nCurso, num_asignaturas, nota);
				System.out.println("Nombre Alumno: ");
				alumno.setNombre(teclado.next());
				
				System.out.println("Edad Alumno: ");
				alumno.setEdad(teclado.nextInt());
				
				System.out.println("Nombre Curso Alumno: ");
				alumno.setnCurso(teclado.next());
				
				System.out.println("Numero Asignaturas Alumno: ");
				alumno.setNum_asignaturas(teclado.nextInt());
				
				System.out.println("Nota Alumno: ");
				alumno.setNota(teclado.nextInt());		
				
	
		}
		public void devolverMasAlto() {
			
		}
		
		public void visualListaValores() {
			
		}
}
