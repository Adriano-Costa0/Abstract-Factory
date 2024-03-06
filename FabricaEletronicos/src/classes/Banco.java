package classes;

import interfaces.IIronFurniture;

public class Banco implements IIronFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Banco de Inox premium ultrasize #######\n");
    System.out.println("Tipo: Inox");
    System.out.println("Peso: 30kg");
    System.out.println("Medidas: 300x50 mm");
  }

  @Override
  public void definirSerralheiro(String nome) {
    System.out.println("Banco de metal fabricado por: " + nome + " !");
  }

}
