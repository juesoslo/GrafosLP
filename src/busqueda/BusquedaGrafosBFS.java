package busqueda;

public class BusquedaGrafosBFS implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "Se realiza bùsqueda del nodo " +nodo+ " con BFS";
	}
	
	@Override
	public String toString() {
		return "Búsqueda BFS";
	}

}
