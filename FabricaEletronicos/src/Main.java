import interfaces.AbstractFactory;
import interfaces.IIronFurniture;
import interfaces.IWoodFurniture;

public class Main {
  public static void main(String[] args) {
    AbstractFactory metalFlex = new FabricMetalFlex();
    AbstractFactory impactoMoveis = new FabricaImpactoMoveis();

    IIronFurniture movelMetalMF = metalFlex.createIronFurniture();
    IWoodFurniture movelMadeiraMF = metalFlex.createWoodFurniture();

    movelMetalMF.definirSerralheiro("Sergio Ramos");
    movelMetalMF.showInfoProduct();
    movelMadeiraMF.showInfoProduct();

    IIronFurniture movelMetalIM = impactoMoveis.createIronFurniture();
    IWoodFurniture movelMadeiraIM = impactoMoveis.createWoodFurniture();

    movelMetalIM.definirSerralheiro("Adriano Costa Ltda");
    movelMetalIM.showInfoProduct();
    movelMadeiraIM.showInfoProduct();

    IIronFurniture novoMovelMF = ((FabricMetalFlex) metalFlex).createNewFurniture();
    IWoodFurniture novoMovelIM = ((FabricaImpactoMoveis) impactoMoveis).createNewFurniture();

    novoMovelMF.showInfoProduct();
    novoMovelIM.showInfoProduct();

    novoMovelIM.definirCarpinteiro("Rei da Madeira Ltda");

  }
}