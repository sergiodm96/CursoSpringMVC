package es.sergio.SeguridadSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String muestraInicio() {
		
		
		return "inicio";
	}
}
