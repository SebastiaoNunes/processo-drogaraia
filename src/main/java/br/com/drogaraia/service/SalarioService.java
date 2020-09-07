package br.com.drogaraia.service;

import br.com.drogaraia.model.DadosSalario;

public class SalarioService {

    private static final int FATOR_IMPAR = 1;

    public Double calcularSalario(DadosSalario dadosSalario) {
        Double salarioAtualizado = dadosSalario.getSalario() + (dadosSalario.getSalario() * dadosSalario.getPercentualReajuste());

        if (isNumeroPar(salarioAtualizado)) {
            return salarioAtualizado + FATOR_IMPAR;
        }

        return salarioAtualizado;
    }

    private boolean isNumeroPar(Double salario) {
        return (salario % 2 == 0);
    }
}
