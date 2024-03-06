package classes.qix;

import interfaces.ITenisSkate;

public class QixAllanMesquita implements ITenisSkate {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Skate -----");
    System.err.println("Modelo: Allan Mesquita");
    System.err.println("Valor: R$ 312,00");
  }

  @Override
  public void exibirTiposDeShape() {
  }
  
}
