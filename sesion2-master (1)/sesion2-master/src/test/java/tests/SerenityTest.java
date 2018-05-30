package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import app.DataReaders;
import app.WebDriverCreator;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityTest {

	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	steps.LoginSteps pasos;

	@Test
	@Title("LOGIN PAGE")
	public void _loginTest() 
	{ 
		pasos.gotoLogin(driver);
		pasos.setusername(driver);
		pasos.setpass1(driver);
		pasos.setpass2(driver);
		pasos.submit(driver);

	}
	
	@Before
	public void before() 
	{
		driver = WebDriverCreator.getChromeDriver();
	}
	
	@After
	public void after() 
	{
		driver.close();
		driver.quit();
	}
	
	
}
