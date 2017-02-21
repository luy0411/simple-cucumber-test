package br.com.uol.test.suite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue="br.com.uol.test",
				 features="src/test/resources/features",
				 name={"Imprime Beans"})
public class CucumberSuiteTest {

}
