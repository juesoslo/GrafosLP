package basicos;

public class Nodo
{
	private String nombre;
	
	public Nodo( String nombre ) {
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
