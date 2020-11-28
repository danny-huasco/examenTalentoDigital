package servicio;

import java.util.List;
import modelo.Oficinas;

public interface OficinaServicio {
	List<Oficinas> getAllOficinas();
	Oficinas getOficinaByCod(String cod);
}
