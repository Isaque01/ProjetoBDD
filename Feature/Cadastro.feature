#language: pt
#coding: utf-8

Característica: Login ação

 

Cenário: Página de Cadastro sucesso
    Dado O usuário fornecido está na página inicial
    Quando o usuário navega para a página de cadastro
    E o usuário digita os dados corretos
    Então será direcionado para a página lougado
 
Cenário: Página de Cadastro com erro
    Dado O usuário fornecido está na página inicial
    Quando o usuário navega para a página de cadastro
    E o usuário digita os dados incorretos
    Então usuário não será cadastrado
    