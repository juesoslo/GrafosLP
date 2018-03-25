package busqueda;

public class NoBusquedaGrafos implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "Búsqueda no soportada";
	}
	
	@Override
	public String toString() {
		return "No hay búsqueda configurada";
	}
}