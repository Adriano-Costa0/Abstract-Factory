import interfaces.IAbstractFactory;
import interfaces.ITenisCorrida;
import interfaces.ITenisSkate;

public class Main{
  public static void main(String[] args) {
    IAbstractFactory adidas = new AdidasFabric();
    IAbstractFactory qix = new QixFabric();

    ITenisSkate adidasSkate = adidas.criarTenisSkate();
    ITenisCorrida adidasCorrida = adidas.criarTenisCorrida();

    ITenisSkate qixSkate = qix.criarTenisSkate();
    ITenisCorrida qixCorrida = qix.criarTenisCorrida();

    adidasSkate.exibirInfoProduto();
    adidasSkate.exibirTiposDeShape();

    adidasCorrida.exibirInfoProduto();
    adidasCorrida.calcularEstimativaDeDuracaoPorTerreno();

    qixSkate.exibirInfoProduto();
    qixSkate.exibirTiposDeShape();

    qixCorrida.exibirInfoProduto();
    qixCorrida.calcularEstimativaDeDuracaoPorTerreno();


    ITenisCorrida novoTenisAdidas = ((AdidasFabric) adidas).criarNovoTenisCorrida();
    ITenisSkate novoTenisQix = ((QixFabric) qix).criarNovoTenisSkate();

    novoTenisAdidas.exibirInfoProduto();
    novoTenisQix.exibirInfoProduto();
    
  }
}