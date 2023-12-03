package cl.ucn.felix.biblioteca.servicio.api;

public class ExcepcionSesionNoValidaTiempoEjecucion extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExcepcionSesionNoValidaTiempoEjecucion(String sesion) {
		super("La sesión " + sesion + " no es válida o ha expirado.");
	}
}
