import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class SupriyaHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.findElement(By.cssSelector("button[class*='bstack-mm-btn-products']")).click();
        driver.findElement(By.xpath("(//a[@title='Test Management'])[1]")).click();
        System.out.println(driver.getTitle());
        if(driver.getTitle().equalsIgnoreCase("BrowserStack Test Management"))
        		{
        	       Assert.assertTrue(true);
        	       System.out.println("passed");
        		}
        else
        {
        	Assert.assertTrue(false);
        	System.out.println("failed");
        }
        driver.close();
	}

}
