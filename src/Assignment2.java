import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("supriya");
        driver.findElement(By.cssSelector("input.ng-pristine")).sendKeys("supriya@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("supriya123");
        driver.findElement(By.id("exampleCheck1")).click();	
        WebElement StaticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
    	Select dropdown=new Select(StaticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();

		 driver.findElement(By.name("bday")).sendKeys("01-01-2001");
		 driver.findElement(By.cssSelector("input[value='Submit']")).click();
		 System.out.println(driver.findElement(By.cssSelector("div.alert-success")).getText());
	}

}
