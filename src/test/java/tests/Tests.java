package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageSearch;

public class Tests {
	private WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mercadolibre.com.ar/");
		
		Helpers help =new Helpers();
		help.helps(5);
	}
	 
	@Test 
	public void pruebaUno() {
		PageSearch pageSearch = new PageSearch(driver); 
		pageSearch.busqueda("camion");
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/main/div/div[1]/aside/div[1]/h1")).getText().contains("Camion")); 
	}
	 
	 
		@Test 
		public void pruebaDos() {
			PageSearch pageSearch = new PageSearch(driver); 
			pageSearch.busqueda("zapatatillas");
			Assert.assertTrue(driver.findElement(By.xpath("/html/body/main/div/div[1]/aside/div[1]/h1")).getText().contains("Camion")); 
		}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

