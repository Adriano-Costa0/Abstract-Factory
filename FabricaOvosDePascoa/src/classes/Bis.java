package src.classes;

import src.interfaces.OvoPequeno;

public class Bis implements OvoPequeno{

  @Override
  public void imprimirInfoProduto() {
    System.out.println("\n------ Bis ------\n");
    System.out.println("Tipo de chocolate: Chocolate com wafer");
    System.out.println("Recheado: Sim");
    System.out.println("Fabricante: Nestle");
    System.out.println("Tamanho: P");
    System.out.println("C/Brinde: Sim");
  }
  
}
