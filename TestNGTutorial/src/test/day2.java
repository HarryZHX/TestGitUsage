package test;

import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void Demo2()
	{
		System.out.println("hello2");
	}
//TestNG path: Test Suite->TestFolder(has classes tag)->Testcase(have class tag)
	@Test
	public void SecondDemo2() {
		System.out.println("bybe2");
	}
}
