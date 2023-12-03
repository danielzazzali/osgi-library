package cl.ucn.felix.biblioteca.servicio.impl.activador;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import cl.ucn.felix.biblioteca.servicio.api.ServicioInventarioLibro;
import cl.ucn.felix.biblioteca.servicio.api.ServicioInventarioLibroImpl;

public class ServicioImplActivador  implements BundleActivator {

	ServiceRegistration<ServicioInventarioLibro> reg = null;

	@Override
	public void start(BundleContext context) throws Exception {
		// Crear una instancia del servicio ServicioInventarioLibro
		ServicioInventarioLibro servicioInventarioLibro = new ServicioInventarioLibroImpl(context);

		// Registrar el servicio en el contexto del bundle
		reg = context.registerService(ServicioInventarioLibro.class, servicioInventarioLibro, null);

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// Cancelar el registro del servicio si está registrado
		if (reg != null) {
			reg.unregister();
			reg = null;
		}
	}

}
