package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

    Produto p;

    @Before
    public void setUp() {
        p = new Produto("Ford Ka", 20000.0);
    }

    @Test
    public void precoComImpostoTest() {
        assertEquals(22000.0, p.precoComImposto(), 0.001);
    }

    @Test
    public void gettersTest(){
        assertEquals("Ford Ka", p.getNome());
        assertEquals(20000.0, p.getPreco(), 0.001);
        assertEquals("comida", p.getCategoria());
        assertEquals("Produto: Ford Ka Preço: 20000.0 Categoria: comida", p.toString());
    }

}