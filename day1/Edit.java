package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// to open the browser and launch the url
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		
		
		//to login the testleaf page
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    String text=driver.findElement(By.tagName("h2")).getText();
	    System.out.println(text);
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    //to Create  a new lead
	    
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();  
        
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
   	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
   	    
   	     driver.findElement(By.className("smallSubmit")).click();
		
		//to edit the created lead
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("swe");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kums");
		driver.findElement(By.className("smallSubmit")).click();
   	     

}}
