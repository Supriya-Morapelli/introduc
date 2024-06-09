import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
		  //WebDriver driver=new FirefoxDriver();
		  //WebDriver driver=new EdgeDriver();
		  String name="Supriya";
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	      String Pass=getPassword(driver);
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      driver.findElement(By.id("inputUsername")).sendKeys(name);
	      driver.findElement(By.name("inputPassword")).sendKeys(Pass);
	      driver.findElement(By.className("submit")).click();
	      Thread.sleep(1000);
	      System.out.println(driver.findElement(By.tagName("p")).getText());
	      Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	      Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
          driver.findElement(By.xpath("//*[text()='Log Out']")).click();
          }
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
	      Thread.sleep(1000);
	     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	     String PasswordText=driver.findElement(By.cssSelector("form p")).getText();
	     //Please use temporary password 'rahulshettyacademy' to Login.
	     String[] PasswordArray1=PasswordText.split("'");
	     //oth index=please use temporary password
	     //1st index=rahulshettyacademy' to login
	    // String[] PasswordArray2=PasswordArray1[1].split("'");
	   //  PasswordArray2[0]; instead use below single line
	    String Password= PasswordArray1[1].split("'")[0];
	    return Password;
	     
		
		
	}
}
