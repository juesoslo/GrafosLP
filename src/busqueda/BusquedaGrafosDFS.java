package busqueda;

public class BusquedaGrafosDFS implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "Se realiza bùsqueda del nodo " +nodo+ " con DFS";
	}
	
	@Override
	public String toString() {
		return "Búsqueda DFS";
	}

}
