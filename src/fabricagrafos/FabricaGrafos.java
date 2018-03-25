package fabricagrafos;

import agregadorarcos.AgregadorArcos;
import basicos.Arco;
import basicos.Nodo;
import busqueda.BusquedaGrafos;
import busqueda.BusquedaGrafosBFS;
import busqueda.BusquedaGrafosDFS;
import busqueda.NoBusquedaGrafos;

public abstract class FabricaGrafos
{
	private AgregadorArcos agregadorArcos;
	private BusquedaGrafos busquedaGrafos;
	
	public void createBusquedaGrafos(String busqueda) {
		if(busqueda == BusquedaGrafos.SIN_BUSQUEDA)
			setBusquedaGrafos(new NoBusquedaGrafos());
		else if(busqueda == BusquedaGrafos.DFS)
			setBusquedaGrafos(new BusquedaGrafosDFS());
		else if(busqueda == BusquedaGrafos.BFS)
			setBusquedaGrafos(new BusquedaGrafosBFS());
	}

	public Nodo createNodo(String nombre)
	{
		return new Nodo(nombre);
	}
	
	public abstract Arco createArco(Nodo nodo1, Nodo nodo2);
	public abstract Arco createArco(Nodo nodo1, Nodo nodo2, int peso);

	public AgregadorArcos getAgregadorArcos() {
		return agregadorArcos;
	}

	public void setAgregadorArcos(AgregadorArcos agregadorArcos) {
		this.agregadorArcos = agregadorArcos;
	}

	public BusquedaGrafos getBusquedaGrafos() {
		return busquedaGrafos;
	}

	public void setBusquedaGrafos(BusquedaGrafos busquedaGrafos) {
		this.busquedaGrafos = busquedaGrafos;
	}
	
	public String buscar(String nombreNodo)
	{
		return busquedaGrafos.buscar(nombreNodo);
	}
	
}
