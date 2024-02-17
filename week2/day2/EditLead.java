package weekend.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Comp003");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName003");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LName003");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FNameL003");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DNameL003");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc003");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shyamsekar87@gmail.com");
		Select drpdwn_state=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpdwn_state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'updateLeadForm')]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Imp001");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String result_title = driver.getTitle();
		System.out.println(result_title);
		driver.close();
	}

}
