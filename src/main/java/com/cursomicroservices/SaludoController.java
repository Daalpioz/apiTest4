package com.cursomicroservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SaludoController {
	private final SaludoService service;
	
	public SaludoController(SaludoService service) {
		this.service = service;
	}
	
	@RequestMapping("/saludo")
	public @ResponseBody String saluda() {
		return service.saludo();
	}

}
