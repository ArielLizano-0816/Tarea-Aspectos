package patrones.adapter.aop;

public aspect AdaptadorAspect {

	//Ahora la clase legacy pasa a cumplir la interfaz requerida sin editar su archivo
	declare parents: ImpresoraAntigua implements Impresora;
	
	//Ademas el método se introduce durante el weaving
	public void ImpresoraAntigua.imprimir(String mensaje) {
		imprimirTextoAntiguo(mensaje);
	}
}
