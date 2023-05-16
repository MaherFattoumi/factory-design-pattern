package com.mf.factory.test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.mf.factory.EmployeeFactory;
import com.mf.factory.impl.Developer;
import com.mf.factory.impl.Manager;
import com.mf.factory.impl.Tester;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class EmployeeFactorySteps {
	private EmployeeFactory employeeFactory;
	private Manager manager;
	private Developer developer;
	private Tester tester;

	@Given("I have a employeeFactory")
	public void i_have_an_employeeFactory() {
		employeeFactory = new EmployeeFactory();
	}

	@When("I create an employee of type \"Manager\"")
	public void i_create_an_employee_of_type_manager() {
		manager = (Manager) employeeFactory.createEmployee("Manager");
	}
	
	@Then("I should get a Manager object")
	public void i_should_get_a_manager_object() {
		assertEquals("Manager", manager.getRole());
	}

	@When("I create an employee of type \"Developer\"")
	public void i_create_an_employee_of_type_developer() {
		developer = (Developer) employeeFactory.createEmployee("Developer");
	}

	@Then("I should get a Developer object")
	public void i_should_get_a_developer_object() {
		assertEquals("Developer", developer.getRole());
	}
		
	@When("I create an employee of type \"Tester\"")
	public void i_create_an_employee_of_type_tester() {
		tester = (Tester) employeeFactory.createEmployee("Tester");
	}

	@Then("I should get a Tester object")
	public void i_should_get_a_tester_object() {
		assertEquals("Tester", tester.getRole());
	}
	  
}