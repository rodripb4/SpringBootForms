package com.bolsaideas.springboot.form.app.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface Requerido {
	
	String message() default "el campo es requerido - usando anotaciones";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
