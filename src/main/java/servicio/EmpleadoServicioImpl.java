package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Empleados;
import modelo.IEmpleadosRepo;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio{
	@Autowired
	IEmpleadosRepo emp;

	@Override
	public List<Empleados> getAllEmpleados() {
		return (List<Empleados>) emp.findAll();
	}

	@Override
	public Empleados getEmpleadoById(int id) {
		return emp.findOne(id);
	}

}
