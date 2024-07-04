package pages;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class failedretry implements IRetryAnalyzer,IAnnotationTransformer  {
	int retrycount = 0;
	public boolean retry(ITestResult result) {
		
		if (retrycount <1) {
			retrycount++;
			return true;
		}
		
		return false;
	}
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(failedretry.class);
	}

}
