package busqueda;

public class NoBusquedaGrafos implements BusquedaGrafos
{

	@Override
	public String buscar(String nodo) {
		return "B�squeda no soportada";
	}
	
	@Override
	public String toString() {
		return "No hay b�squeda configurada";
	}
}