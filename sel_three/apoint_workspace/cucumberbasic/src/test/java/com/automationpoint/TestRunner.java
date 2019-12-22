package com.automationpoint;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
        features = {"src/test/resources/Features_TagEx/FeatureDataTableFileEx2.feature","src/test/resources/Features_TagEx/FeatureDataTableFileEx1.feature"},
       
       // 		 features = "src/test/resources/Features_TagEx,
        glue = {"com.automationpoint"},
        		
        plugin = {
              
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class TestRunner extends AbstractTestNGCucumberTests {

}
