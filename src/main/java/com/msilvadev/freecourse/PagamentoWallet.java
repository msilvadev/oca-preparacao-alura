package com.msilvadev.freecourse;

public class PagamentoWallet implements Pagamento {

    private static int totalLiquidacao = 0;

    @Override
    public void calculo(int i, int j) {
        totalLiquidacao = i * j;
    }

    @Override
    public void liquida() {
        totalLiquidacao += 10;
        System.out.println("PagamentoWallet >>> R$" + totalLiquidacao);
    }

}
