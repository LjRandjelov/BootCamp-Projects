import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReg {

	public static void main(String[] args) {
		/*
		 * 1. Otici na http://www.newtours.demoaut.com 2. Kliknuti na register 3.
		 * Popuniti formu 4. kliknuti na submit
		 */
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(ConfigSelReg.stranica);
			WebElement register = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
			register.click();
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
			firstName.click();
			firstName.sendKeys("Neki");
			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
			lastName.click();
			lastName.sendKeys("Neko");
			WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
			phone.click();
			phone.sendKeys("1239809");
			WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));
			email.click();
			email.sendKeys("neki.neko@nesto.com");
			WebElement adress = driver.findElement(By.xpath("//input[@name='address1']"));
			adress.click();
			adress.sendKeys("Neka adresa");
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			city.click();
			city.sendKeys("Grad");
			WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
			state.click();
			state.sendKeys("Drzava");
			WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
			postalCode.click();
			postalCode.sendKeys("11229");
			WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
			user.click();
			user.sendKeys("lala");
			WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
			pass.click();
			pass.sendKeys("password");
			WebElement passConf = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			passConf.click();
			passConf.sendKeys("password");
			WebElement submit = driver.findElement(By.xpath("//input[@name='register']"));
			submit.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {

			driver.quit();
		}
	}

}
