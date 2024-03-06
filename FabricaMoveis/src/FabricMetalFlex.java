import classes.Banco;
import classes.Cabideiro;
import classes.JanelaDeGrades;
import interfaces.AbstractFactory;
import interfaces.IIronFurniture;
import interfaces.IWoodFurniture;

public class FabricMetalFlex extends AbstractFactory {

  @Override
  public IWoodFurniture createWoodFurniture() {
    return new Cabideiro();
  }

  @Override
  public IIronFurniture createIronFurniture() {
    return new Banco();
  }

  public IIronFurniture createNewFurniture() {
    return new JanelaDeGrades();
  }

}
