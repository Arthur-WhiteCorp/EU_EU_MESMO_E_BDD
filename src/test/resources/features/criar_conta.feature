# language: pt

Funcionalidade: Criação simplificada de contas bancárias
  Como um possível cliente
  Quero criar uma conta no banco
  Para facilitar o acesso aos serviços bancários

  Cenário: Criação de conta por um cliente maior de idade
    Dado que o cliente informa seu CPF e endereço
      E o CPF é válido
      E o cliente é maior de idade
    Quando ele envia os dados para criação da conta
    Então a conta deve ser criada com sucesso
