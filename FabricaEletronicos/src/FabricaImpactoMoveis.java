import classes.Banco;
import classes.Banqueta;
import classes.MesaDeJardim;
import interfaces.AbstractFactory;
import interfaces.IIronFurniture;
import interfaces.IWoodFurniture;

public class FabricaImpactoMoveis extends AbstractFactory {

  @Override
  public IWoodFurniture createWoodFurniture() {
    return new Banqueta();
  }

  @Override
  public IIronFurniture createIronFurniture() {
    return new Banco();
  }

  public IWoodFurniture createNewFurniture() {
    return new MesaDeJardim();
  }

}
