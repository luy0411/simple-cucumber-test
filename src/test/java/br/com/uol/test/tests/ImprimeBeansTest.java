package br.com.uol.test.tests;

import java.util.List;

import org.springframework.test.context.ContextConfiguration;

import br.com.uol.test.bean.TestBean;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@ContextConfiguration("classpath:test-app-context.xml")
public class ImprimeBeansTest {

	private List<TestBean> beans;
	
	@Dado("^que a base de dados sera limpa$")
	public void clean () {
		System.out.println("Base de dados limpa!");
	}
	
	@Quando("^o processo de insercao na fila for chamado com a lista de evento$")
	public void process (final List<TestBean> beans) {
		this.beans = beans;	
	}
	
	@Entao("^a lista sera impressa$")
	public void print() {
		for (final TestBean testBean : beans) {
			System.out.println(testBean.toString());
		}
	}
	
}
