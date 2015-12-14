package playStorePackage;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Run {
	
	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { ReadDataFromExcel.class });
		testng.addListener(tla);
		testng.run();
	}

}
