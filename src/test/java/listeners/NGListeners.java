package listeners;

import org.testng.*;
import org.testng.internal.TestNGMethodFinder;
import reports.ReportClass;

public class NGListeners implements ITestListener, ISuiteListener, IInvokedMethodListener {

    TestNGMethodFinder testNGCucumberRunner;
    public void onStart(ITestContext context) {

        System.out.println("Method Name : "+context.getName());
    ;
//        System.out.println("Method Name : "+testNGCucumberRunner.);

    }

    public  void onFinish(ISuite suite) {
        ReportClass.moveallureresult();
    }


}
