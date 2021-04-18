package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public String somar(@PathVariable Integer a, @PathVariable Integer b) {
		return (a + b) + "";
	}
	
	@GetMapping("/subtrair")
	public String subtrair(@RequestParam Integer a, @RequestParam Integer b) {
		return (a - b) + "";
	}
}
