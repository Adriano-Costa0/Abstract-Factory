public class FabricaToyota implements IFabricaDeCarros {

    @Override
    public ICarroSedan CriarCarroSedan() {
        return new Civic();
    }

    @Override
    public ICarroSuv CriarCarroSuv() {
        return new Hrv();
    }
    
}
