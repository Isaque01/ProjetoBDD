#language: pt
#coding: utf-8

Característica: Pesquisa ação

 
@Buscadeprodutos
Cenário: Página de Busca Produto valido
    Dado O usuário fornecido está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto
    Então será direcionado para a página produtos
    
@Buscadeprodutoerro    
    Cenário: Página de Busca Produto Erro
    Dado O usuário fornecido está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto invalido
    Então será direcionado para a página produtos não existente