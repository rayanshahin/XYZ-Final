package manager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	WebDriver driver = new ChromeDriver() ; 
	String HomePage = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	String[] myListOfFirstName = { "rayan", "hala", "zina", "anas", };

	int randomOne = (int) (Math.random() * myListOfFirstName.length - 1);

	String[] myListOfLastName = { "omar", "mahmoud", "shahin", "enas", };

	int randomTwo = (int) (Math.random() * myListOfLastName.length - 1);
	String Currency="Dollar";
	String SearchCustomer="Harry";
	
	SoftAssert myAssertion = new SoftAssert();
	@BeforeTest
	public void setup() {
		driver.get(HomePage);

		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 

	}
}
