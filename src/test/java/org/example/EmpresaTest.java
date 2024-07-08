package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Alice", "São Paulo", "SP");
        empresa.contratar("Bob", "São Paulo", "SP");
        empresa.contratar("Charlie", "São Paulo", "SP");
        empresa.contratar("Dave", "Rio de Janeiro", "RJ");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Alice', cidade='São Paulo', uf='SP'}",
                "Funcionario{nome='Bob', cidade='São Paulo', uf='SP'}",
                "Funcionario{nome='Charlie', cidade='São Paulo', uf='SP'}",
                "Funcionario{nome='Dave', cidade='Rio de Janeiro', uf='RJ'}"
        );

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCidades() {
        Empresa empresa = new Empresa();
        empresa.contratar("Alice", "São Paulo", "SP");
        empresa.contratar("Bob", "São Paulo", "SP");
        empresa.contratar("Charlie", "São Paulo", "SP");
        empresa.contratar("Dave", "Rio de Janeiro", "RJ");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }
}