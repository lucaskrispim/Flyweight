package org.example;

public class Funcionario {

    private String nome;
    private Cidade cidadeTrabalho;

    public Funcionario(String nome, Cidade cidadeTrabalho) {
        this.nome = nome;
        this.cidadeTrabalho = cidadeTrabalho;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeTrabalho.getNome() + '\'' +
                ", uf='" + cidadeTrabalho.getUf() + '\'' +
                '}';
    }
}
