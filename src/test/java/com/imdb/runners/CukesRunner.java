package com.imdb.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    //  *    specifying to run it with cucumber
@RunWith(Cucumber.class)

    //  *    providing option for cucumber to provide
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},     // * what kind of report you want to get and other options  | plugins = Cucumber HTML Report path here
        features = "src/test/resources/features",   // * where is your feature file                             | features = " feature file folder path here "
        glue = "com/imdb/step_definitions",         // * where is the code that match the steps in cucumber     |glue = " step definitions folder path here "
        dryRun = false,         // * whether to run the actual code or just to check if you have missing steps  | dryRun = true/false
        tags = "@imdb"          // * which scenarios or features you want to run                                | tags = @something
                                 /*     it is another cucumber option, that allows you to run certain scenarios
                                        You are labeling the scenario you want to run with @tag then in cukesRunner you are using same
                                        tag to run that scenario    */
)

public class CukesRunner {

}
