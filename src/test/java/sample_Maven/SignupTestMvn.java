package sample_Maven;

import org.testng.annotations.Test;

public class SignupTestMvn {
	@Test(groups = "smoke")
	public void signupByEmail() {
		System.out.println("this is login by email");
	}
	@Test(groups = "smoke")
	public void signupByFacebook() {
		System.out.println("this is login by facebook");
		
	}
	@Test(groups = "regression")
	public void signupByTwitter() {
		System.out.println("this is login by twitter");
		
	}

}

