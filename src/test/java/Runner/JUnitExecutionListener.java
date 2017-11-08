package test.java.Runner;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import automationframework.AutomationLog;
import automationframework.ScreenshotAndTestNgReporterListener;

public class JUnitExecutionListener extends RunListener{
	/**
	 *  Called when an atomic test fails.
	 *  https://howtodoinjava.com/junit/how-to-add-listner-in-junit-testcases/
	 * */
    @Override
    public void testFailure(Failure failure) throws java.lang.Exception{
        super.testFailure(failure);
        if (!failure.getDescription().isSuite()) {
        	ScreenshotAndTestNgReporterListener.customScreenshot();
        	AutomationLog.error("In Custom Failer Class of Junit");
            System.out.println("FAILED!!!!!"); //Here pass your screenshot capture event
        }
    	ScreenshotAndTestNgReporterListener.customScreenshot();
    	AutomationLog.error("In Custom Failer Class of Junit");
        System.out.println("FAILED!!!!!"); //Here pass your screenshot capture event
    }
/*	public void testFailure(Failure failure) 
	{
    	ScreenshotAndTestNgReporterListener.customScreenshot();
    	AutomationLog.error("In Custom Failer Class of Junit");
		System.out.println("Execution of test case failed : "+ failure.getMessage());
	}*/
}
