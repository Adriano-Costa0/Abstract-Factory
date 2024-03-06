package classes.adidas;

import interfaces.ITenisCorrida;

public class UltraBoost implements ITenisCorrida {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Corrida -----");
    System.err.println("Modelo: Adidas Ultra Boost");
    System.err.println("Valor: R$ 899,00");
  }

  @Override
  public void calcularEstimativaDeDuracaoPorTerreno() {
    System.out.println("Estrada de terra: 150 Dias");
    System.out.println("Asfalto: 120 Dias");
    System.out.println("Esteira: 180 Dias");
  }

}
