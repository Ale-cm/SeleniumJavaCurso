package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageSearch {
	private WebDriver driver;
	public PageSearch(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void busqueda(String buscar)
	{
		driver.findElement(By.name("as_word")).sendKeys(buscar,Keys.ENTER);

	}
	
}
