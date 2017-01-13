package listasEnlazadas;

public class Lista {

	private Nodo head;
	private int tam;
	public void Lista(){
		head = null;
		tam = 0;
	}
	/////////////VACIA
	public boolean esVacia(){
		return head == null;
	}
	//////////tamaño
	public int getTam(){
		return tam;
	}
///AGREGA AL INICIO
	public void agregarAlInicio(int dato){
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		if (esVacia()) {
			head = nuevo;
		}
		else{
			nuevo.setSiguiente(head);
			head = nuevo;
		}		tam++;
	}

	public void insrtarPorReferencia(int referencia, int dato){
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		if (!esVacia()) {
			if (buscar(referencia)) {
				Nodo aux = head;
				while (aux.getDato() != referencia) {
					aux = aux.getSiguiente();
				}
				Nodo siguiente = aux.getSiguiente();
				aux.setSiguiente(nuevo);
				nuevo.setSiguiente(siguiente);
				tam++;
			}
		}
	}

	public void insrtarPorPosicion(int posicion, int dato){

		if(posicion>=0 && posicion<=tam){
			Nodo nuevo = new Nodo();
			nuevo.setDato(dato);
			if(posicion == 0){
				nuevo.setSiguiente(head);
				head = nuevo;
			}
			else{

				if(posicion == tam){
					Nodo aux = head;
					while(aux.getSiguiente() != null){
						aux = aux.getSiguiente();
					}

					aux.setSiguiente(nuevo);              
				}
				else{

					Nodo aux = head;
					for (int i = 0; i < (posicion-1); i++) {
						aux = aux.getSiguiente();
					}
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
			}
			tam++;
		}
	}

	

	public void agregarAlFinal(int dato){
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		if (esVacia()) {
			head = nuevo;
		} 
		else{
			Nodo aux = head;
			while(aux.getSiguiente() != null){
				aux = aux.getSiguiente();
			}	aux.setSiguiente(nuevo);
		}
		tam++;
	}
	

	public boolean buscar(int referencia){
		Nodo aux = head;
		boolean encontrado = false;
		while(aux != null && encontrado != true){
			if (referencia == aux.getDato()){
				encontrado = true;
			}
			else{

				aux = aux.getSiguiente();
			}
		}
		return encontrado;
	}

	public int getPosicion(int referencia) {
		if (buscar(referencia)) {
			Nodo aux = head;
			int cont = 0;
			while(referencia != aux.getDato()){
				cont ++;
				aux = aux.getSiguiente();
			}
			return cont;
		}
		else {
			return referencia;
		}
	}

	public int getDato(int posicion){
		if(posicion>=0 && posicion<tam){
			if (posicion == 0) {
				return head.getDato();
			}else{
				Nodo aux = head;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getDato();
			}
		}else {
			return posicion;
		}
	}


	public void eliminar(){
		head = null;
		tam = 0;
	}

	public void listar(){

		if (!esVacia()) {
			Nodo aux = head;
			int i = 0;
			while(aux != null){
				System.out.print(i+".\t"+ aux.getDato() + "\n");
				aux = aux.getSiguiente();
				i++;
			}
		}
	}
}
