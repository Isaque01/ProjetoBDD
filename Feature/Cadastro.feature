Feature: Login ação

 
@Cadastrosucesso
Scenario: Página de Cadastro sucesso
     Given O usuário fornecido está na página inicial
     When o usuário navega para a página de cadastro
     And o usuário digita os dados corretos
     Then será direcionado para a página lougado
 @Cadastroexistente
Scenario: Página de Cadastro com erro
       Given O usuário fornecido está na página inicial
       When o usuário navega para a página de cadastro
       And o usuário digita os dados incorretos
       Then usuário não será cadastrado
    
   