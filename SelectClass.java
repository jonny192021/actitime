package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		//to handle the  dropdown we use select class,we should have targeted element 'select'.
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));  
		WebElement year = driver.findElement(By.id("day")) ;
		
		Select s=new Select(day);
		Select m=new Select(month);
		Select y=new Select(year);
		s.selectByVisibleText("27");
		m.selectByVisibleText("Apr");
		y.selectByVisibleText("1999");
//		if (s.isMultiple()) {
//			System.out.println("True:it is multi list");
//		}
//		else {
//			System.out.println("False:it is single list");
//		}
//		List<WebElement> month = s.getOptions();
//		for (WebElement webElement : month) {
//			s.selectByVisibleText(webElement.getText());
//		}

//		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
//		driver.navigate().refresh();
//
//		Thread.sleep(10000);
//		WebElement mySelectElement = driver.findElement(By.name("dropdown"));
//		Select dropdown = new Select(mySelectElement);
//         if (dropdown.isMultiple()) {
//			System.out.println("True");
//		}
//         else {
//			System.out.println("False");
//		}
//		dropdown.selectByVisibleText("Automation Testing");
		
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//        WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		Select s=new Select(country);
//		if (s.isMultiple()) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False");
//		}
//		s.selectByVisibleText("India");
//		List<WebElement> allcountry = s.getOptions();
//		for (WebElement webElement : allcountry) {
//			s.selectByVisibleText(webElement.getText());
//		}
	}

}
