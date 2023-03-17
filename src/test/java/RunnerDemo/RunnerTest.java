package RunnerDemo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {}, features = "C:\\Users\\Shani.Kumar\\Downloads\\serenity-junit-starter-master\\Demoproject\\src\\test\\resources\\Feature\\Login.feature", glue = "StepDefination")

public class RunnerTest {
}
