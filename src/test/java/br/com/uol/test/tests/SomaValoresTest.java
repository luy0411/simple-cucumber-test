package br.com.uol.test.tests;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@ContextConfiguration("classpath:test-app-context.xml")
public class SomaValoresTest {
	
	private Integer a;
	private Integer b;
	private Integer resultado;
	
	@Dado("^um valor <(\\d+)> e um valor <(\\d+)>$")
	public void input(final int a, final int b) {
	    this.a = a;
	    this.b = b;
	}
	
	@Quando("^o processo de soma for executado$")
	public void process(){
		this.resultado = this.a + this.b;
	}
	
	@Entao("^o <(\\d+)> devera ser exibido$")
	public void result(final Integer resultado){
		Assert.assertEquals(this.resultado, resultado);
	}
}
