package listeners;

import org.testng.*;
import org.testng.internal.TestNGMethodFinder;
import reports.ReportClass;

import java.io.File;
import java.util.Arrays;

public class NGListeners implements ITestListener, ISuiteListener, IInvokedMethodListener {

    TestNGMethodFinder testNGCucumberRunner;
    public void onStart(ITestContext context) {

        System.out.println("Method Name : "+context.getName());
        File to = new File("C:\\Users\\pkhare\\.jenkins\\workspace\\CucumberWithTestngWithoutReport\\allure-results\\");
        ReportClass.deleteDirectory(to);
    }

    public  void onFinish(ISuite suite) {
        ReportClass.moveallureresult();
    }


}
