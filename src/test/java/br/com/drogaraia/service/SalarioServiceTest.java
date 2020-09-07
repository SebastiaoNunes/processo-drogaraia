package br.com.drogaraia.service;

import br.com.drogaraia.model.DadosSalario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalarioServiceTest {

    @Test
    public void deveCalcularSalario() {
        Double salario = Double.valueOf(900);
        Double percentualReajuste = Double.valueOf(0.05);

        SalarioService salarioService = new SalarioService();

        assertEquals(Double.valueOf(945), salarioService.calcularSalario(DadosSalario.create(salario, percentualReajuste)));
    }

    @Test
    public void deveCalcularSalarioArredondarParaNumeroImparMaisProximo() {
        Double salario = Double.valueOf(900);
        Double percentualReajuste = Double.valueOf(0.10);

        SalarioService salarioService = new SalarioService();

        assertEquals(Double.valueOf(991), salarioService.calcularSalario(DadosSalario.create(salario, percentualReajuste)));
    }
}
