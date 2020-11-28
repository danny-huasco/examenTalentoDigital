package servicio;

import java.util.List;
import modelo.Oficinas;
import modelo.IOficinasRepo;

public class OficinaServicioImpl implements OficinaServicio{
	
	IOficinasRepo ofi;

	@Override
	public List<Oficinas> getAllOficinas() {
		return (List<Oficinas>) ofi.findAll();
	}

	@Override
	public Oficinas getOficinaByCod(String cod) {
		return ofi.findOne(cod);
	}

}
