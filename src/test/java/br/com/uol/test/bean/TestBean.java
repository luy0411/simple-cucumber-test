package br.com.uol.test.bean;

import java.util.List;
import java.util.Map;

public class TestBean {

	private String id;
	private String name;
	private Integer age;
	private Tipo tipo;
	private List<String> variaveis;
	private Map<String, Object> map;

	public TestBean() {
	}
	
	public TestBean(final String id, final String name, final Integer age, final Tipo tipo,
			final List<String> variaveis, final Map<String, Object> map) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.tipo = tipo;
		this.variaveis = variaveis;
		this.map = map;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(final Integer age) {
		this.age = age;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(final Tipo tipo) {
		this.tipo = tipo;
	}

	public List<String> getVariaveis() {
		return variaveis;
	}

	public void setVariaveis(final List<String> variaveis) {
		this.variaveis = variaveis;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(final Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "TestBean [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public enum Tipo {
		A, B, C;
	}
}
