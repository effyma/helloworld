package backing;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import rest.test.TestService;

@Named
@ViewScoped
public class TestBacking implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hello = "Hello World!";
	
	TestService test=new TestService();
	
	private String sayHello= test.sayHello("hello").toString();

	public String getsayHello() {
		return sayHello;
	}
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
