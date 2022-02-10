
public class Jefe extends Empleado{
	private String titulo;
	private String nomDep;
	
	public Jefe() {
		this.titulo = "";
		this.nomDep = "";
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the nomDep
	 */
	public String getNomDep() {
		return nomDep;
	}

	/**
	 * @param nomDep the nomDep to set
	 */
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	
	public void setTdo(String nombre,float sueldo, String nomDep, String titulo){
		super.setTodo(nombre, sueldo);
		setNomDep(nomDep);
		setTitulo(titulo);		
	}
	public String impTitulo() {
		return "\n\t\tTITULO" + titulo;
	}
	public String impNomDep() {
		return "\n\t\tNOMBRE DEPARTAMENTO" + nomDep;
	}
	public String impTODO() {
		return super.impTodo() + impTitulo() + impNomDep();
	}
	
	
}
