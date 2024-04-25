package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	/**
	 * metodo para abrir o navegador da web
	 * 
	 * @author Diego
	 * 
	 */

	public void abrinavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("===== Erro ao tentar abrir a page =======" + e.getMessage());

		}

	}

	/**
	 * metodo para escrever em um elemento da page
	 * 
	 * @param Elemento
	 * @param Texto
	 */

	public void escrever(By Elemento, String Texto) {
		try {
			driver.findElement(Elemento).sendKeys(Texto);
		} catch (Exception e) {
			System.err.println("===== Erro ao tentar escrever em um elemento web =====" + e.getCause());

		}

	}

	/**
	 * metodo para clicar em um elemento da page
	 * 
	 * @param Elemento
	 */

	public void clicar(By Elemento) {

		try {
			driver.findElement(Elemento).click();
		} catch (Exception e) {
			System.err.println("===== erro ao tentar clicar em um elemento web =====" + e.getCause());

		}
	}

	/**
	 * metodo para dar uma pausa na page e achar os elementos
	 * 
	 * @param Tempo
	 */
	public void pausa(int Tempo) {
		try {

			Thread.sleep(Tempo);

		} catch (Exception e) {
			System.err.println("===== Erro ao dar uma pausa na page =====" + e.getMessage());

		}

	}

	/**
	 * metodo para fechar a page depois de realizar o teste
	 */
	public void Fechar() {

		try {

			driver.quit();

		} catch (Exception e) {
			System.err.println("Erro ao tentar fechar page ao final do test =====" + e.getCause());
		}

	}

	/**
	 * metodo para tirar screenshort da page
	 * 
	 * @param nome
	 * @throws IOException
	 */

	public void Foto(String nome) throws IOException {

		TakesScreenshot Foto = ((TakesScreenshot) driver);
		File srcfile = Foto.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencia/" + nome + ".png");
		FileUtils.copyFile(srcfile, destFile);

		try {

		} catch (Exception e) {

			System.err.println("===== Erro ao tentar tirar foto da page =====" + e.getCause());

		}

	}

	/**
	 * metodo para validar um resuldado esperado do test
	 * 
	 * @param textoEsperado
	 * @param elemento
	 */
	public void validar(String textoEsperado, By elemento) {

		try {

			String textoCapturado = driver.findElement(elemento).getText();

			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			System.err.println("===== Erro ao tentar validar o textoEsperado =====" + e.getMessage());
		}

	}

}
