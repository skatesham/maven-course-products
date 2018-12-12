package br.com.alura.maven;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Empresa {
	
	private String nome;
	private String cnpj;

}