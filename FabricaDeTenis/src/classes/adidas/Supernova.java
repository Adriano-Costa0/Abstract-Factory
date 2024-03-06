package classes.adidas;

import interfaces.ITenisCorrida;

public class Supernova implements ITenisCorrida {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Corrida -----");
    System.err.println("Modelo: Adidas Supernova");
    System.err.println("Valor: R$ 339,00");
  }

  @Override
  public void calcularEstimativaDeDuracaoPorTerreno() {
    System.out.println("Estrada de terra: 152 Dias");
    System.out.println("Asfalto: 110 Dias");
    System.out.println("Esteira: 170 Dias");
  }
  
}
