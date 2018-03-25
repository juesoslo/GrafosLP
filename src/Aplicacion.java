import basicos.Arco;
import basicos.Grafo;
import basicos.Nodo;

public class Aplicacion {
	public static void main(String[] args) {
		
		//Dirigido y con peso
		Grafo grafo = new Grafo(true, true);
		Nodo nodoA = grafo.addNodo("A");
		Nodo nodoB = grafo.addNodo("B");
		Arco arcoAB = grafo.addArco(nodoA, nodoB, 10);
		System.out.println(grafo);
		
		//Dirigido y sin peso
		grafo = new Grafo(true, false);
		Nodo nodoC = grafo.addNodo("C");
		Nodo nodoD = grafo.addNodo("D");
		Arco arcoCD = grafo.addArco(nodoC, nodoD);
		System.out.println(grafo);
		
		//No dirigido y con peso
		grafo = new Grafo(false, true);
		nodoA = grafo.addNodo("A");
		nodoB = grafo.addNodo("B");
		arcoAB = grafo.addArco(nodoA, nodoB, 10);
		System.out.println(grafo);
		
		//No dirigido y sin peso
		grafo = new Grafo(false, false);
		nodoC = grafo.addNodo("C");
		nodoD = grafo.addNodo("D");
		arcoCD = grafo.addArco(nodoC, nodoD);
		System.out.println(grafo);
	}
}
