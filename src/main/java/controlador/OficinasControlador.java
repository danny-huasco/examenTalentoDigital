package controlador;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Oficinas;
import servicio.OficinaServicio;

@Controller
public class OficinasControlador {

	@Autowired
	OficinaServicio servOfi;
	
	static Logger log = Logger.getLogger(OficinasControlador.class.getName());
	
	//lista de oficinas para combobox
		@RequestMapping({"/","index"})
		public String getListaOficinas(Model m) {
			List<Oficinas> listaOfis= servOfi.getAllOficinas();
			
			m.addAttribute("listofi", listaOfis);
			log.info("recuperando lista de oficinas");
			return "index";
		}
	
}
