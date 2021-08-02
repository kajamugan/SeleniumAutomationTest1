import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class TestGoogle {
			void tc_testGoogleSearch(){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
			    WebDriver browser = new ChromeDriver();
			    browser.get("https://www.google.com");
			    browser.findElement(By.xpath("//input[@name='q']")).getAttribute("gmail");
			    browser.findElement(By.xpath("//input[@name='btnK']")).click();
			    
			    	
			}

public static void main(String[] args) throws Exception {
	TestGoogle test = new TestGoogle();
	test.tc_testGoogleSearch();
	
}
}

