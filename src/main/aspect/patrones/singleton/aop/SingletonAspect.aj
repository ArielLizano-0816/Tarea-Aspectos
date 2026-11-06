package patrones.singleton.aop;

//Lo que permite privileged es que el aspecto pueda invocar el constructor privado.
public privileged aspect SingletonAspect {
	
	//Aqui se usa un solo objeto por classloader inicializado de manera segura por JVM.
	private static final Configuracion UNICA = new Configuracion();
	
	//Se añade getInstance() a Configuracion sin modificar su código fuente.
	public static Configuracion Configuracion.getInstance() {
		return SingletonAspect.UNICA;
	}
}
