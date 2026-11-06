package patrones;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PatronesTest {
	@Test void adapterPooCumpleContrato() {
		patrones.adapter.poo.Impresora x = new patrones.adapter.poo.AdaptadorImpresora(new patrones.adapter.poo.ImpresoraAntigua());
		assertDoesNotThrow(() -> x.imprimir("prueba"));
	}

	@Test void adapterAopCumpleContrato() {
		patrones.adapter.aop.Impresora x = new patrones.adapter.aop.ImpresoraAntigua();
		assertDoesNotThrow(() -> x.imprimir("prueba"));
	}

	@Test void singletonPooEsUnico() {
		assertSame(patrones.singleton.poo.Configuracion.getInstance(), patrones.singleton.poo.Configuracion.getInstance());
	}

	@Test void singletonAopEsUnico() {
		assertSame(patrones.singleton.aop.Configuracion.getInstance(), patrones.singleton.aop.Configuracion.getInstance());
	}

	@Test void singletonAopComparteEstado() {
		var uno = patrones.singleton.aop.Configuracion.getInstance();
		uno.setIdioma("en");
		assertEquals("en", patrones.singleton.aop.Configuracion.getInstance().getIdioma());
	}
}
