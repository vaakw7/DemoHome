package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchpizzahut_Test {

	@Test
	public void Domino()
	{
		WebDriver driver= new FirefoxDriver();
		System.getProperties("url");
		//driver.get("https://www.pizzahut.com/");
		driver.close();
	}
	
}
