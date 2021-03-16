package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
//TestNG path: Test Suite->TestFolder(has classes tag)->Testcase(have class tag)
	
// one line in xml you can use slash at the end,
// if it is more than one line you have to use whole name to close it	
//<method>
//<exclude name="sth.*/> it can exclude all test case start with that sth you defined	
// there is package tag which will be used for regression test, it will run all the codes in that package	
// the beforemethod will run every method, beforetest only run once before test. 
	//beforemethod is for class level, beforetest is for testng level
	
	@AfterSuite
	 
	@Test
	public void SecondDemo() {
		
	}
}
