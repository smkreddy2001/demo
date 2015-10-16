package unittesting.demo.training;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.training.JenkinsIntegration;

public class JenkinsIntegrationUnitTest {

	@Test
	public void testSayHello() {
		JenkinsIntegration testClass = new JenkinsIntegration();
		String helloString = "Reddy";
		String results =testClass.sayHello(helloString);
		assertTrue(results.startsWith("Demo"));
	}

}
