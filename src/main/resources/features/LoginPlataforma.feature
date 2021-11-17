# language: pt

Funcionalidade: Acessar Portal de Credito
  
@teste1
Cenário: Tentativa de Login com e-mail inválido

Dado que eu esteja na tela de Login da Plataforma
Quando insiro um email inválido no formulário
Entao deve ser apresentado a mensagem abaixo do campo "Deve ser um e-mail válido"

@teste2
Cenário: Tentativa de Login com senha incompleta

Dado que eu esteja na tela de Login da Plataforma
Quando insiro uma senha incompleta
Entao deve ser apresentado "O valor é muito curto" informando a senha incompleta
