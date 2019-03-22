import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ljilja.randjelov@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(ConfigPass.pass);
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		driver.quit();

	}

}
