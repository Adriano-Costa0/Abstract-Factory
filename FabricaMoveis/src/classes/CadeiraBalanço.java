package classes;

import interfaces.IIronFurniture;

public class CadeiraBalanço implements IIronFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Cadeira de Balanço Plus Inox #######\n");
    System.out.println("Tipo: Inox reforjado");
    System.out.println("Peso: 25kg");
    System.out.println("Medidas: 250x230 mm");
  }

  @Override
  public void definirSerralheiro(String nome) {
    System.out.println("Cadeira de Balanço de metal fabricado por: " + nome + " !");
  }

}
