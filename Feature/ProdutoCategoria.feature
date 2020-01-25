#language: pt
#coding: utf-8

Característica: Consultar produto pela tela principal

 
@BuscaprodutocategoriaValido
Cenário: busca produto por categoria valido
    Dado O usuário fornecido está na página inicial
    Quando clicar na categoria selecionada
    E clique no tablet escolhido
    Então a página do tablet escolhido será escolhido

@Buscaprodutoimageminvalido 
    Cenário: Pesquisando produto errado na tela principal
    Dado O usuário fornecido está na página inicial
    Quando o Usuario clicar para ver detalhes do laptop
    E clicar no laptop
    Então Será exibida a página de outro laptop