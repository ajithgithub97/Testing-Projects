package retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class FailedRetry implements IRetryAnalyzer,IAnnotationTransformer{
	
int maxretry = 0;
	@Override
	public boolean retry(ITestResult result) {
		if (maxretry <1) {
			maxretry++;
			return true;
		}
		return false;
	}
@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	annotation.setRetryAnalyzer(FailedRetry.class);
	}
}
