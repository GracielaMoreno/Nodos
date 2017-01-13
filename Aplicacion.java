package listasEnlazadas;

public class Aplicacion {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		System.out.println("LISTA ENLAZADAS \n");


		lista.agregarAlInicio(6);

		lista.agregarAlFinal(9);
		lista.agregarAlFinal(12);
		lista.agregarAlInicio(41);
		lista.agregarAlFinal(15);

		System.out.println(" Lista ");
		lista.listar();
		/////tamaño
		System.out.println("\n\n Tamaño ");
		System.out.println(lista.getTam());
		/////obtener el dato
		System.out.println("\nObtener el dato del nodo en la posicion 3 ");
		System.out.println(lista.getDato(3));
		////insertar en un siguiente
		System.out.println("\nInserta un nodo con dato 16 despues del 15");
		lista.insrtarPorReferencia(15, 16);
		lista.listar();
		System.out.print(" Tamaño: ");
		System.out.println(lista.getTam());

		System.out.println("\nInsrta un nodo con dato 44 en la posición 3");
		lista.insrtarPorPosicion(3, 44);
		lista.listar();
		System.out.print(" Tmaño: ");
		System.out.println(lista.getTam());
		/////cambiar popr nodo
		System.out.println("\nCambiar el dato 12 del tercer nodo por 13");
		lista.editarPorReferencia(12, 13);
		lista.listar();
		////cambiar por posicion
		System.out.println("\nCambiar el dato nodo en la posición 0 por 17");
		lista.editarPorPosicion(0, 17);
		lista.listar();
		/////elimina por el dayo
		System.out.println("\nElimina el nodo con el dato 41");
		lista.removerPorReferencia(41);        
		lista.listar();
		System.out.print("  Tamaño: ");
		System.out.println(lista.getTam());
		//////elimina por posicion
		System.out.println("\nElimina el nodo en la posición 4");
		lista.removerPorPos(4);        
		lista.listar();
		System.out.print("  Tamaño: ");
		System.out.println(lista.getTam());
		///consultar
		System.out.println("\nConsulta si existe el dato 30");
		System.out.println(lista.buscar(30));

		System.out.println("\nConsulta la posicion del dato 9");
		System.out.println(lista.getPosicion(9));
		////eliminar la lista
		System.out.println("\nEliminar lissta");
		lista.eliminar();
		////consulta si ta vacia
		System.out.println("\nConsulta si la lista está vacia");
		System.out.println(lista.esVacia());

	}  
}
