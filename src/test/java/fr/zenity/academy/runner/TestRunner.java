package fr.zenity.academy.runner;


//import fr.zenity.academy.listeners.ExtentReportListener;
import fr.zenity.academy.pageObjects.Experience;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;

@CucumberOptions(
        features = "./src/test/resources/features",
        glue = {"fr.zenity.academy.stepDefinitions", "fr/zenity/academy/pageObjects", "fr/zenity/academy/listeners"},
        plugin = {
                "pretty",
                "html:target/reports/html/htmlreport",
                "json:target/reports/jsonreports/index.json",
                "junit:target/reports/xmlreport.xml",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        },
        monochrome = true,
        dryRun = false
        //tags = ("@subscription")
)
public class TestRunner extends BaseRunner{
        /*static TestNG testNg;
        public static void main(String[] args) {

                ExtentReportListener ext = new ExtentReportListener();

                testNg = new TestNG();

                testNg.setTestClasses(new Class[] {Experience.class});
                testNg.addListener(ext);
                testNg.run();
mvn test -Dcucumber.options="src/test/resources/features/experience.feature" -Dcucumber.options="--tags @Subscription"

        }*/
}
