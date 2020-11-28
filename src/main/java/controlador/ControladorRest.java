package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import modelo.Empleados;
import servicio.EmpleadoServicio;
import servicio.OficinaServicio;

@RestController
public class ControladorRest {
	@Autowired
	EmpleadoServicio emp;
	
	@Autowired
	OficinaServicio ofi;
	
	@GetMapping(value="/vendedoresjson", headers = "Accept=application/json")
	public List<Empleados> getEmp(){
		List<Empleados> listavend = new ArrayList<>();
		List<Empleados> listaempleados= emp.getAllEmpleados();
		
		for(int i=0;i<listaempleados.size();i++) {
			if(listaempleados.get(i).getPuesto().equals("Sales Rep")) {
				listavend.add(listaempleados.get(i));
			}
		}
		
		return listavend;
	}
}
