package com.eu_eu_mesmo_e_bdd.steps;

import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class CriaContaSteps {

    private String cpf;
    private String endereco;
    private boolean cpfValido;
    private boolean maiorDeIdade;
    private boolean contaCriada;

    @Dado("que o cliente informa seu CPF e endereço")
    public void que_o_cliente_informa_seu_CPF_e_endereco() {
        this.cpf = "123.456.789-00";
        this.endereco = "Rua Exemplo, 123";
    }

    @E("o CPF é válido")
    public void o_CPF_e_valido() {
        this.cpfValido = true;
    }

    @E("o cliente é maior de idade")
    public void o_cliente_e_maior_de_idade() {
        this.maiorDeIdade = true;
    }

    @Quando("ele envia os dados para criação da conta")
    public void ele_envia_os_dados_para_criacao_da_conta() {
        if (cpfValido && maiorDeIdade) {
            contaCriada = true;
        } else {
            contaCriada = false;
        }
    }

    @Então("a conta deve ser criada com sucesso")
    public void a_conta_deve_ser_criada_com_sucesso() {
        assertTrue("A conta deveria ser criada", contaCriada);
    }
}
