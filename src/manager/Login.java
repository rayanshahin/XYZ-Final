package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends Parameters {
	@Test(priority = 1)
	public void LoginAsCustomer() {

		driver.get(HomePage);

		WebElement CustomerLoginButton = driver	.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
        CustomerLoginButton.click();
        WebElement AddCustomer = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
        AddCustomer.click();
        
		WebElement myInputForTheFirstName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		myInputForTheFirstName.sendKeys(myListOfFirstName[randomOne]);
		
		WebElement myInputForTheLastName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));

		myInputForTheLastName.sendKeys(myListOfLastName[randomTwo]);
		

		int PostalCodeRandomNumber = (int) (Math.random() * 10000);

		String PostalCodeString = Integer.toString(PostalCodeRandomNumber);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
				.sendKeys(PostalCodeString);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		driver.switchTo().alert().dismiss();
		
		 
}
	
   @Test(priority=2)
   public void OpenAccountAsManager() {
	   
	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
		WebElement SelectCustomer= driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[7]"));
		SelectCustomer.click();
		WebElement TheSelectWebElementforTheCurrency = driver.findElement(By.xpath("//*[@id=\"currency\"]"));

		Select CurrencySelect = new Select(TheSelectWebElementforTheCurrency);

		CurrencySelect.selectByVisibleText(Currency);
		driver.findElement(By.xpath("//*[@id=\"currency\"]/option[2]")).click();
		WebElement ProcessButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
		ProcessButton.click();
		driver.switchTo().alert().dismiss();
		
 }
   
  @Test(priority=3)
  public void Custumers() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
	  WebElement SearchCustomerAsManager= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input"));
	  SearchCustomerAsManager.click();
	  Thread.sleep(2000);
	  SearchCustomerAsManager.sendKeys(SearchCustomer);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")).click();
	  
  }
  





}
