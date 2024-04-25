package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Teste {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("quando eu acessar a page {string}")
	public void quando_eu_acessar_a_page(String site) {
		metodo.abrinavegador(site);

	}

	@When("clicar em um  produto")
	public void clicar_em_um_produto() {

		metodo.clicar(el.getKookie());
		metodo.clicar(el.getPesquisa());
		// metodo.pausa(2000);
		metodo.clicar(el.getBarra());
		// metodo.pausa(2000);
		metodo.clicar(el.getCelular());
		// metodo.clicar(el.getCor());
		metodo.pausa(2000);
		metodo.clicar(el.getComprar());

	}

	@When("ser direcionado para a tela de pagamento")
	public void ser_direcionado_para_a_tela_de_pagamento() {
		metodo.clicar(el.getAgora());
	}

	@Then("finalizo a compra no site")
	public void finalizo_a_compra_no_site() throws IOException {
		System.out.println("======= compra realizada com sucesso =========");
		metodo.validar("Quero criar uma conta", el.getValidar());
		metodo.Foto("continuar");
		//metodo.Fechar();
	}
	
	


}
