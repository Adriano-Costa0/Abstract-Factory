public class Main {
  public static void main(String[] args) {
    Civic civic = new Civic();
    Corolla corolla = new Corolla();
    CorollaCross corollaCross = new CorollaCross();
    FabricaHonda fabricHonda = new FabricaHonda();
    Hrv hrv = new Hrv();
    Rav4 rav4 = new Rav4();
    CRV crv = new CRV();


    civic.exibirInfoSedan();
    corolla.exibirInfoSedan();
    corollaCross.exibirInfoSuv();
    hrv.exibirInfoSuv();
    rav4.exibirInfoSuv();
    crv.exibirInfoSuv();

    fabricHonda.CriarCarroSedan();

  }
}
