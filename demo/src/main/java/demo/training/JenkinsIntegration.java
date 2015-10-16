package demo.training;

public class JenkinsIntegration {
	public String sayHello(String helloString) {
		System.out.println("received : " + helloString);
		return "Demo " + helloString;
	}
	public String sayHello() {
		String helloString = "hello";
		System.out.println(" Saying : "+ helloString);
		return helloString;
	}

}
