package stepDefinition;

import cucumber.api.java.en.Given;

public class StepDefinition {

    @Given("This is first test for (.*) project")
    public void func(String name){

        System.out.println("This Project name is " + name);
    }
}
