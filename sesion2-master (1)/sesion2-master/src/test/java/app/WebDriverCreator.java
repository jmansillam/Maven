package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//creacion de los webdriver
public class WebDriverCreator {

	public static WebDriver  getChromeDriver()
	{
		// Estamos asignando al Driver la propiedad de ruta
		// webdriver.chrome.driver
		String path = DataReaders.getPath("libraries\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",path);
		return new ChromeDriver();
	}
	
	public static WebDriver  getFirefoxDriver()
	{
		// Estamos asignando al Driver la propiedad de ruta
		// webdriver.gecko.driver
		String path = DataReaders.getPath("libraries\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",path);
		return new FirefoxDriver();
	}
	
}
