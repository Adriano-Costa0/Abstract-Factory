package src;

import src.classes.FerreiroRocher;
import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FactoryFerreiroRocher extends AbstractEggFactory {

  @Override
  public OvoPequeno criarOvoPequeno() {
    return new FerreiroRocher("P");
  }
  
  @Override
  public OvoMedio criarOvoMedio() {
    return new FerreiroRocher("M");
  }
  
  @Override
  public OvoGrande criarOvoGrande() {
    return new FerreiroRocher("G");
  }
  
}
