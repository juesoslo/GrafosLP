package busqueda;

public class BusquedaGrafosDFS implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "Se realiza b�squeda del nodo " +nodo+ " con DFS";
	}
	
	@Override
	public String toString() {
		return "B�squeda DFS";
	}

}
