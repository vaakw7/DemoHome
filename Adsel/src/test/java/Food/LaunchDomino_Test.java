package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchDomino_Test {
	@Test
	public void Domino()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.dominos.com/en/");
		driver.close();
	}
	
}
