package test;

import org.testng.annotations.Test;

public class day3 {

	@Test
	public void Demo3()
	{
		System.out.println("hello3");
	}
//TestNG path: Test Suite->TestFolder(has classes tag)->Testcase(have class tag)
	@Test(groups= {"Smoke"})
	public void SecondDemo3() {
		System.out.println("bybe3");
	}
}
