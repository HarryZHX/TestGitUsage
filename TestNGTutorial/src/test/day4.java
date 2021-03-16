package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void Demo4(String urlname)
	{
		System.out.println(urlname);
	}
//TestNG path: Test Suite->TestFolder(has classes tag)->Testcase(have class tag)
	@Test
	public void ASecondDemo4() {
		System.out.println("bybe4");
	}
}
