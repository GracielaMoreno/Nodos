package listasEnlazadas;

public class Nodo {

	private int dato;
	private Nodo siguiente;
	public void Nodo(){
		this.dato = 0;
		this.siguiente = null;
	}

	///////getters y setterss 
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}   
}
