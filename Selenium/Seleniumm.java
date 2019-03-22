import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Launch a new web browser 2. Open http://newtours.demoaut.com/ 3. Get Page
		 * Title name and Title length 4. Print Page Title and Title length on the
		 * Eclipse Console 5. Get Page URL and verify if the it is a correct page opened
		 * 6. Get Page Source (HTML Source code) and Page Source length 7. Print Page
		 * Length on Eclipse Console 8. Close the browser
		 */

		WebDriver wb = new ChromeDriver();
		wb.get("http://newtours.demoaut.com/");
		wb.getTitle();
		wb.getTitle().length();
		System.out.println("Title " + wb.getTitle() + wb.getTitle().length());
		wb.getCurrentUrl();
		if (wb.getCurrentUrl().equals("http://newtours.demoaut.com/"))
			System.out.println("Sajtovi se slazu");
		else
			System.out.println("Sajtovi se ne slazu");
		wb.getPageSource().length();
		System.out.println("Page source length is: " + wb.getPageSource().length());
		wb.close();

	}

}
