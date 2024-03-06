package classes;

import javax.swing.JOptionPane;

import interfaces.IWoodFurniture;

public class Banqueta implements IWoodFurniture {

  @Override
  public void showInfoProduct() {
    System.out.println("\n####### Banqueta retro de madeira #######\n");
    System.out.println("Tipo: Madeira verde");
    System.out.println("Peso: 9kg");
    System.out.println("Medidas: 120x80 mm");
  }

  @Override
  public void definirCarpinteiro(String nome) {
    JOptionPane.showMessageDialog(null, "Movel criado por " + nome);
  }
  
}
