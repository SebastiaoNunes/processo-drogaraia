package br.com.drogaraia.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayServiceTest {

    @Test
    public void deveExibirConteudoDoArrayByPosicao() {
        int[] elementos = {1, 2, 5, 8, 9};
        ArrayService arrayService = new ArrayService(elementos);

        int posicaoZero = 0;
        int posicaoUm = 1;
        int posicaoDois = 2;
        int posicaoTres = 3;
        int posicaoQuatro = 4;

        assertEquals(1, arrayService.exibirConteudoByPosicao(posicaoZero));
        assertEquals(2, arrayService.exibirConteudoByPosicao(posicaoUm));
        assertEquals(5, arrayService.exibirConteudoByPosicao(posicaoDois));
        assertEquals(8, arrayService.exibirConteudoByPosicao(posicaoTres));
        assertEquals(9, arrayService.exibirConteudoByPosicao(posicaoQuatro));
    }
}
