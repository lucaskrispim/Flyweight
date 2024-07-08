package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(String nomeFuncionario, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Funcionario funcionario = new Funcionario(nomeFuncionario, cidade);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }
}