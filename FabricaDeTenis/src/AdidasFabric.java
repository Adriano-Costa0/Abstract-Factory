import classes.adidas.Bravada;
import classes.adidas.Supernova;
import classes.adidas.UltraBoost;
import interfaces.IAbstractFactory;
import interfaces.ITenisCorrida;
import interfaces.ITenisSkate;

public class AdidasFabric extends IAbstractFactory {

  @Override
  public ITenisCorrida criarTenisCorrida() {
   return new Supernova();
  }

  @Override
  public ITenisSkate criarTenisSkate() {
    return new Bravada();
  }

  public ITenisCorrida criarNovoTenisCorrida(){
    return new UltraBoost();
  }
  
}
