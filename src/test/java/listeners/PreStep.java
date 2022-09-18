package listeners;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class PreStep {

    private Scenario scenario;
    @Before
    public void before(Scenario scenario) {

       String snNa= scenario.getName();




    }
}
