package src.classes;

import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class Hersheys implements OvoPequeno, OvoMedio, OvoGrande {
  public enum Sizes {
    P, M, G
  }

  private Sizes size;

  public Hersheys(String size) {
    this.size = Sizes.valueOf(size);
  }

  @Override
  public void imprimirInfoProduto() {

    System.out.println("\n------ Hershey's ------\n");
    System.out.println("Tipo de chocolate: Chocolate ao leite");
    System.out.println("Recheado: Nao");
    System.out.println("Fabricante: Hershey's");
    System.out.println("Tamanho: " + size);
    System.out.println("C/Brinde: Nao");

  }

}
