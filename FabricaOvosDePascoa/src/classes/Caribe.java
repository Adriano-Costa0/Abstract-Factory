package src.classes;

import src.interfaces.OvoMedio;

public class Caribe implements OvoMedio {

  @Override
  public void imprimirInfoProduto() {
    System.out.println("\n------ Caribe ------\n");
    System.out.println("Tipo de chocolate: Chocolate com pedaços de goiabada");
    System.out.println("Recheado: Sim");
    System.out.println("Fabricante: Garoto");
    System.out.println("Tamanho: M");
    System.out.println("C/Brinde: Nao");
  }
  
}
