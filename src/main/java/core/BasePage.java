package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	static WebDriver driver = new FirefoxDriver();
	
	public static WebDriver getDriver() {
		
		driver.manage().window().setSize(new Dimension(1200, 765));
		
		return driver;
	}

	
	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public void abrirUrl(String url) {
		driver.get(url);

	}


	public void escrever(By by, String texto){
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public String validarTexto(String by) {
		return getDriver().findElement(By.xpath(by)).getText();
	
						
	}
	
	
	public void fecharBrowser() {
		driver.quit();

	}
}
