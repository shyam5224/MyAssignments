package weekend.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9444647325");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'1 9444647325')]"));
		String act_leadID = driver.findElement(By.xpath("//*[text()='16071']")).getText();
		driver.findElement(By.xpath("//*[text()='16071']")).click();
		driver.findElement(By.xpath("//*[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(act_leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String exp_text="No records to display";
		String act_text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(act_text.equalsIgnoreCase(exp_text)) {
			System.out.println("Validation successfull");
		}
		driver.close();		

	}

}
