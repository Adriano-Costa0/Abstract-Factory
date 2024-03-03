package src.classes;

import src.interfaces.OvoGrande;

public class OuroBranco implements OvoGrande {

  @Override
  public void imprimirInfoProduto() {
    System.out.println("\n------ Ouro Branco ------\n");
    System.out.println("Tipo de chocolate: Chocolate branco com wafer");
    System.out.println("Recheado: Sim");
    System.out.println("Fabricante: Lacta");
    System.out.println("Tamanho: G");
    System.out.println("C/Brinde: Sim");
  }
  
}
