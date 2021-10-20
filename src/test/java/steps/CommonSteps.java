package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import utils.Utilities;
import utils.driver.DriverManager;

public class CommonSteps extends Utilities {

    DriverManager driverManager = new DriverManager();

    @Before
    public void start(){driverManager.init();}

    @After
    public void kill(Scenario scenario){driverManager.kill(scenario);}

    @Given("Navigate to {}")
    public void getUrl(String url) {navigate(url);}

    @Given("Refresh the page")
    public void refresh() {
        refreshThePage();
    }

    @Given("Navigate browser {}")
    public void browserNavigate(String direction) {navigateBrowser(direction);}

    @Given("Wait {} seconds")
    public void wait(Double duration) {
        waitFor(duration);
    }
}
