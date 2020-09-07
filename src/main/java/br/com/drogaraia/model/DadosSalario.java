package br.com.drogaraia.model;

public class DadosSalario {

    private Double salario;
    private Double percentualReajuste;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPercentualReajuste() {
        return percentualReajuste;
    }

    public void setPercentualReajuste(Double percentualReajuste) {
        this.percentualReajuste = percentualReajuste;
    }

    public static DadosSalario create(Double salario, Double percentualReajuste) {
        DadosSalario dadosSalario = new DadosSalario();

        dadosSalario.salario = salario;
        dadosSalario.percentualReajuste = percentualReajuste;
        return dadosSalario;
    }
}
