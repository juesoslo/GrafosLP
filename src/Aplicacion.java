import basicos.Arco;
import basicos.Grafo;
import basicos.Nodo;
import busqueda.BusquedaGrafos;

public class Aplicacion {
	public static void main(String[] args) {
		
		//Dirigido y con peso, sin búsqueda
		Grafo grafo = new Grafo(true, true);
		Nodo nodoA = grafo.addNodo("A");
		Nodo nodoB = grafo.addNodo("B");
		Arco arcoAB = grafo.addArco(nodoA, nodoB, 10);
		System.out.println(grafo);
		System.out.println(grafo.buscarNodo("A"));
		
		//Dirigido y sin peso, busqueda BFS
		grafo = new Grafo(true, false, BusquedaGrafos.BFS);
		Nodo nodoC = grafo.addNodo("C");
		Nodo nodoD = grafo.addNodo("D");
		Arco arcoCD = grafo.addArco(nodoC, nodoD);
		System.out.println(grafo);
		System.out.println(grafo.buscarNodo("C"));
		
		//No dirigido y con peso, búsqueda DFS
		grafo = new Grafo(false, true, BusquedaGrafos.DFS);
		nodoA = grafo.addNodo("A");
		nodoB = grafo.addNodo("B");
		arcoAB = grafo.addArco(nodoA, nodoB, 10);
		System.out.println(grafo);
		System.out.println(grafo.buscarNodo("A"));
		
		//No dirigido y sin peso, sin búsqueda
		grafo = new Grafo(false, false);
		nodoC = grafo.addNodo("C");
		nodoD = grafo.addNodo("D");
		arcoCD = grafo.addArco(nodoC, nodoD);
		System.out.println(grafo);
		System.out.println(grafo.buscarNodo("C"));
	}
}
