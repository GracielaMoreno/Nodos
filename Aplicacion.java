package listasEnlazadas;

public class Aplicacion {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		System.out.println("LISTA ENLAZADAS \n");


		lista.agregarAlInicio(3);

		lista.agregarAlFinal(17);
		lista.agregarAlFinal(12);
		lista.agregarAlInicio(20);
		lista.agregarAlFinal(18);

		System.out.println(" Lista ");
		lista.listar();
		
		/////tamaño
		System.out.println("\n\n Tamaño ");
		System.out.println(lista.getTam());
		
		/////obtener el dato
		System.out.println("\nObtener el dato del nodo en la posicion 4 ");
		System.out.println(lista.getDato(4));
		
		///consultar
		System.out.println("\nConsulta si existe el dato 56");
		System.out.println(lista.buscar(56));
		System.out.println("\nConsulta la posicion del dato 17");
		System.out.println(lista.getPosicion(17));
		
		////eliminar la lista
		System.out.println("\nEliminar lissta");
		lista.eliminar();
		
		////consulta si ta vacia
		System.out.println("\nConsulta si la lista está vacia");
		System.out.println(lista.esVacia());
		System.out.println("fin de programa");
	}  
}
