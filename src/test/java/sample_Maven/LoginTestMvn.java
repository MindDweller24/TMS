package sample_Maven;

import org.testng.annotations.Test;

public class LoginTestMvn {
	@Test(groups = "smoke")
	public void loginByEmail() {
		System.out.println("this is login by email");
	}
	@Test(groups = "sanity")
	public void loginByFacebook() {
		System.out.println("this is login by facebook");
		
	}
	@Test(groups = "regression")
	public void loginByTwitter() {
		System.out.println("this is login by twitter");
		
	}

}

