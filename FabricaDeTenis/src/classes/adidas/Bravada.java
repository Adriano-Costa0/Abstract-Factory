package classes.adidas;

import interfaces.ITenisSkate;

public class Bravada implements ITenisSkate {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Skate -----");
    System.err.println("Modelo: Bravada");
    System.err.println("Valor: R$ 600,00");
  }

  @Override
  public void exibirTiposDeShape() {
  }
  
}
