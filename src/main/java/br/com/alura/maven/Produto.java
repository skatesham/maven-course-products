package br.com.alura.maven;

public class Produto {

	private String nome;
	private double preco;
	private String categoria = "comida";

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.categoria = "comida";
	}

	public String getNome(){
		return this.nome;
	}

	public double getPreco(){
		return this.preco;
	}

	public String getCategoria(){
		return this.categoria;
	}

	@Override
	public String toString(){
		return "Produto: "+this.nome+" Preço: "+this.preco+" Categoria: "+this.categoria;
	}


}