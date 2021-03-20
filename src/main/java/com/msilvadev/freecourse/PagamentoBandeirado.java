package com.msilvadev.freecourse;

public class PagamentoBandeirado implements Pagamento {

    private static int totalLiquidacao = 0;

    @Override
    public void calculo(int i, int j) {
        totalLiquidacao = i - j;
    }

    @Override
    public void liquida() {
        System.out.println("PagamentoBandeirado >>> R$" + totalLiquidacao);
    }
}
