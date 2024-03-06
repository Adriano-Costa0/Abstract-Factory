package classes.qix;

import interfaces.ITenisSkate;

public class QixCombat implements ITenisSkate {

  @Override
  public void exibirInfoProduto() {
    System.err.println("\n----- Tenis Skate -----");
    System.err.println("Modelo: Qix Combat");
    System.err.println("Valor: R$ 269,90");
  }

  @Override
  public void exibirTiposDeShape() {
  }
  
}
