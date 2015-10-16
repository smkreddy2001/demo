package demo.training;

public class JenkinsIntegration {
	public String sayHello(String helloString) {
		System.out.println("received : " + helloString);
		return "Demo " + helloString;
	}
}
