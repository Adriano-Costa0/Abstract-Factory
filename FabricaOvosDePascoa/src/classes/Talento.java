package src.classes;

import src.interfaces.OvoGrande;

public class Talento implements OvoGrande {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Talento ------\n");
        System.out.println("Tipo de chocolate: Chocolate com castanhas");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Garoto");
        System.out.println("Tamanho: G");
        System.out.println("C/Brinde: Sim");
    }

}
