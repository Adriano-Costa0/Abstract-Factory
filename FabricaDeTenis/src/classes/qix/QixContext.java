package classes.qix;

import interfaces.ITenisCorrida;

public class QixContext implements ITenisCorrida {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Corrida -----");
    System.err.println("Modelo: Qix Contest");
    System.err.println("Valor: R$ 400,00");
  }

  @Override
  public void calcularEstimativaDeDuracaoPorTerreno() {
    System.out.println("Estrada de terra: 190 Dias");
    System.out.println("Asfalto: 110 Dias");
    System.out.println("Esteira: 187 Dias");
  }
  
}
