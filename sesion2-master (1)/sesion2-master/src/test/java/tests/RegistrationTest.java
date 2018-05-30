package tests;

import org.junit.Test;

import app.Endpoints;

import org.junit.Assert;
import org.junit.Ignore;

public class RegistrationTest extends BaseTest{

	public RegistrationTest() {
		super(Endpoints.Registration,"chrome");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void execute() 
	{
		page.RegistrationPage obj = new page.RegistrationPage(this.getDriver());
		Assert.assertTrue(obj.registration());
	}
}
