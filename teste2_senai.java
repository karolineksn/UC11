package UC11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste2_senai {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test
	public void testeNavegador() {
		driver.get("https://www.mercadolivre.com.br/");
		driver.findElement(By.id("cb1-edit")).sendKeys("celular");
		driver.findElement(By.className("nav-search-btn")).click();
	
	}
	

}
