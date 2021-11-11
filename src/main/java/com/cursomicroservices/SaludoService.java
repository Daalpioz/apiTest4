package com.cursomicroservices;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
	public String saludo() {
		return "Saludo, Mock";
	}
}
