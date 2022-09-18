package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import listeners.NGListeners;
import org.testng.annotations.Listeners;


@CucumberOptions(glue={"demo.stepDefinitions"},
        features = {"src/test/resources/Feature"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
       // tags = ("@Regression")

)
@Listeners(listeners.NGListeners.class)
public class TestLocalRunner extends AbstractTestNGCucumberTests {

}
