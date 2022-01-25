package first;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pratbehe\\\\Desktop\\\\Personal\\\\Selenium\\\\Used Jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver CDrv = new ChromeDriver();
		CDrv.get("http://the-internet.herokuapp.com/tables");
		WebElement table = CDrv.findElement(By.xpath("//*[@id=\"table1\"]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement ele : rows)
		{
			List<WebElement> cols = table.findElements(By.tagName("td"));
			for(WebElement colval: cols)
			{
				System.out.println(colval.getText());
				
			}
		}
			
CDrv.quit();
	}

}
