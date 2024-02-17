package weekend.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Shyam001");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		Select drpdwn_industry=new Select(driver.findElement(By.name("industryEnumId")));
		drpdwn_industry.selectByVisibleText("Computer Software");
		Select drpdwn_ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
		drpdwn_ownership.selectByVisibleText("S-Corporation");
		Select drpdwn_dataSource=new Select(driver.findElement(By.name("dataSourceId")));
		drpdwn_dataSource.selectByValue("LEAD_EMPLOYEE");
		Select drpdwn_marketing=new Select(driver.findElement(By.name("marketingCampaignId")));
		drpdwn_marketing.selectByIndex(5);
		Select drpdwn_state=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		drpdwn_state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		driver.close();
		
	}

}
