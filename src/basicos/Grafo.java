package basicos;
import java.util.ArrayList;

import fabricagrafos.FabricaGrafos;
import fabricagrafos.FabricaGrafosDirigidosConPeso;
import fabricagrafos.FabricaGrafosDirigidosSinPeso;
import fabricagrafos.FabricaGrafosNoDirigidosConPeso;
import fabricagrafos.FabricaGrafosNoDirigidosSinPeso;


public class Grafo
{
	private ArrayList<Nodo> listaNodos;
	private ArrayList<Arco> listaArcos;
	private boolean dirigido;
	private boolean conPeso;
	private FabricaGrafos fabricaGrafos;
	
	public Grafo(boolean digido, boolean conPeso)
	{
		setDirigido(digido);
		setConPeso(conPeso);
		createFabricaGrafo();
	}
	
	private void createFabricaGrafo()
	{
		if(isDirigido() && isConPeso())
			fabricaGrafos = new FabricaGrafosDirigidosConPeso();
		
		else if(isDirigido() && !isConPeso())
			fabricaGrafos = new FabricaGrafosDirigidosSinPeso();
		
		else if(!isDirigido() && isConPeso())
			fabricaGrafos = new FabricaGrafosNoDirigidosConPeso();
		
		else if(!isDirigido() && !isConPeso())
			fabricaGrafos = new FabricaGrafosNoDirigidosSinPeso();
	}
	
	public Nodo addNodo(String nombre)
	{
		return getFabricaGrafos().createNodo(nombre);
	}
	
	public Arco addArco(Nodo nodo1, Nodo nodo2)
	{
		return getFabricaGrafos().createArco(nodo1, nodo2);
	}
	
	public Arco addArco(Nodo nodo1, Nodo nodo2, int peso)
	{
		return getFabricaGrafos().createArco(nodo1, nodo2, peso);
	}
	
	
	public ArrayList<Nodo> getListaNodos() {
		return listaNodos;
	}
	public void setListaNodos(ArrayList<Nodo> listaNodos) {
		this.listaNodos = listaNodos;
	}
	public ArrayList<Arco> getListaArcos() {
		return listaArcos;
	}
	public void setListaArcos(ArrayList<Arco> listaArcos) {
		this.listaArcos = listaArcos;
	}
	public boolean isDirigido() {
		return dirigido;
	}
	public void setDirigido(boolean dirigido) {
		this.dirigido = dirigido;
	}
	public boolean isConPeso() {
		return conPeso;
	}
	public void setConPeso(boolean conPeso) {
		this.conPeso = conPeso;
	}

	public FabricaGrafos getFabricaGrafos() {
		return fabricaGrafos;
	}

	public void setFabricaGrafos(FabricaGrafos fabricaGrafos) {
		this.fabricaGrafos = fabricaGrafos;
	}
	
	
	
}
