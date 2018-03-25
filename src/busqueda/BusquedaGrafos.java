package busqueda;

public interface BusquedaGrafos
{
	public final static String DFS = "DFS";
	public final static String BFS = "BFS";
	public final static String SIN_BUSQUEDA = "NO";
	
	public abstract String buscar(String nodo);
}
