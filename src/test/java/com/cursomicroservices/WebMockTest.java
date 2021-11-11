package com.cursomicroservices;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SaludoController.class)
public class WebMockTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SaludoService service;
	
	@Test
	public void greetingShouldReturnMessageFromService() throws Exception{
		when(service.saludo()).thenReturn("Saludo, Mock");
		this.mockMvc.perform(get("/saludo")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Saludo, Mock")));
	}
}
