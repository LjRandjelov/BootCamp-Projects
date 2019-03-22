import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumm2 {

	public static void main(String[] args) {
		/* Launch new Browser
		 2. Open http://newtours.demoaut.com/
		 3. Click on Register link using “driver.findElement(By.id(“<pronaci id u DOM-u>”)).click();“
		 4. Come back to Home page (Use ‘Back’ command)
		 5. Again go back to Registration page (This time use ‘Forward’ command)
		 6. Again come back to Home page (This time use ‘To’ command)
		 7. Refresh the Browser (Use ‘Refresh’ command)
		 8. Close the Browser*/
		 
		WebDriver driver = new ChromeDriver();
		try {
		driver.get(ConfigSel2.stranica);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(ConfigSel2.stranica);
		driver.navigate().refresh();
		}catch (Exception ex) {
			System.out.println(ex.toString());
        } finally {
		driver.quit();
        }
	}

}
