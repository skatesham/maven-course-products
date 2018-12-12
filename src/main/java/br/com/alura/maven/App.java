package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

    	
    	// Produtos
        Produto produto = new Produto("Ford Ka", 20000.0);
        System.out.println(produto);
        
        // Empresa
        Empresa empresa = new Empresa("GSW", "123");
        empresa.setCnpj("1234567890");
        System.out.println(empresa);
        
    }
}
