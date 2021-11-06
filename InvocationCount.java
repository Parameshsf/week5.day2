package week5.day2;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=5)
	public void invoCount() {
		int count = 0;
		String empID = "Emp";
		String ID ="";
		for (int i = 0; i <=5 ; i++) {
			count = count + 1;
			ID = empID+count;
			System.out.println("The emp id "+ID);
		}
		
		
		
		
		
	}

}
