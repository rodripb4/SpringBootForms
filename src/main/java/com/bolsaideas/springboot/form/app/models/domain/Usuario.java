package com.bolsaideas.springboot.form.app.models.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Usuario {
	
	//Comentario
	private String id;
	
	@NotEmpty(message = "El nombre no puede estar vacio")
	private String nombre;
	
	@NotEmpty
	private String apellidos;

	@NotEmpty
	@Size(min = 3, max = 8)
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	@Email(message = "El correo no tiene el formato adecuado")
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
