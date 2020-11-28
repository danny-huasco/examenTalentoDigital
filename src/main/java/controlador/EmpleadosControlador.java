package controlador;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Empleados;
import servicio.EmpleadoServicio;

@Controller
public class EmpleadosControlador {
	
	@Autowired
	EmpleadoServicio servemp;
	
	static Logger log = Logger.getLogger(EmpleadosControlador.class.getName());
	
	// vista de listado principal
	@RequestMapping({"/","index"})
	public String getListaEmpleados(Model m) {
		List<Empleados> listamanager = new ArrayList<>();
		List<Empleados> listavend = new ArrayList<>();
		List<Empleados> listaempleados= servemp.getAllEmpleados();
		
		for(int i=0;i<listaempleados.size();i++) {
			if(listaempleados.get(i).getPuesto().equals("Sales Rep")) {
				listavend.add(listaempleados.get(i));
			}
			if(listaempleados.get(i).getPuesto().contains("Sales Manager")) {
				listamanager.add(listaempleados.get(i));
			}
		}
		m.addAttribute("listemp", listavend);
		m.addAttribute( "listman", listamanager);
		log.info("recuperando lista de vendedores y managers");
		return "index";
	}
	
	//buscar vendedores con filtros
	@RequestMapping("/filtros")
	public String getFiltros(@RequestParam("codofi")String codOfi, @RequestParam("idManager") int idManager, Model m) {
		//busqueda compuesta
		
		return null;
	}
	
	
}
