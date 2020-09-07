package br.com.drogaraia.service;

public class ArrayService {

    private int[] elementos;

    public ArrayService(int[] elementos) {
        this.elementos = elementos;
    }

    public int exibirConteudoByPosicao(int posicao) {
        return this.elementos[posicao];
    }
}
