package basicos;
import java.util.ArrayList;
import java.util.Iterator;

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
		listaArcos = new ArrayList<Arco>();
		listaNodos = new ArrayList<Nodo>();
		
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
		Nodo nodo = getFabricaGrafos().createNodo(nombre);
		if(nodo != null) listaNodos.add(nodo);
		return nodo;
	}
	
	public Arco addArco(Nodo nodo1, Nodo nodo2)
	{
		Arco arco = getFabricaGrafos().createArco(nodo1, nodo2);
		if(arco != null) listaArcos.add(arco);
		return arco;
	}
	
	public Arco addArco(Nodo nodo1, Nodo nodo2, int peso)
	{
		Arco arco = getFabricaGrafos().createArco(nodo1, nodo2, peso); 
		if(arco != null) listaArcos.add(arco);
		return arco;
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
	
	@Override
	public String toString() {
		String texto ="-----------\nEl grafo "+
			( !isDirigido() ? "no ": "" ) +"es dirigido y "+
			( !isConPeso()  ? "no tiene peso.": "tiene peso.");

		texto += "\n Nodos: ";
		for (Nodo nodo : listaNodos) {
			texto +="\n  -" +nodo;
		}
		
		texto += "\n Arcos: ";
		for (Arco arco : listaArcos) {
			texto +="\n  -" +arco;
		}
		return texto;
	}
	
	
}
