package br.com.uol.test.tests;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@ContextConfiguration("classpath:test-app-context.xml")
public class AlteracaoTextoTest {
	
	private String valor;
	
	@Dado("^um texto qualquer \"(.*?)\"$")
	public void input(final String valor) {
	    this.valor = valor;
	}
	
	@Quando("^o processo for executado$")
	public void process(){
		this.valor = this.valor + "!";
	}
	
	@Entao("^o texto sera alterado para \"(.*?)\"$")
	public void result(final String valor){
		Assert.assertEquals(this.valor, valor);
	}
}
