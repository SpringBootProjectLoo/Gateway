package dev.luisfigueira.springbootapp.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

	@Autowired
	private Environment env;

	@GetMapping("/status/check")
	public String status() {
		return "Spring Boot Gateway " + env.getProperty("spring.application.name") + " working on port " + env.getProperty("local.server.port");
	}

}
