package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	
	private By kookie = By.xpath("/html/body/div[2]/div[2]/a[1]");
	
	private By pesquisa = By.xpath("//*[@id=\"input-search\"]");
	private By barra = By.xpath("/html/body/div[4]/div/main/section[1]/div[2]/header/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[3]/div/div");
	private By celular = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[5]/div/ul/li[1]/a/div[2]/img");
	private By cor = By.xpath("//*[@id=\"__next\"]/div/main/section[5]/div[2]/div/div/div[2]/div[1]/label/img");
	private By comprar = By.xpath("//*[@id=\"__next\"]/div/main/section[5]/div[7]/div[1]/button/label");
	private By agora = By.xpath("//*[@id=\"__next\"]/div/main/section[5]/div[6]/div[1]/button/label");
	private By validar = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[1]");
	
	public By getKookie() {
		return kookie;
	}

	public void setKookie(By kookie) {
		this.kookie = kookie;
	}

	public By getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(By pesquisa) {
		this.pesquisa = pesquisa;
	}

	public By getBarra() {
		return barra;
	}

	public void setBarra(By barra) {
		this.barra = barra;
	}

	public By getCelular() {
		return celular;
	}

	public void setCelular(By celular) {
		this.celular = celular;
	}

	public By getComprar() {
		return comprar;
	}

	public void setComprar(By comprar) {
		this.comprar = comprar;
	}

	public By getCor() {
		return cor;
	}

	public void setCor(By cor) {
		this.cor = cor;
	}

	public By getAgora() {
		return agora;
	}

	public void setAgora(By agora) {
		this.agora = agora;
	}

	public By getValidar() {
		return validar;
	}

	public void setValidar(By validar) {
		this.validar = validar;
	}

}
