Feature: Cadastro de Usuario Pela Pagina inicial

 
@Cadastro @sucesso
Scenario: Página de Cadastro sucesso
     Given O usuário fornecido está na página inicial
     When o usuário navega para a página de cadastro
     And o usuário digita os dados corretos
     Then será direcionado para a página lougado
 
 @Cadastro @existente
Scenario: Página de Cadastro com erro
       Given O usuário fornecido está na página inicial
       When o usuário navega para a página de cadastro
       And o usuário digita os dados incorretos
       Then usuário não será cadastrado
    
   