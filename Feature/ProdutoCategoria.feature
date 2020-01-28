Feature: Consultar produto pela tela inicial 


@Buscaprodutocategoria @Valido
Scenario: busca produto por categoria valido 
	Given O usuário fornecido está na página inicial 
	When clicar na categoria selecionada 
	And clique no tablet escolhido 
	Then a página do tablet escolhido será escolhido 
	
@Buscaprodutocategoria @Invalido
Scenario: Pesquisando produto errado na tela principal 
	Given O usuário fornecido está na página inicial 
	When o Usuario clicar para ver detalhes do laptop 
	Then Será exibida a página de outro laptop 
	
    