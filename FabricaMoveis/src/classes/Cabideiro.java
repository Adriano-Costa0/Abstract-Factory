package classes;

import javax.swing.JOptionPane;

import interfaces.IWoodFurniture;

public class Cabideiro implements IWoodFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Cabideiro de Madeira Rustica #######\n");
    System.out.println("Tipo: Madeira maçiça alaranjada");
    System.out.println("Peso: 5kg");
    System.out.println("Medidas: 1200x60 mm");
    System.out.println("Descrição: Cabideiro com suporte até 6 peças simultaneas!");

  }

  @Override
  public void definirCarpinteiro(String nome) {
    JOptionPane.showMessageDialog(null, "Movel criado por " + nome);
  }

}
