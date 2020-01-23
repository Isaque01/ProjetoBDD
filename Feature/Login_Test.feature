#language: pt
#coding: utf-8

Característica: Login ação

 

Cenário: Login bem-sucedido com credenciais válidas
    Quando O usuário fornecido está na página inicial
    Quando o usuário navega para a página de login
    E o usuário digita o nome de usuário e a senha
    Então Mensagem exibida Login com êxito
 
Cenário: Logoff bem-sucedido
Quando o Logoff do Usuário do Aplicativo
Então Mensagem exibida Logout com êxito