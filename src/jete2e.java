
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class jete2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
        
        driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms")).click();
        System.out.println (driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms")).isEnabled());
        driver.findElement(By.cssSelector("input.css-1cwyjr8")).click();
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip'])[10]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[11]")).click();
        driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div:nth-child(1) div:nth-child(1) div:nth-child(3) div:nth-child(3) div:nth-child(6) div:nth-child(1) div:nth-child(1)")).click();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
        Thread.sleep(2000);
        for(int i=1;i<4;i++)
        {
          driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
        }
        driver.findElement(By.cssSelector(".css-1dbjc4n")).click();
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73'])[3]")).click();
        driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
        

	}
}