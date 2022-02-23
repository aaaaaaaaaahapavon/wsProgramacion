public class Gestion {
		public void añadirAlumno(String nombre, int edad, String nCurso, int num_asignaturas, int nota) {
				Alumno alumno = new Alumno(nombre, edad, nCurso, num_asignaturas, nota);
				
				System.out.println("Nombre Alumno: ");
				alumno.setNombre(nombre);
				
				System.out.println("Edad Alumno: ");
				alumno.setEdad(edad);
				
				System.out.println("Nombre Curso Alumno: ");
				alumno.setnCurso(nCurso);
				
				System.out.println("Numero Asignaturas Alumno: ");
				alumno.setNum_asignaturas(num_asignaturas);
				
				System.out.println("Nota Alumno: ");
				alumno.setNota(nota);		
				
	
		}
		public void devolverMasAlto() {
			
		}
		
		public void visualListaValores() {
			
		}
}
