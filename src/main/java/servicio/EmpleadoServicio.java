package servicio;

import java.util.List;
import modelo.Empleados;

public interface EmpleadoServicio {
	
	List<Empleados> getAllEmpleados();
	Empleados getEmpleadoById(int id);
	
}
