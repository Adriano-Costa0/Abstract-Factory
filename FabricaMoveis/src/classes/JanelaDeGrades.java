package classes;

import interfaces.IIronFurniture;

public class JanelaDeGrades implements IIronFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Janela de grades 2000X1500 #######\n");
    System.out.println("Tipo: Metal nobre de vibranium");
    System.out.println("Peso: 12kg");
    System.out.println("Medidas: 2000x1500 mm");
  }

  @Override
  public void definirSerralheiro(String nome) {
    System.out.println("Janela de grades de metal fabricado por: " + nome + " !");
  }

}
