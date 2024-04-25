#Author: diegosn.51@gmail.com

@pesquisa
Feature: Eu como usuario quero acessar o site e realizar uma compra
  

  @pesquisa
  Scenario: Acessar a page comra
    Given quando eu acessar a page "https://www.magazineluiza.com.br/"
    
    When clicar em um  produto 
    And ser direcionado para a tela de pagamento
    Then finalizo a compra no site
   

 

   