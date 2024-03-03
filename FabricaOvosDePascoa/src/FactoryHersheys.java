package src;

import src.classes.Hersheys;
import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FactoryHersheys extends AbstractEggFactory {

  @Override
  public OvoPequeno criarOvoPequeno() {
    return new Hersheys("P");
  }

  @Override
  public OvoMedio criarOvoMedio() {
    return new Hersheys("M");
  }

  @Override
  public OvoGrande criarOvoGrande() {
    return new Hersheys("G");
  }

}