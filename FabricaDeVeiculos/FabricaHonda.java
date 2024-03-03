public class FabricaHonda implements IFabricaDeCarros {

    @Override
    public ICarroSedan CriarCarroSedan() {
        return new Corolla();
    }

    @Override
    public ICarroSuv CriarCarroSuv() {
        return new CorollaCross();

    }

}
