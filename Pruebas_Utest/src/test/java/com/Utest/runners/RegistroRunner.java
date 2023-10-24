package com.Utest.runners;

import com.Utest.utils.BeforeSuite;
import com.Utest.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/com.Utest.features",
        tags = {"@CPLA001"},
        glue = "com.integra.ach.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistroRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles(".src/test/resources/com.Utest.features");
    }
}
