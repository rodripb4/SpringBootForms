package com.bolsaideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsaideas.springboot.form.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jhon");
		usuario.setApellidos("Doe");
		usuario.setId("123.456.789-K");
		model.addAttribute("titulo","Formulario usuarios");
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result ,Model model, SessionStatus status) {
		
		model.addAttribute("titulo","Resultado form");
		
		// Validamos si el form tiene errores
		if(result.hasErrors()) {
			/* Creamos un map de errores
			Map<String, String> errores = new HashMap<>();
			// Obtenemos todos los errores e iteramos
			result.getFieldErrors().forEach(err -> {
				errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
			});
			// Creamos un modelo para mostrar los errores que nos aparecen
			model.addAttribute("error", errores);*/
			return "form";
		}
		model.addAttribute("usuario",usuario);
		status.setComplete();
		return "resultado";
	}
}
