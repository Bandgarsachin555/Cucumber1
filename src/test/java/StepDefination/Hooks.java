package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void m1()
	{
		System.out.println("before anotation");
	}
	@After
	public void m2()
	{
		System.out.println("after anotation");
	}
}

