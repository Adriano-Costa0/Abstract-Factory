import classes.qix.QixAllanMesquita;
import classes.qix.QixCombat;
import classes.qix.QixContext;
import interfaces.IAbstractFactory;
import interfaces.ITenisCorrida;
import interfaces.ITenisSkate;

public class QixFabric extends IAbstractFactory {

  @Override
  public ITenisCorrida criarTenisCorrida() {
    return new QixContext();
  }

  @Override
  public ITenisSkate criarTenisSkate() {
    return new QixAllanMesquita();
  }

  public ITenisSkate criarNovoTenisSkate() {
    return new QixCombat();
  }

}
