package hooks;

import io.cucumber.java.*;

public class Hooks {
    private static boolean initialized = false;
    @Before("@sample1")
    public void beforeHooks(Scenario scenario) {
        System.out.println("Before Hooks --> " +scenario.getName());
        if (!initialized) {

            System.out.println("Runs only once");

            // initialization
            System.out.println("initialization");
            initialized = true;
        }
    }

    @After
    public void afterHooks(Scenario scenario) {
        System.out.println("After Hooks --> "+scenario.getName());
    }

//    @Before("@UPIFeature")
//    public void beforeScenarioSample1(Scenario scenario) {
//        System.out.println("Before ####featureTag###### Scenario --> " +scenario.getName());
//    }

//    @Before("@sample2")
//    public void beforeScenarioSample2(Scenario scenario) {
//        System.out.println("Before ####featureTag###### Scenario --> " +scenario.getName());
//    }

//    @BeforeAll
//    public void beforeAllHooks(Scenario scenario) {
//        System.out.println("Before All Hooks --> " +scenario.getName());
//    }
//
//    @AfterAll
//    public void afterAllHooks(Scenario scenario) {
//        System.out.println("After All Hooks --> " +scenario.getName());
//    }
//
//    @BeforeStep
//    public void beforeStepHooks(Scenario scenario) {
//        System.out.println("Before Step Hooks --> " +scenario.getName());
//    }
//
//    @AfterStep
//    public void afterStepHooks(Scenario scenario) {
//        System.out.println("After Step Hooks --> " +scenario.getName());
//    }

}
