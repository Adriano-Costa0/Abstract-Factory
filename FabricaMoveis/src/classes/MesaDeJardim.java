package classes;

import javax.swing.JOptionPane;

import interfaces.IWoodFurniture;

public class MesaDeJardim implements IWoodFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Mesa de Madeira Eucalipto #######\n");
    System.out.println("Tipo: Madeira pinus estilo escalipto");
    System.out.println("Peso: 56kg");
    System.out.println("Medidas: 3000x400 mm");
    System.out.println("Descrição: Mesa de madeira com acabamento em metais platinus!");
  }

  @Override
  public void definirCarpinteiro(String nome) {
    JOptionPane.showMessageDialog(null, "Movel criado por " + nome);
  }

}
