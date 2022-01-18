package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controladora {
	
	@Value("${offers.discount:35%}")
	private String discount;
	
	@GetMapping
	public String viewDiscounts() {
		return "La oferta de descuento es: "+this.discount;
	}
}
