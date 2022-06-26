package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
WebDriver driver;

public void acessarSistema(String url) {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println("--- Iniciando o teste! -----");				
}
public void encerrarSistema() {
	driver.quit();
	System.out.println("---Teste ENcerrado----");
}
public void escrever(By elemento, String pesquisa) {
	driver.findElement(elemento).sendKeys(pesquisa);
	
	
}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}
}
