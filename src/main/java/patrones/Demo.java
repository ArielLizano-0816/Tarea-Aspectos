package patrones;

public class Demo {

	public static void main(String[] args) {
		System.out.println("=== ADAPTER POO ===");
		patrones.adapter.poo.Impresora p = new patrones.adapter.poo.AdaptadorImpresora(new patrones.adapter.poo.ImpresoraAntigua());
		p.imprimir("Documento universitario");

		System.out.println("=== ADAPTER AOP ===");
		patrones.adapter.aop.Impresora a = new patrones.adapter.aop.ImpresoraAntigua();
		a.imprimir("Documento universitario");

		System.out.println("=== SINGLETON POO ===");
		var s1 = patrones.singleton.poo.Configuracion.getInstance();
		var s2 = patrones.singleton.poo.Configuracion.getInstance();
		System.out.println("Misma instancia: " + (s1 == s2));

		System.out.println("=== SINGLETON AOP ===");
		var a1 = patrones.singleton.aop.Configuracion.getInstance();
		var a2 = patrones.singleton.aop.Configuracion.getInstance();
		System.out.println("Misma instancia: " + (a1 == a2));
	}
}
