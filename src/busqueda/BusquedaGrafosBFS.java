package busqueda;

public class BusquedaGrafosBFS implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "Se realiza b�squeda del nodo " +nodo+ " con BFS";
	}
	
	@Override
	public String toString() {
		return "B�squeda BFS";
	}

}
