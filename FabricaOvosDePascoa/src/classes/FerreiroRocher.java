package src.classes;

import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FerreiroRocher implements OvoPequeno, OvoMedio, OvoGrande {
  public enum Sizes {
    P, M, G
  }

  private Sizes size;

  public FerreiroRocher(String size) {
    this.size = Sizes.valueOf(size);
  }

  @Override
  public void imprimirInfoProduto() {

    System.out.println("\n------ Ferreiro Rocher ------\n");
    System.out.println("Tipo de chocolate: Chocolate com castanhas");
    System.out.println("Recheado: Sim");
    System.out.println("Fabricante: Ferreiro Rocher");
    System.out.println("Tamanho: " + size);
    System.out.println("C/Brinde: Sim");

  }

}
